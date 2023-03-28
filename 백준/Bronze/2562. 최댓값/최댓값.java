
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt(); 
		}
		int max = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				count = i+1;
			}
		}
		System.out.println(max);
		System.out.println(count);
		
		
	}
}
