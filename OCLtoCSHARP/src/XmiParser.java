import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmiParser {
	
	private Document doc;
	
	private final static String XMI_PATH = "testfiles/xmi/profe.uml2";
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException{
		
		// Testes
		
		boolean teste = isValidClass("ProgramaFidelidade");
		System.out.println(teste);
		teste = isValidAttribute("Cliente", "nome");
		System.out.println(teste);
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
	// TODO Metodo incompleto
	public static boolean isValidPath(String context, String path) throws ParserConfigurationException, SAXException, IOException, XPathExpressionException{
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(XMI_PATH);		
		
		// Separa string por pontos
		String[] ids = path.split(".");
		
		XPathFactory xPathFactory = XPathFactory.newInstance();
		XPath xpath = xPathFactory.newXPath();
		xpath.setNamespaceContext(new PersonalNamespaceContext());
		XPathExpression expr = xpath.compile(String.format("//ownedMember[@xmi:type='uml:Class'][@name='%s']", context));
		
		// Verifica se tem um atributo ou operacao
		
		Object result = expr.evaluate(doc, XPathConstants.NODESET);
		if (result != null){
			NodeList nodes = (NodeList) result;
			if (nodes.getLength() > 0)
				return true;
		}
		return true;	
	}
}
