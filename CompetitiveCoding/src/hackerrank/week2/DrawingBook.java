package hackerrank.week2;

public class DrawingBook {

	public static void main(String[] args) {
		
		System.out.println(pageCount(6,5));

	}
	
	/*
     * Complete the 'pageCount' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER p
     */

    public static int pageCount(int n, int p) {

    	int firstPage = 0;
    	int lastPage = n;
    	
    	if(p-firstPage<=lastPage-p) {
    		return (p-firstPage)/2;
    	}else if(lastPage % 2 == 0){
    		return (((lastPage + 1) -p)/2);
    	}else {
    		return (lastPage-p)/2;
    	}
    	
    }

}
