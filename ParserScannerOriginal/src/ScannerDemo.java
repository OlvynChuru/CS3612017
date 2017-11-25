

/**
 * @author Christelle
 *  Edited by Matthew Sokolovsky
 */
public class ScannerDemo {

	private static String file1 = "C:\\Users\\Matthew Sokolovsky\\eclipse-workspace\\ParserScanner\\src\\test1.jay";

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1);
		Token t;
		long tokenCount = 1;
		System.out.println(file1);
		while (!ts.isEndofFile()) {
			t = ts.nextToken();
			System.out.println("Token " + tokenCount + " - Type: " + t.getType() + " - Value: " + t.getValue());
			tokenCount++;
		}
	}
}
