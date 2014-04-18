import java.util.Scanner;

public class random{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("Set max random number: ");
		 int userInput = input.nextInt();
		int A=randomTest.GetANumber_between_1_and_10(userInput);
		
		
		System.out.print("Guess a number: ");
		int num = input.nextInt();
		
		
		if (num == A)
			System.out.print("Good Job");
		else if (num < A)
			System.out.printf("Too Low. The correct number is: %d", A);
		else
			System.out.printf("Too High. The correct number is: %d", A);
			
		
	}

}
