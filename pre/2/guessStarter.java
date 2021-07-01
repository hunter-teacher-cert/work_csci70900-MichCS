import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
	

	  public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      int difference = 0;
	      System.out.println("I'm thinking of a number between 0-100 (including both)...");
	      System.out.print("Can you guess my number?:");
	      //RANDOM NUMBER SELECTION
	      Random random = new Random();
	      int yourNumber = random.nextInt(100) + 1;
	      System.out.println(yourNumber);
	      System.out.println("My number was 27!");
	      
	      
	      if (yourNumber > 27) {
	      difference = yourNumber - 27;
	      } else if (27 > yourNumber) {
	    	  difference = 27 - yourNumber;
	      } 
	      
	      System.out.println("You were off by: " + difference);
	      
	  }


	}
