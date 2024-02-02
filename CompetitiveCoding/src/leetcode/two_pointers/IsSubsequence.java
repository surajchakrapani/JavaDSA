package leetcode.two_pointers;

public class IsSubsequence {

	public static void main(String[] args) {
		
		String s = "abc", t = "ahbdc";
		System.out.println(isSubsequence(s,t));
	}

	public static boolean isSubsequence(String s, String t) {
		
		if(s.isEmpty()) {
			return true;
		}
		
		int p = 0;
		
		for(int i=0;i<t.length();i++) {
			if(s.charAt(p)==t.charAt(i)) {
				p++;
			}
			if(p==s.length()) {
				return true;
			}
		}
		
		return false;
	}

}
