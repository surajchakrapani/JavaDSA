package hackerrank.week2;

public class CaesarCipher {

	public static void main(String[] args) {

		String s ="middle-OuZz";
		System.out.println(caesarCipher(s,2));
	}
	
	public static String caesarCipher(String s, int k) {
	    
		StringBuilder str = new StringBuilder();
		
			for(char c:s.toCharArray()) {
				if(c>='a' && c<= 'z') {
					c= (char) ('a' + (c - 'a' + k) %26);
				}else if(c>='A' && c<='Z') {
					c= (char) ('A' + (c-'A' + k ) % 26);
				}
				str.append(c);
			}
		
		return str.toString();
	    }

}
