/*Filename SecretPhrase.java
 * Written by Wilman Garcia
 * Assignment: HW7
 * Written on 4/02/2017
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SecretPhrase {

	public static void main(String[] args) {
		
		boolean gameOver = false;
		Scanner keyboard = new Scanner(System.in);
		
		String phrase = new String("Go Yankees");
		StringBuilder secretPhrase = new StringBuilder("G* Y******");
		
		System.out.println("The secret phrase is " + secretPhrase);
		
		while(gameOver == false)
		{
			System.out.print("Would you like to guess a Letter or the Phraase(L/P): ");
			char turnChoice = keyboard.next().charAt(0);
			turnChoice = Character.toUpperCase(turnChoice);
			
			if(turnChoice == 'L')
			{
				guessLetter(keyboard, phrase, secretPhrase);
			}
			
			else if(turnChoice == 'P')
			{
				gameOver = guessPhrase(keyboard, phrase, gameOver);
			}
						
		
			gameOver = gameStatus(secretPhrase, gameOver);
			
			if(gameOver == true)
			{
				JOptionPane.showMessageDialog(null, "Congrats you win, you guessed the secret phrase!!!");
			}			
		}
		
		keyboard.close();
	}
	
	public static void guessLetter(Scanner keyboard, String phrase, StringBuilder secretPhrase)
	{
		keyboard.nextLine();
		boolean correct = false;
		int correctCounter = 0;
		System.out.println("Please enter a letter you would like to guess: ");
		char guess = keyboard.next().charAt(0);
		guess = Character.toUpperCase(guess);
		
		for(int i = 0; i < phrase.length(); i++)
		{
			if(guess == phrase.toUpperCase().charAt(i))
			{
				secretPhrase.setCharAt(i, Character.toLowerCase(guess));
				correct = true;
				correctCounter++;
			}
			
		}
		
		if(correct == true)
		{
			System.out.println("Good Guess! " + guess + " is in the secret phrase!");
			System.out.println(guess + " was in the secret phrase " + correctCounter + " times!");
		}
		else
		{
			System.out.println("Aw nice try but " + guess + " is not in the secret phrase");
		}
		
		
		System.out.println("The Secret Phrase is: " + secretPhrase);

	}
	
	public static boolean guessPhrase(Scanner keyboard, String phrase, boolean gameOver)
	{
		String guess;
		keyboard.nextLine();
		System.out.print("Guess the secret phrase: ");
		guess = keyboard.nextLine();
		
		if(guess.toUpperCase().equals(phrase.toUpperCase()))
		{
			System.out.println("Congrats!! You guessed the secret phrase! The secret phrase was " + guess);
			gameOver = true;
		}
		
		else
		{
			System.out.println("Nice try! But " + guess + "  is not the secret phrase!");

		}
		
		return gameOver;
		
	}
	
	public static boolean gameStatus(StringBuilder secretPhrase, boolean gameOver)
	{
		int gameOverCounter = 0;
		
		if(gameOver != true)
		{
			for(int i = 0; i < secretPhrase.length(); i++)
			{
				if(secretPhrase.charAt(i) == '*')
				{
						gameOver = false;			
				}
				
				else
				{
					gameOverCounter++;
					
					if(gameOverCounter == secretPhrase.length())
					{
						gameOver = true;
					}
				}
			}
		}
		return gameOver;
	}
}
