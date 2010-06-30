import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.xml.sax.SAXException;

import xmiParser.DomainClass;
import xmiParser.XmiParser;


public class CodeWriter {

	private final String QUEBRA_LINHA = System.getProperty("line.separator"); 

	public static void main(String[] args) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException{
		start();
	}
	
	// Cria os esqueletos a partir do XMI
	public static void start() throws XPathExpressionException, ParserConfigurationException, SAXException, IOException{
		
		String invalid = "<>/\\:*?|\"";
		for (DomainClass c : XmiParser.fullParse()) {
			String filename = c.getName();
			for (char ch : invalid.toCharArray()) {
				filename = filename.replace(String.valueOf(ch), "");
			}
			filename += ".cs";
			BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
			writer.write(c.toString());
			writer.flush();
			writer.close();
		}
	}
	
	
}
