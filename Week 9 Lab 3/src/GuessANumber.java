import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Set highest random number: ");
		int userInputHigh = input.nextInt();
		
		System.out.print("Set lowest random number: ");
		int userInputLow = input.nextInt();
		
		int A = RandomNumber.GetANumber(userInputLow, userInputHigh);
		System.out.print(A);
	}

}
