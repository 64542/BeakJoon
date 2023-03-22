import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();
		
		int money = 0;
		
		if (num1 == num2 && num2 == num3) {
			money = num1 * 1000 + 10000;
		}
		else if (num1 == num2) {
			money = num1 * 100 + 1000;
		}
		else if (num2 == num3) {
			money = num2 * 100 + 1000;
		}
		else if (num1 == num3) {
			money = num1 * 100 + 1000;
		}
		else if (num1 > num2 && num1 > num3){
			money = num1 * 100;
		}
		else if (num2 > num1 && num2 > num3){
			money = num2 * 100;
		}
		else if (num3 > num1 && num3 > num2){
			money = num3 * 100;
		}
			
		System.out.println(money);
	}
}
