package Lab2_3;
import java.util.Scanner;
public class Lab2_3 {
	public static void main(String[] args) {
		System.out.print("Enter your string : ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		System.out.println(inputString);
		inputString = inputString.replace("happy", "happy :)");
		inputString = inputString.replace("sad", "sad :(");
		System.out.println(inputString);
	}
}
