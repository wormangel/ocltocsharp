import java.io.IOException;
import java.util.StringTokenizer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmiParser {
	
	private Document doc;
	
	private final static String XMI_PATH = "testfiles/xmi/profe.uml2";
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException{
		
		// Testes
		boolean teste = isValidPath("Cartao", "proprietario.nome");
		System.out.println(teste);
		return;
		//boolean testey = isValidPath("Cliente", "nomse");
		//System.out.println(teste);
	}
	
	public static boolean isValidClass(String className) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(XMI_PATH);		
		
		XPathFactory xPathFactory = XPathFactory.newInstance();
		XPath xpath = xPathFactory.newXPath();
		xpath.setNamespaceContext(new PersonalNamespaceContext());
		XPathExpression expr = xpath.compile(String.format("//ownedMember[@xmi:type='uml:Class'][@name='%s']", className));
		Object result = expr.evaluate(doc, XPathConstants.NODESET);
		if (result != null){
			NodeList nodes = (NodeList) result;
			if (nodes.getLength() > 0)
				return true;
		}
		return false;
	}
	
	public static boolean isValidAttribute(String className, String attribute) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(XMI_PATH);		
		
		XPathFactory xPathFactory = XPathFactory.newInstance();
		XPath xpath = xPathFactory.newXPath();
		xpath.setNamespaceContext(new PersonalNamespaceContext());
		XPathExpression expr = xpath.compile(String.format("//ownedMember[@xmi:type='uml:Class'][@name='%s']/ownedAttribute[@name='%s']", className, attribute));
		Object result = expr.evaluate(doc, XPathConstants.NODESET);
		if (result != null){
			NodeList nodes = (NodeList) result;
			if (nodes.getLength() > 0)
				return true;
		}
		return false;
	}
	
	public static boolean isValidOperation(String className, String operation) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(XMI_PATH);		
		
		XPathFactory xPathFactory = XPathFactory.newInstance();
		XPath xpath = xPathFactory.newXPath();
		xpath.setNamespaceContext(new PersonalNamespaceContext());
		XPathExpression expr = xpath.compile(String.format("//ownedMember[@xmi:type='uml:Class'][@name='%s']/ownedOperation[@name='%s']", className, operation));
		Object result = expr.evaluate(doc, XPathConstants.NODESET);
		if (result != null){
			NodeList nodes = (NodeList) result;
			if (nodes.getLength() > 0)
				return true;
		}
		return false;
	}
	
	// Espera receber uma expressao como Cliente.programa.parceiros e verifica se eh valida, navegavel
	// Provavelmente nao funciona com metodos
	public static boolean isValidPath(String context, String path) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException{
		
		if (!isValidClass(context)) return false;	
		
		// Separa string por pontos
		StringTokenizer tokenizer = new StringTokenizer(path, ".");
		
		String[] ids = new String[tokenizer.countTokens()];
		
		for(int i = 0; i <= tokenizer.countTokens(); i++){
			ids[i] = tokenizer.nextToken();
		}
		
		String source = context;
		String destination;
		
		for(int i = 0; i < ids.length; i++){
			destination = ids[i];
			if (!isValidStep(source, destination)){
				return false;
			}
			source = getAssociationName(context,destination);
		}
		return true;
		
	}
	
	private static boolean isValidStep(String context, String destination) throws SAXException, IOException, ParserConfigurationException, XPathExpressionException{
		boolean resultAttribute = isValidAttribute(context, destination);
		boolean resultOperation = isValidOperation(context, destination);
		boolean resultAssociation = isValidAssociation(context, destination);
		
		return resultAttribute || resultOperation || resultAssociation;
	}

	private static boolean isValidAssociation(String context, String destination) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(XMI_PATH);		
		
		XPathFactory xPathFactory = XPathFactory.newInstance();
		XPath xpath = xPathFactory.newXPath();
		xpath.setNamespaceContext(new PersonalNamespaceContext());
		XPathExpression expr = xpath.compile(String.format("//ownedMember[@xmi:type='uml:Class'][@name='%s']/ownedAttribute[@name='%s'][@association!='null']", context, destination));
		Object result = expr.evaluate(doc, XPathConstants.NODESET);
		if (result != null){
			NodeList nodes = (NodeList) result;
			if (nodes.getLength() > 0)
				return true;
		}
		return false;
	}
	
	// Recupera o nome da classe de um atributo-associacao (parceiros - ParceiroPrograma, por exemplo) ou retorna o nome do atributo como foi passado se a dada
	// classe nao for associacao
	private static String getAssociationName(String context, String attribute) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException {
		
		if(!isValidAssociation(context, attribute))
			return attribute;
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(XMI_PATH);		
		
		XPathFactory xPathFactory = XPathFactory.newInstance();
		XPath xpath = xPathFactory.newXPath();
		xpath.setNamespaceContext(new PersonalNamespaceContext());
		XPathExpression expr = xpath.compile(String.format("//ownedMember[@xmi:type='uml:Class'][@name='%s']/ownedAttribute[@name='%s']", context, attribute));
		Object result = expr.evaluate(doc, XPathConstants.NODESET);
		
		String idAssociation = "";
		if (result != null){
			NodeList nodes = (NodeList) result;
			if (nodes.getLength() > 0)
				idAssociation = nodes.item(0).getAttributes().getNamedItem("association").getNodeValue();
		}
		
		String idContext = "";
		expr = xpath.compile(String.format("//ownedMember[@xmi:type='uml:Class'][@name='%s']", context, attribute));
		result = expr.evaluate(doc, XPathConstants.NODESET);
		if (result != null){
			NodeList nodes = (NodeList) result;
			if (nodes.getLength() > 0)
				idContext = nodes.item(0).getAttributes().getNamedItem("xmi:id").getNodeValue();
		}
		
		String associationName = "";
		expr = xpath.compile(String.format("//ownedMember[@xmi:type='uml:Class']/ownedAttribute[@type='%s'][@association='%s']", idContext, idAssociation));
		result = expr.evaluate(doc, XPathConstants.NODESET);
		if (result != null){
			NodeList nodes = (NodeList) result;
			if (nodes.getLength() > 0)
				associationName = nodes.item(0).getParentNode().getAttributes().getNamedItem("name").getNodeValue();
		}
		
		return associationName;
	}
	
}
