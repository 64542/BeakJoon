import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int H = s.nextInt();
		int M = s.nextInt();
		int T = s.nextInt();
		
		M += T;
		
		M += 60 * H;
		
		H = M / 60;
		
		M = M % 60;
		
		if (H > 23) {
			H -= 24;
		}
		System.out.println(H + " " + M);
	}
}
