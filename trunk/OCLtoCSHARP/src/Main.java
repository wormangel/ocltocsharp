import org.omg.CORBA.Environment;


public class Main {

	/**
	   * Runs the scanner on input files.
	   *
	   * This main method is the debugging routine for the scanner.
	   * It prints debugging information about each returned token to
	   * System.out until the end of file is reached, or an error occured.
	   *
	   * @param argv   the command line, contains the filenames to run
	   *               the scanner on.
	 * @throws Exception 
	   */
	  public static void main(String argv[]) throws Exception {
		  
		  for (int i = 0; i < argv.length; i++) {
	        Lexer scanner = new Lexer( new java.io.FileReader(argv[i]) );
	        parser p = new parser(scanner); 
	          p.parse();
	        }
	  }


}
