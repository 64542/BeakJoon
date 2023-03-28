import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}
		
		int v = s.nextInt();
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			if (arr[i] == v) {
				count++;
			}
		}
		
		System.out.println(count);
			
	}
}
