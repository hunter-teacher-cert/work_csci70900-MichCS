import java.util.Scanner;


public class factorial {

	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Let's find the factorial of a number!");
		System.out.print("Insert a factor: ");
		int base = scanner.nextInt();
		int result = 1;
		
		
		for(int i=1; i<=base; i++) {
			if (base == 0) {
			result = 1;
		
			}else {
			result = result * i;
		
			}
			
			
		}System.out.println("The factorial of " + base + " is " + result);
}
}
