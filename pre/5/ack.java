package ack;

public class ack {

	public static int ack(int m, int n) {
	int result = 0;
		if (m == 0) {
		result = n + 1;
		
		} 
		else if (m > 0 && n == 0) {
		int recurse = ack(m - 1, 1);
		result = recurse;
		
		}
		else if (m > 0 && n> 0) {
		int recurse = ack(m - 1, ack(m, n-1));
	    result = recurse;
		
		}
		return result;
	}
	
	  public static void main(String[] args) {
	  System.out.println(ack(3,0 ));
	  }
	  
}
