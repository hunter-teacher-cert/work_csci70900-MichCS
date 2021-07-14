Live Coding Lesson: 


// What libraries should we import here? Why?
//What does the Scanner and Random libraries used for? (Random - to generate random number, Scanner is to receive input from user)
import java.util.Random;
import java.util.Scanner;


//Based on the task, what is a good name for the class?
//What preventative debugging strategy is useful here? ({})
public class GuessStarter {


//What should our first step be in this program? (Create a psuedocode (visual aid) "Keys to Success")	
//Why should we initialize inside of the main vs. outside of the main (It's being used for testing)
//When is a good scenario to initialize outside of the main? (If the variable is used inside of the method? Or private variable )

	  public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      int difference = 0; //Why is initializing at 0 most effective? ()

        //To print a statement, what phrase do we start off with? What are effective preventative debugging to complete the line of code that asks the user to input a number? ((), ;, )
	      System.out.println("I'm thinking of a number between 0-100 (including both)...");
	      System.out.print("Can you guess my number?:");


	     

//How do we create a random selection inquiry?
       //RANDOM NUMBER SELECTION
	      Random random = new Random();
	      int yourNumber = random.nextInt(100) + 1;
	      System.out.println(yourNumber);
	      System.out.println("My number was 27!");


	    */ 
      //How can we change this into a method? 
          difference = yourNumber - 27;
          } else if (27 > yourNumber) {
	    	  difference = 27 - yourNumber;
	      }
      // How do we start a method? What is this method's purpose?
      //Which starting method is better void or int? (Void b/c we can print a statement)



      } //How do close any method? 
	   //end of method
  

	   
     

  How many paramaters do we use?
      public static void yourNumber (int ramdom,int n){
        int difference = 0;
         if (yourNumber > 27) {
	      difference = yourNumber - 27;
        //What do we write below to print a statement about the difference? 
	      System.out.println("You were off by: " + difference);
	      } else if (27 > yourNumber) {
	    	  difference = 27 - yourNumber;
	      }
//What is the importance of this brace? What would happen if it were not there?
	}


