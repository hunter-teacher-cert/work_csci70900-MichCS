public class isDivisible {
    public static void main(String args[]) {

      System.out.println(isDivisible(4,8));
    
    }
 
     public static boolean isDivisible(int n, int m){
        
        boolean divisible = true;
        

        if(n%m == 0){
            
      
            divisible = false;
             
    
        } else if (m%n == 0){
            divisible = true;
        
             
        }

     return divisible;
    } 
}