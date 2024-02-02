package leetcode.two_pointers;

public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama")); //"amanaplanacanalpanama" is a palindrome.
	}

	public static boolean isPalindrome(String s) {
		
		StringBuilder sb1 = new StringBuilder();

		for(int i=0;i<s.length();i++) {
			
			if(((s.charAt(i) >= 48 && s.charAt(i)<=57) || s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)) {
				sb1.append(s.charAt(i));
			}			
		}
		
		
		String str = sb1.toString().toLowerCase();
		
		System.out.println(str);
		
		for(int i=0,j=str.length()-1;i<=j;i++,j--) {
			if(str.charAt(i)!= str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	//more efficient solution
	 public boolean isPalindrome2(String s) {
	        if (s.isEmpty()) {
	        	return true;
	        }
	        int start = 0;
	        int last = s.length() - 1;
	        while(start <= last) {
	        	char currFirst = s.charAt(start);
	        	char currLast = s.charAt(last);
	        	if (!Character.isLetterOrDigit(currFirst )) {
	        		start++;
	        	} else if(!Character.isLetterOrDigit(currLast)) {
	        		last--;
	        	} else {
	        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
	        			return false;
	        		}
	        		start++;
	        		last--;
	        	}
	        }
	        return true;
	    }

}
