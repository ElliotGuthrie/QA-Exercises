package Wednesday_Hangman_Exercise;

import java.io.*;
import java.util.*;

public class Hangman 
{
	ArrayList<String> easyList;
	ArrayList<String> mediumList;
	ArrayList<String> hardList;
	Scanner input;
	int livesLeft;
	int diffChoice;
	boolean isDead;
	
	public static void main(String[] args) throws IOException
	{
		Hangman hangman = new Hangman();
		
		File words = new File("src/words.txt");
		Scanner wordReader = new Scanner(words);
		ArrayList<String> wordList = new ArrayList<String>();
		while (wordReader.hasNextLine())
		{
		    wordList.add(wordReader.nextLine());
		}
		wordReader.close();
		
		hangman.input = new Scanner(System.in);
		hangman.livesLeft = 8;
		hangman.diffChoice = 0;
		
		System.out.println("██╗  ██╗ █████╗ ███╗   ██╗ ██████╗ ███╗   ███╗ █████╗ ███╗   ██╗\n" + 
						  "██║  ██║██╔══██╗████╗  ██║██╔════╝ ████╗ ████║██╔══██╗████╗  ██║\n" + 
						  "███████║███████║██╔██╗ ██║██║  ███╗██╔████╔██║███████║██╔██╗ ██║\n" + 
						  "██╔══██║██╔══██║██║╚██╗██║██║   ██║██║╚██╔╝██║██╔══██║██║╚██╗██║\n" + 
						  "██║  ██║██║  ██║██║ ╚████║╚██████╔╝██║ ╚═╝ ██║██║  ██║██║ ╚████║\n" + 
						  "╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝ ╚═════╝ ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝\n" + 
						  "                                       Created by Elliot Guthrie");
		System.out.println("Welcome to Hangman! \nPlease select a difficulty from 'Easy', 'Medium' or 'Hard'...");
		while (hangman.diffChoice == 0) 
		{
			hangman.diffChoice = setUp(hangman.input);
		}	
		
		hangman.easyList = new ArrayList<String>();
		hangman.mediumList = new ArrayList<String>();
		hangman.hardList = new ArrayList<String>();
		
		for(String chosenWord : wordList)
		{
			if(hangman.diffChoice == 1 && chosenWord.length() > 8 && chosenWord.length() <= 15)
			{
				hangman.easyList.add(chosenWord);
			}
			else if(hangman.diffChoice == 2 && chosenWord.length() > 5 && chosenWord.length() <= 8)
			{
				hangman.mediumList.add(chosenWord);
			}
			else if(hangman.diffChoice == 3 && chosenWord.length() > 3 && chosenWord.length() <= 5)
			{
				hangman.hardList.add(chosenWord);
			}
		}
		
		Random random = new Random();
		String chosenWord = "";
		
		if(hangman.diffChoice == 1)
		{
			int n = random.nextInt(hangman.easyList.size());
			chosenWord = hangman.easyList.get(n).toUpperCase();
		}
		else if(hangman.diffChoice == 2)
		{
			int n = random.nextInt(hangman.mediumList.size());
			chosenWord = hangman.mediumList.get(n).toUpperCase();
		}
		else if(hangman.diffChoice == 3)
		{
			int n = random.nextInt(hangman.hardList.size());
			chosenWord = hangman.hardList.get(n).toUpperCase();
		}
		
		//System.out.println(chosenWord);
		String secretWord = chosenWord.replaceAll("\\p{P}", "").replaceAll("[a-zA-Z]", "_ ");
		//System.out.println(secretWord);
		
		System.out.println("The word to guess is: " + secretWord);
		System.out.println("You have " + hangman.livesLeft + " lives left to figure it out!");
		
		hangman.isDead = false;
		//trying to replace the secret word underscores with the guessed letters
		while(!hangman.isDead)
		{
			String guess = hangman.input.nextLine();
			
			if(guess.length() > 1 || guess.length() == 0)
			{
				System.out.println("Please input a single letter at a time.");
				continue;
			}
			else
			{
				char charGuess = Character.toUpperCase(guess.charAt(0));
				
				for(int i = 0; i < chosenWord.length(); i++ )
				{
					chosenWord.charAt(i);
					int replace = chosenWord.indexOf(charGuess);
					
					while(replace != -1)   
					{
					   secretWord[replace] = charGuess;
					   replace = chosenWord.indexOf(charGuess, replace);  
					}
				}
			}
		}
	}
	private static int setUp(Scanner input)
	{
		String difficulty = input.nextLine();
		
		if(difficulty.equals("Easy"))
		{
			System.out.println("You have chosen the 'Easy' difficulty");
			return 1;
		}
		else if(difficulty.equals("Medium"))
		{
			System.out.println("You have chosen the 'Medium' difficulty");
			return 2;
		}
		else if(difficulty.equals("Hard"))
		{
			System.out.println("You have chosen the 'Hard' difficulty");
			return 3;
		}
		else
		{
			System.out.println("Please enter a valid difficulty level (case sensitive!)");
			return 0;
		}
	}
}
		
		//inputting correct letter removes all instances of _ from the hidden word
		//inputting incorrect letter adds a frame to the hangman
		//game over when word completed or man hanged