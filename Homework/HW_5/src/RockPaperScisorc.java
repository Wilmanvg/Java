/*Filename RockPaperScisorc.java
 * Written by Wilman Garcia
 * Assignment: HW5
 * Written on 3/19/2017
 */

import java.util.Scanner;
import java.lang.Math;
import javax.swing.JOptionPane;

public class RockPaperScisorc {
	
	public static void main(String[] args)
	{
		String choice; 
		Scanner keyboard = new Scanner(System.in);
		String gameDecision;
		
		System.out.println(	"RULES\n" 
							+"--------------------------------------------------------------------------------------\n"
							+"You will be prompted for whether you want to chose rock, paper, or scisiors.\n\n" 
							+"\t*Rock beats scissors, because a rock can break a pair of scissors.\n" + "\t*Scissors beats paper, because scissors can cut paper.\n"
							+"\t*Paper beats rock, because a piece of paper can cover a rock.\n\n" + "You can either type out your choice or enter 1 for Rock, "
							+ "2 for paper or 3 for Scisors\n" + "--------------------------------------------------------------------------------------" );
		System.out.print("Would you like to play a game of Rock Paper Scisors (Y/N):");
		choice = keyboard.next();
		char userChoice = choice.charAt(0);
		userChoice = Character.toUpperCase(userChoice);
		
		while(userChoice != 'Y' && userChoice != 'N')
		{
			System.out.println("Please enter a valid choice (Y/N): ");
			choice = keyboard.next();
			userChoice = choice.charAt(0);
			userChoice = Character.toUpperCase(userChoice);
		}
		
		while(userChoice == 'Y')
		{
			final int Rock = 1;
			final int Paper = 2;
			final int Scissors = 3;
			int userPick;
			
			System.out.println("GET READY TO PLAY!");
			for(int i = 3; i >= 1; i--)
			{
				System.out.println(i + "....");
			}
			
			int computerRandom = (int)(Math.random() * 3 + 1);
			System.out.print("Rock Paper or Scisors!: ");
			gameDecision = keyboard.next();
			gameDecision = gameDecision.toUpperCase();
			
			switch(gameDecision)
			{
			case "ROCK":
			case "1":
				userPick = Rock;
				if(userPick == computerRandom)
				{
					JOptionPane.showMessageDialog(null, "Computer chose Rock \nYOU TIED!");
				}
				
				else if(computerRandom == Paper)
				{
					
					JOptionPane.showMessageDialog(null, "Computer chose Paper\nYOU LOSE ):");
				}
				
				else if (computerRandom == Scissors)
				{
					JOptionPane.showMessageDialog(null, "Computer chose Scissors\nYOU WIN! (:");
				}
				break;
			case "PAPER":
			case "2":
			{
				userPick = Paper;
				if(userPick == computerRandom)
				{
					JOptionPane.showMessageDialog(null, "Computer chose Paper..YOU TIED!");
				}
				
				else if(computerRandom == Scissors)
				{
					JOptionPane.showMessageDialog(null, "Computer chose Scissors...YOU LOSE ):");
				}
				
				else if (computerRandom == Rock)
				{
					JOptionPane.showMessageDialog(null, "Computer chose Rock...YOU WIN! (:");
				}
				
				break;
			}
			
			case "SCISORS":
			case "3":
			{
				userPick = Scissors;
				if(userPick == computerRandom)
				{
					JOptionPane.showMessageDialog(null, "Computer chose Scissors..YOU TIED!");
				}
				
				else if(computerRandom == Rock)
				{
					JOptionPane.showMessageDialog(null, "Computer chose Rock...YOU LOSE ):");
				}
				
				else if (computerRandom == Paper)
				{
					JOptionPane.showMessageDialog(null, "Computer chose Paper...YOU WIN! (:");
				}
				break;
			}
			
				default: JOptionPane.showMessageDialog(null, "SORRY SOMETHING WENT WRONG, PLEASE TRY AGAIN"); 
				
			}
			
			System.out.print("Would you like to play again?: ");
			choice = keyboard.next();
			userChoice = choice.charAt(0);
			userChoice = Character.toUpperCase(userChoice);
		}
		keyboard.close();
	}
}
