
public class Project {
	
	public static void permutateString(String prefix, String string) {
		int lenght = string.length();
		if(lenght == 0) {
			System.out.println(prefix);
		} else {
			for(int i = 0; i < lenght; i++) {
				permutateString(prefix + string.charAt(i), string.substring(0, i) + string.substring(i + 1, lenght));
			}
		}
		
	}
	
	public static void main(String[] args){
		permutateString("", "123");
	}
			
}
