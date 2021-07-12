public class isTriangle {
    public static void main(String args[]) {
      

      System.out.println(isTriangle(2,4,6));
    
    }

     public static boolean isTriangle(int a, int b, int c){
        
        boolean triangle = true;
        
        if(a+b < c || a+c < b || b+c < a){

            triangle = false;

        } else {
            triangle = true;
        
        }

     return triangle;
    } 
}