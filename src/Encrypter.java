public class Encrypter {
	private static String nCode = "2157493806";
	private static String uCode = "YXYZWVQTSRONKPMLIHGJEDAFCB";
	private static String lCode = uCode.toLowerCase();
	
	
	
	public static String encrypt(String input) {
		char[] inputChars = input.toCharArray(),
				outputChars = new char[input.length()];
		for (int i = 0; i < outputChars.length; i++) {
			outputChars[i] = (Character.isLetter(inputChars[i])? (Character.isLowerCase(inputChars[i]) ? lCode.charAt(inputChars[i] - 'a') : uCode.charAt(inputChars[i] - 'A')) : Character.isDigit(inputChars[i]) ? nCode.charAt(Integer.parseInt(Character.toString(inputChars[i]))) : inputChars[i]) ;
		}
		return new String(outputChars);
	}
	public static String decrypt(String input) {
		char[] inputChars = input.toCharArray(),
				outputChars = new char[input.length()];
		for (int i = 0; i < outputChars.length; i++) {
			outputChars[i] = (Character.isLetter(inputChars[i])? (Character.isLowerCase(inputChars[i]) ? (char)(lCode.indexOf(inputChars[i]) + 97) : (char)(uCode.indexOf(inputChars[i]) + 65)) : Character.isDigit(inputChars[i]) ? (char)(nCode.indexOf(inputChars[i]) + 48) : inputChars[i]) ;
		}
		return new String(outputChars);
	}
	
	
	
	public static String reorder(String input) {
		String[] words = input.split(" ");
		String output = "";
		for (int i = words.length - 1; i >= 0; i--) {
			output += words[i] + " ";
		}
		//output = output.substring(0, output.length()-2);
		return output;
	}
}