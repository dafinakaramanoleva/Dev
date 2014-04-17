public class FirstClass {
	
	
	
	public static void main(String[] args) {
		
		
		Colourise text = new Colourise(String.valueOf(args[0]));
		System.out.println(args[1]);
		
		//This prefix allows you to print text after it with custom color. See ANSI colors for more details.
		
		System.out.println(text.getColourisedText());

		
	}

}
