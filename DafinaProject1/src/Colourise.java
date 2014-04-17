
public class Colourise {
	private String text;
		
	public Colourise (String text) {
		this.text=text;
	}
	
	public String getColourisedText() {
		char[] textAsCharArray = text.toCharArray();
		String result = "";

		for (int i = 0; i < textAsCharArray.length; i++) {
			
		result += getColoredChar(textAsCharArray[i]);
			
		}
		
		return result;
	}
	
	private String getColoredChar(char toColorise) {
		String colorisedLetter = null;
		
		switch(toColorise) {
		
			case 'y' :                         
				colorisedLetter = "\u001B[33m" + toColorise;
				break;
			case  'Y' :
				colorisedLetter = "\u001B[33m" + toColorise;
				break;
			case 'r' :
				colorisedLetter = "\u001B[31m" + toColorise;
				break;
			case 'R' :
				colorisedLetter = "\u001B[31m" + toColorise;
				break;
			case 'p' :
				colorisedLetter = "\u001B[35m" + toColorise;
				break;
			case 'P' :
				colorisedLetter = "\u001B[35m" + toColorise;
				break;
			case 'b' :
				colorisedLetter = "\u001B[34m" + toColorise;
				break;
			case 'B' :
				colorisedLetter = "\u001B[34m" + toColorise;
				break;
			case 'C' :
				colorisedLetter = "\u001B[36m" + toColorise;
				break;
			case 'c' :
				colorisedLetter = "\u001B[36m" + toColorise;
				break;
				
			default: colorisedLetter = "\u001B[0m" + toColorise;
	        break;
		}
		 
		return colorisedLetter;
	}
}
