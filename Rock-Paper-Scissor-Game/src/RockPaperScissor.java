import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 = Rock
		//2 = Paper
		//3 = Scissor
		int randomNumber;
	    
		randomNumber = 1 +(int)(Math.random()*3);
		Scanner input = new Scanner(System.in);
		System.out.println("Rock - Paper - Scissor Game");
		System.out.println("Enter your move of rock, paper or scissor: ");
		String user = input.next();
		String pc;
		
	/*	switch(s){
		case "rock":
			if(randomNumber == 2 )
				System.out.println("You lost!\nComputer's move Paper");
			else if (randomNumber == 3)
				System.out.println("You won!\nComputer's move Scissor");
			else
				System.out.println("Tied! \nRock = Rock");
		break;		
		
		case "paper":
			if(randomNumber == 3 )
				System.out.println("You lost!\nComputer's move Scissor");
			else if (randomNumber == 1)
				System.out.println("You won!\nComputer's move Rock");
			else
				System.out.println("Tied! \nPaper = Paper");
		break;
		
		case "scissor":
			if (randomNumber == 1)
				System.out.println("You lost!\nComputer's move Rock");
			else if (randomNumber == 2)
				System.out.println("You won!\nComputer's move Paper");
			else
				System.out.println("Tied! \nScissor = Scissor");
		break;
		
		default:
			System.out.print("Ooopp! Illegal move and you lost");
		break;
		}
	*/	
		if (randomNumber == 1){
			pc = "rock";
			//System.out.printf(b);
		}else if (randomNumber == 2){
			pc = "paper";
			//System.out.printf(b);
		}else {
			pc = "scissor";
			//System.out.printf(b);
		}
	if(!user.equals("rock" + "paper" + "scissor")){
		System.out.print("Cheater....You lost!");
	}else{
	if(user.equals (pc)){
		System.out.printf("Tied.\nPC picked %s", pc);
	}else if (user.equals("rock") && pc.equals("paper")){
		System.out.printf("You lost.\nPC picked %s", pc);
	}else if (user.equals("paper") && pc.equals("scissor")){
		System.out.printf("You lost.\nPC picked %s", pc);
	}else if (user.equals("scissor") && pc.equals("rock")){
		System.out.printf("You lost.\nPc picked %s", pc);
	}else{
		System.out.printf("You won.\nPC picked %s", pc);
		}
	}
	}

}
