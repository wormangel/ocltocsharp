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
		boolean teste = isValidClass("ProgramaFidelidade");
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
		XPathExpression expr = xpath.compile(String.format("//ownedMember[@xmi:type='uml:Class']"));
		Object result = expr.evaluate(doc, XPathConstants.NODESET);
		if (result != null){
			NodeList nodes = (NodeList) result;
			for(int i = 0; i < nodes.getLength(); i++){
				NamedNodeMap atributos = nodes.item(i).getAttributes();
				if(atributos.getNamedItem("name") != null)
					if(atributos.getNamedItem("name").getNodeValue().equals(className))
						return true;
			}
		}
		return false;
	}
}
