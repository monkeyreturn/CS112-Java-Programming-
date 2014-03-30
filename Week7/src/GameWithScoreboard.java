import javax.swing.JOptionPane;

import java.util.Scanner;

public class GameWithScoreboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfPlay = 0, numberOfLost = 0;
		int numberOfTie=0;
		int numberOfWin=0;
		System.out.println("Rock - Paper - Scissor Game");
		Boolean exit = false;
		String pc;
		do{
		int randomNumber;
		randomNumber = 1 +(int)(Math.random()*3);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rock, paper, scissor or exit: ");
		String user = input.next();
		numberOfPlay++;
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
		
	
		if(!user.equals("rock") && !user.equals("paper") && !user.equals("scissor") && !user.equals("exit")){
		numberOfLost++;
		System.out.print("Cheater....You lost!\n\n");
	}else{
	if(user.equals("exit")){
		exit = true;
		System.out.println("Bye!");
		numberOfPlay = numberOfPlay - 1;
		//System.out.printf("Play = %d\nWon = %d\nLost = %d\nTie = %d", numberOfPlay, numberOfWin, numberOfLost, numberOfTie);
		
	}else if(user.equals (pc)){
		numberOfTie++;
		System.out.printf("Tied.\nPC picked %s\n\n", pc);
	}else if (user.equals("rock") && pc.equals("paper")){
		numberOfLost++;
		System.out.printf("You lost.\nPC picked %s\n\n", pc);
	}else if (user.equals("paper") && pc.equals("scissor")){
		numberOfLost++;
		System.out.printf("You lost.\nPC picked %s\n\n", pc);
	}else if (user.equals("scissor") && pc.equals("rock")){
		numberOfLost++;
		System.out.printf("You lost.\nPc picked %s\n\n", pc);
	}else{
		numberOfWin++;
		System.out.printf("You won!\nPC picked %s.\n\n", pc);
		
		}
	}
	
	}
	while(exit !=true);
		String number = String.format("Play = %d\nWon = %d\nLost = %d\nTie = %d", numberOfPlay, numberOfWin, numberOfLost, numberOfTie);
		JOptionPane.showMessageDialog(null, number);
	
	}

}
