# Live Coding Lesson: 

**Grade: 5-6**


### Purpose of Lesson:

/* In this live coding lesson, teacher will use the strategy "Stop & Ask" and "Stop & Think" to complete the code with the students below. When teacher asks the questions, teacher will pause to allow for student to implement the strategy: Think, Pair, Share and for student responses. Let's begin:


Let us begin our code by importing libraries. What libraries are needed for this project? Why?

What is a Scanner and Random library used for? (Random - to generate random number, Scanner is to receive input from user)

*/

import java.util.Random;
import java.util.Scanner;


/* Questions:
Based on the task, what could be a good name for the class?
What (preventative debugging strategy) should we implement at the end of the class? ({}) */

public class LiveCodingLessonGuessStarter {


/*To write successful code, what should the first step in this program be? (Create a psuedocode (visual aid) "Keys to Success")	

Why should we initialize inside of the main vs. outside of the main (It's being used for testing)

Provide a scenario when it is good to initialize outside of the main? (If the variable is used inside of the method? Or private variable ) */

	  public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      int difference = 0; 
          
          /*Questions: 
          1. Why is it effective to initialize at 0 ? ()
          
          2. To print a statement, what phrase do we start off with? 
          What are effective preventative debugging to complete the line of code that asks the user to input a number? ((), ;, ) */

	      System.out.println("I'm thinking of a number between 0-100 (including both)...");
	      System.out.print("Can you guess my number?:");


	     

//Now it's time to create and initialize a random selection inquiry. What steps should we implement to see that happen?

       //RANDOM NUMBER SELECTION
	      Random random = new Random();
	      int yourNumber = random.nextInt(100) + 1;
	      System.out.println(yourNumber);
	      System.out.println("My number was 27!");


	     
      //How can we change the following code below into a method? Which method?
          difference = yourNumber - 27;
          } else if (27 > yourNumber) {
	    	  difference = 27 - yourNumber;
	      }

      /* Questions:
      1. How do we start a method? 
      2. What is this method's purpose?
      3. Should void or int be implemented here? (Void b/c we can print a statement)
      4. Let's close the method. How do we do that? */
       }
       
	   //end of method
  

	   
     

      // How many paramaters are needed here? List them.
      
         public static void yourNumber (int ramdom,int n){
        int difference = 0; //What number should written here?
         if (yourNumber > 27) {
	      difference = yourNumber - 27;

        //What do we write below to print a statement about the difference?

	      System.out.println("You were off by: " + difference);
	      } else if (27 > yourNumber) {
	    	  difference = 27 - yourNumber;
	      }

/* Questions: 

1. What is the importance of this brace? 
2. What would happen if it were not there?
3. What could we add to indicate which brace this represents "end of class" */

	} //end of class


