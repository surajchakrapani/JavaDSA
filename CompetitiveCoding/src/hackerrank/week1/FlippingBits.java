package hackerrank.week1;

public class FlippingBits {

	public static void main(String[] args) {
		 
		//System.out.println(flippingBits(2147483647));
		System.out.println(flippingBits(1));

	}
	
	public static long flippingBits(long n) {
		String binary = Long.toBinaryString(n);
		
		System.out.println(binary);
		
		StringBuilder output = new StringBuilder();
		
		while(binary.length()<32) { //turn str into 32bit length
			binary = '0' + binary;
		}
		System.out.println(binary);
		
		for(int i=0;i<32;i++) {
			if(binary.charAt(i)=='0') {
				output.append('1');
			}else {
				output.append('0');
			}
		}
	
        return Long.parseLong(output.toString(), 2);
    }

	
	

}
