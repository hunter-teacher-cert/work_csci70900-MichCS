import java.util.Arrays;

public class histogram {

	public static int [] histogram (int[] scores) {

		int[] counts = new int[100];
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == 0 || scores[i] == 100) {
				
			}else {
			
			int index = scores[i];
			counts[index]++;
			}
			
}return counts;
	}
	public static void main(String [] args) {
	int[] apple = histogram(new int[] {0,1,2});
	
	System.out.print(Arrays.toString(apple));
	}
}