import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
		
		
		for (DomainClass c : XmiParser.fullParse()) {
			String filename = buildFilename(c.getName());
			BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
			writer.write(c.toString());
			writer.flush();
			writer.close();
		}
	}
	
	private static String buildFilename(String filename){
		String invalid = "<>/\\:*?|\"";
		for (char ch : invalid.toCharArray()) {
			filename = filename.replace(String.valueOf(ch), "");
		}
		filename += ".cs";
		
		return filename;
	}
	
	
	private static DomainClass parseCs(String classname) throws FileNotFoundException {
		String filename = buildFilename(classname);
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		
		return null;
	}
	
	
}
