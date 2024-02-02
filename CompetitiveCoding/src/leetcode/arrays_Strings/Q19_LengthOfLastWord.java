package leetcode.arrays_Strings;

public class Q19_LengthOfLastWord {

	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("   fly me   to   the moon  "));

	}

	public static int lengthOfLastWord(String s) {
		
		String[] str = s.split(" ");
		
		String lastWord = str[str.length -1];
		
		return lastWord.length();
	}

}
