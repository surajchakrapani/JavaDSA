package leetcode.math;

public class Pow {

	public static void main(String[] args) {

		System.out.println(myPow(2.00000, -2)); // 1024.00000
	}

	public static double myPow(double x, int n) {

		if(n < 0){
            n = -n;
            x = 1 / x;
        }
        
        double pow = 1;
        
        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            } 
                
            x *= x;
            n >>>= 1;
            
        }
        
        return pow;
    }

}
