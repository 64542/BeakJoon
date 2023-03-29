import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int[] arr = new int[N];

		int M = s.nextInt();
		
		for (int a = 0; a < M; a++) {
			int i = s.nextInt();
			int j = s.nextInt();
			int k = s.nextInt();
			
			for (int b = i-1; b < j; b++) {
				arr[b] = k;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");			
		}
	}
}
