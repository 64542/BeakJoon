import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int[] arr = new int[N];

		int M = s.nextInt();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for (int a = 0; a < M; a++) {
			int i = s.nextInt();
			int j = s.nextInt();
			int swich = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = swich;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");			
		}
	}
}
