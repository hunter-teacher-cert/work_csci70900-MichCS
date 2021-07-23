/*
Michelle B.
Michele P.
GUIDELINES:
* person whose name comes latest in alphabet starts in driver mode
* transitions could take longer than in person. this OK.
* team flag
barGraphify(nums) takes a list of non-negative integers and prints a
horizontal bar for each index, commensurate with the value at said index.
Exempli gratia, for x = {0,1,2,3}:
barGraphify(x)
0:
1: =
2: ==
3: ===
and for x = {1,0,3,2}
barGraphify(x)
0: =
1:
2: ===
3: ==
*/

/*
//Creating the second array.
//Change the numbers in the printBarGraph to reflect the interpretation above.
and for x = {1,0,3,2}
barGraphify(x)
0: =
1:
2: ===
3: ==
    public static void main(String[] args) {
    int[] numbers = printBarGraph(new int[] {1,0,3,2}); //these numbers are changeable
    System.out.print(Arrays.toString(numbers));
    }
}
*/
import java.util.Arrays;
//import java.util.*;
public class barGraphify {
//Create a method for the array
  public static int[] printBarGraph(int a[]) {
int [] x = new int[a.length];
    for (int i = 0; i < a.length; i++) {
    } //end of loop
    return a;
}//end of method
    public static void main(String[] args) {
    int[] numbers = printBarGraph(new int[] {0,1,2,3}); //these numbers are changeable
    System.out.print(Arrays.toString(numbers));
    } //end of main
} //end of class


/* Indep Practice
import java.util.Arrays;
import java.util.*;
public class barGraphify {
  public static int[] printBarGraph(int[] a) {
    //System.out.print("{" + a[0]);
    for (int i = 0; i < a.length; i++) {
        System.out.print(", " + a[i]);
    }//for
    System.out.println("}");
}//void
//class
    public static void main(String[] args) {
      //printBarGraph(5);
      System.out.println();
    }//main
}//class
*/