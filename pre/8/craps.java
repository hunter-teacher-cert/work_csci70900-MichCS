import java.util.Random;
import java.util.Scanner;


public class craps {

	public static int  roll (int n) {
		int minimum = 1;
		Random random = new Random();
		int rnumber = random.nextInt(n-minimum) + minimum;
		return rnumber;
	} //end of int
	
	// static means it won't change. It's just a reference
	static int round = 1;
	public static int shoot (int n, int m) {
		int result = 0;
		int show = roll(m);	
		System.out.println("Round " + round + ":");
		System.out.println();
		round = round + 1; 
		for(int i = 1;i <=n;i++) {
		show = roll(m);
		result = result + show;
		System.out.println("The dice rolled" + ":");
		System.out.println(show);
		}
		System.out.println("Combined value" + ":" + result);
		System.out.println();
		return result;
	} //end of shoot method
	
	public static boolean round () {
		boolean game = false;
		int shoot = shoot(2,6);
		if(shoot==2 ||shoot==3 ||shoot==12) {
			game = false;
			System.out.println("That's Craps! Sorry, you lose.");
		}else if((shoot==7 ||shoot==11)) {
			game = true;
			System.out.println("That's a Natural! Hooray! You win.");
		} else {
			int point = shoot;
			shoot = shoot(2,6);
			while(point!=shoot) {	
			shoot = shoot(2,6);
			if (shoot==7) {
			game = false;
			System.out.println("Sorry, you lose.");
			}
			else if((shoot==point)) {
			game = true;
			System.out.println("Hooray! You win.");
			
			}
			
		} 
		
			}return game;
	} //end of boolean
	
	public static void main (String [] args) {
		System.out.println(round());
	
	} 

}
