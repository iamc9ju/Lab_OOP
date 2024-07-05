package Lab2_1;
import java.util.Scanner;
public class Lab2_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your number : ");
		String inputString = scanner.nextLine();
		int inputInt = Integer.parseInt(inputString);
		displayOutput(inputString,summation(inputInt));
		

	}
	static int summation(int inputInt) {
		int sum = 0;
		while(inputInt > 0) {
			sum += inputInt%10;
			inputInt /= 10;
		}
		return sum;
	}
	static void displayOutput(String inputString,int sum) {
		System.out.print(inputString + "=");
		for(int i = 0; i<inputString.length();i++) {
			System.out.print(inputString.charAt(i));
			if(i<inputString.length()-1) {
				System.out.print("+");
			}else {
				System.out.print("=");
			}
		}
		System.out.print(sum);
	}
}
