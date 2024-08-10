package Lab2_1;
import java.util.Scanner;
public class Lab2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input the number : ");
		String inputString = sc.nextLine();
		System.out.print(inputString + " = ");
		int result = 0  ;
		for(int i =0 ; i<inputString.length();i++) {
			result += Character.getNumericValue(inputString.charAt(i));
			System.out.print(inputString.charAt(i)); 
			if(i != (inputString.length() -1)) {
				System.out.print(" + ");
			}else {
				System.out.print(" = ");
			}
		}
		System.out.println(result);
		
	}
}
}
