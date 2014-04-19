import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Set highest random number: ");
		int userInputHigh = input.nextInt();
		
		System.out.print("Set lowest random number: ");
		int userInputLow = input.nextInt();
		
		Syste.out.print("Guess a number: ");
		int num = input.nextInt();
		
		int A = RandomNumber.GetANumber(userInputLow, userInputHigh);
		
		
			if (num == A)
			System.out.print("Good Job");
		else if (num < A)
			System.out.printf("Too Low. The correct number is: %d", A);
		else
			System.out.printf("Too High. The correct number is: %d", A);
			
	}

}
