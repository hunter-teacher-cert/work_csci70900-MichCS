
public class myExp {
	
	public static void check(double x){
	    int i = 28;

	    System.out.println(x+"\t"+myexp(x, i)+"\t"+Math.exp(x));
	 }

	public static double myexp(double x, int n){
	    double result = 1;
	    double p = 1;
	    double q = 1;
	    for (int i=1;i<n;i++){
	       result += (p*=x)/(q*=i);
	    } 
	    return result;
		}

	
public static void main(String [] args) {
	   for (double i=0.1; i<=100; i*=10){
		      check(i);
		   }// end of for loop

}//end of method



}
