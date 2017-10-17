
public class Caesar {

	public static void main(String[] args) {
		// create an instance of a class called Cipher
		cipher encryptedWord = new cipher("Logic");
		shortCuts shortCut = new shortCuts();
		shortCut.print(encryptedWord.getWord());
		encryptedWord.encrypt(1);
		shortCut.print(encryptedWord.getWord());
		
	}
	
	

}

class shortCuts {
	public void print (String msg) {
		System.out.println(msg);
	}
}

class cipher {
	private String hiddenWord = new String("");
	private int storedDisplacement = 0;
	
	private String alphabet = "abcdefghijklmnopqrstuvwxyz";
	cipher (String word) {
		hiddenWord = word;
	}
	void encrypt (int displacement) {
		storedDisplacement = displacement;
		String encryptedWord = "";
		for (int i = 0; i < hiddenWord.length(); i++) {
			int letterLoc = alphabet.indexOf(hiddenWord.charAt(i));
			encryptedWord += alphabet.substring(letterLoc + displacement, letterLoc + displacement + 1);			
		}
		hiddenWord = encryptedWord;
	}
	void decrypt (int displacement) {
		
	}
	
	String getWord () {
		return (hiddenWord);
	}
}
