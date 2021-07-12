  
import java.util.Arrays;
import java.util.Scanner;


public class sieve {
	public static boolean[] sieve (int n) {
		
		boolean [] sieve = new boolean[n];
			for(int i=2;i<n;i++) {
				
				sieve[i] = true;	
			}
			for(int base = 2; base<=(int)Math.sqrt(n);base++) {
				if(sieve[base] == true) {
					for(int bool = base*base; bool < n; bool = bool + base) {
						sieve[bool] = false;
					}
				}
			}

			
			return sieve;