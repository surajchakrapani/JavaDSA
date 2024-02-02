package hackerrank.week2;

public class CounterGame {

	public static void main(String[] args) {
		System.out.println(counterGame(132));
		
	}
	
	public static String counterGame(long n) {
	   
		String player1 = "Louise";
		  String player2 = "Richard";
		  
		  String binary = Long.toBinaryString(n);
		  System.out.println(binary);
		  
		  // The number of 1's (until the last) represent the number
		  // of turns / subtractions until the result is a power of 2
		  long turns = binary.chars().filter(ch -> ch == '1').count() - 1;
		  System.out.println(turns);

		  
		  // Add to turns the number of zeros ofter the last 1
		  // which will be the turns / div by 2 until 1 is reached
		  turns += binary.length() - (binary.lastIndexOf("1") + 1);
		  System.out.println(turns);

		  
		  // If the number of turns is even, player 2 will win
		  return turns % 2 == 0? player2 : player1;
	    }

}
