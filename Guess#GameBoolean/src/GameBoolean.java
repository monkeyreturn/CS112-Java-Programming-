import java.util.Scanner;

public class GameBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNumber;
		int num;
		randomNumber = 0 +(int)(Math.random()*10);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		num = input.nextInt();
		
		boolean correct;
		boolean high;
		
		correct = false;
		correct = num==randomNumber;
		high = randomNumber<num;
		
		if (correct)
			System.out.print("Good job");
		else if(high)
			System.out.print("Too high");
		else
			System.out.print("Too low");
		
		

	}

}
