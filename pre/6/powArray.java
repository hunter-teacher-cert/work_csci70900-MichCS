import java.util.Arrays;

public class powArray {

public static double[] powArray(double a[]) {
    double [] x = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      x[i] = Math.pow(a[i], 2.0);
      
    }return x;
    }


public static void main(String [] args) {
  double[] test = powArray(new double[] {1,2,3,4});
  System.out.print(Arrays.toString(test));


 
} //end of main

}