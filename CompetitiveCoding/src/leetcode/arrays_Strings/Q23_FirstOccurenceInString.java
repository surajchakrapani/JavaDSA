package leetcode.arrays_Strings;

public class Q23_FirstOccurenceInString {

	public static void main(String[] args) {
		String haystack = "bbsadbutsad";
		String needle = "sad";
		System.out.println(strStr("a",""));
	}
	
	public static int strStr(String haystack, String needle) {
		
		for(int i=0;i<=haystack.length()-needle.length();i++) {
			String val = haystack.substring(i, i + needle.length());
			if(val.equals(needle)) {
				return i;
			}
		}
        return -1;
    }
	
}
