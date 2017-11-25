public class ParserDemo {

	public static void main(String[] args) {
		args = new String[1];
		args[0] = "C:\\Users\\Matthew Sokolovsky\\eclipse-workspace\\ParserScanner\\src\\prog7.jay";
		TokenStream tStream = new TokenStream(args[0]);
		System.out.println("test1");
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		System.out.println("test2");
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");
	}

}
