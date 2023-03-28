import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int X = s.nextInt();
		
		int[] A = new int[N];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = s.nextInt();
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] < X) {
				System.out.print(A[i] + " ");
			}
		}
			
	}
}
