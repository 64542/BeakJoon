import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		int num1, num2, num3;
		num1 = b/100;
		num2 = b/10;
		num2 %= 10;
		num3 = b%10;
		
		num3 *= a;
		num2 *= a;
		num1 *= a;
		
		System.out.println(num3);
		System.out.println(num2);
		System.out.println(num1);
		System.out.println(a*b);
	}
}
