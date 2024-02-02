package hackerrank.week2;

public class TowerBreakers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(towerBreakers(1,4));

	}
	
	
	/*
     * Complete the 'towerBreakers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n - number of towers
     *  2. INTEGER m - height of tower
     */
    public static int towerBreakers(int n, int m) {
    	
    	int moves = 0;
    	int height =m;
    	
    	for(int i=m-1;i>0;i--) {
    		if(height -i !=0 && height%(height-i)==0 && height > 1) {
    			height = height - i;
    			moves ++;
    		}
    	}
    	
    	moves = n* moves;
    	
    	return moves%2==0 ? 2:1;
    }


}
