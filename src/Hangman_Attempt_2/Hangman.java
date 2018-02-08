package Hangman_Attempt_2;

import java.util.*;
import java.io.*;

public class Hangman 
{
	ArrayList<String> easyList;
	ArrayList<String> mediumList;
	ArrayList<String> hardList;
	ArrayList<Character> guessed;
	Scanner input;
	int livesLeft;
	int diffChoice;
	boolean isDead;
	char userInput;
	
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
		hangman.livesLeft = 10;
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
			hangman.diffChoice = hangman.setUp(hangman.input);
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
		hangman.guessed = new ArrayList<Character>();
		
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
		
		char[] letters = chosenWord.toCharArray();
		char[] secretWord = new char[letters.length];
		
		for(int i = 0; i < letters.length; i++)
		{
			secretWord[i] = '_';
		}
		
		hangman.isDead = false;
		
		while(hangman.isDead == false)
		{
			boolean goodGuess = false;
			
			System.out.println("\n" + "The word to guess is: ");
			for(int i = 0; i < letters.length; i++)
			{
				System.out.print(secretWord[i]);
			}
		
			System.out.println("\n" + "Lives Left: " + hangman.livesLeft +"\nYou have already guessed: " + hangman.guessed + "\nInput your next guess: ");  
			String wrongInput = new String();

			while(wrongInput.length() == 0)
			{
				wrongInput = hangman.input.nextLine().replaceAll("[^a-zA-Z]", "");
				if(wrongInput.length() == 0)
				{
					System.out.println("Please enter a valid guess.");
				}
			}
			
			hangman.userInput = wrongInput.toUpperCase().charAt(0);
			
			boolean letterAlreadyGuessed = false;
			
			for(int i = 0; i < hangman.guessed.size(); i++)
			{ 
				if(hangman.userInput == hangman.guessed.get(i))
				{ 
					System.out.println("\nYou already guessed this letter. Please input a new letter. "); 
					letterAlreadyGuessed = true;
				}
			}
			
			if(letterAlreadyGuessed == true)
			{
				continue;
			}
			
			if(!(hangman.guessed.contains(hangman.userInput)))
			{ 
                hangman.guessed.add(hangman.userInput);  
            } 
			for(int i = 0; i < letters.length; i++) 
			{ 
                if(hangman.userInput == letters[i]) 
                { 
                  secretWord[i] = hangman.userInput; 
                }
                if(hangman.userInput == letters[i])
                {
                		goodGuess = true;
                		//System.out.println("\nThat guess was correct, well done! \n");
                }
			}
			
			if(goodGuess == false)
			{ 
				System.out.println("That guess was incorrect. \n"); 
				hangman.livesLeft -= 1; 
			}
			else
			{
				System.out.println("That guess was correct, well done! \n");
			}
			
			if(hangman.livesLeft <= 0)
			{ 
				System.out.println("The word was: " + chosenWord + "\n");
                	System.out.println("Oh my God, you killed Kenny! Game Over!\n");
                	System.out.println(" ██████╗  █████╗ ███╗   ███╗███████╗     ██████╗ ██╗   ██╗███████╗██████╗ \n" + 
                			"██╔════╝ ██╔══██╗████╗ ████║██╔════╝    ██╔═══██╗██║   ██║██╔════╝██╔══██╗\n" + 
                			"██║  ███╗███████║██╔████╔██║█████╗      ██║   ██║██║   ██║█████╗  ██████╔╝\n" + 
                			"██║   ██║██╔══██║██║╚██╔╝██║██╔══╝      ██║   ██║╚██╗ ██╔╝██╔══╝  ██╔══██╗\n" + 
                			"╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗    ╚██████╔╝ ╚████╔╝ ███████╗██║  ██║\n" + 
                			" ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝     ╚═════╝   ╚═══╝  ╚══════╝╚═╝  ╚═╝\n" + 
                			"                                                                          ");
                	hangman.isDead = true;
            }
			
			if(Arrays.equals(letters, secretWord))
			{ 
                System.out.println("\nThe word was: " + chosenWord + "\n"); 
                System.out.println("\nCongratulations! You got it right and saved the world! Go you!\n"); 
                System.out.println("                                   .''.       \n" + 
                		"       .''.      .        *''*    :_\\/_:     . \n" + 
                		"      :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.\n" + 
                		"  .''.: /\\ :   ./)\\   ':'* /\\ * :  '..'.  -=:o:=-\n" + 
                		" :_\\/_:'.:::.    ' *''*    * '.\\'/.' _\\(/_'.':'.'\n" + 
                		" : /\\ : :::::     *_\\/_*     -= o =-  /)\\    '  *\n" + 
                		"  '..'  ':::'     * /\\ *     .'/.\\'.   '\n" + 
                		"      *            *..*         :\n" + 
                		"       *\n" + 
                		"        *");
                System.out.println("██╗   ██╗ ██████╗ ██╗   ██╗    ██╗    ██╗██╗███╗   ██╗\n" + 
                		"╚██╗ ██╔╝██╔═══██╗██║   ██║    ██║    ██║██║████╗  ██║\n" + 
                		" ╚████╔╝ ██║   ██║██║   ██║    ██║ █╗ ██║██║██╔██╗ ██║\n" + 
                		"  ╚██╔╝  ██║   ██║██║   ██║    ██║███╗██║██║██║╚██╗██║\n" + 
                		"   ██║   ╚██████╔╝╚██████╔╝    ╚███╔███╔╝██║██║ ╚████║\n" + 
                		"   ╚═╝    ╚═════╝  ╚═════╝      ╚══╝╚══╝ ╚═╝╚═╝  ╚═══╝\n" + 
                		"                                                      ");
                
                break; 
            }
			hangman.gallows();
		}
	}
	
	private int setUp(Scanner input)
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
	
	private void gallows()
	{
		switch(livesLeft)
		{
			default:
				System.out.println("");
				break;
			case 9:
				System.out.println("" + 
						"             \n" + 
						"              \n" + 
						"              \n" + 
						"             \n" + 
						"         \n" + 
						"       ___________\n" + 
						"       ||       ||\n");
				break;
			case 8:
				System.out.println("" + 
						"         |   \n" + 
						"         |     \n" + 
						"         |     \n" + 
						"         |    \n" + 
						"         |\n" + 
						"       __|________\n" + 
						"       ||       ||\n");
				break;
			case 7:
				System.out.println("         _______\n" + 
						"         |/    \n" + 
						"         |     \n" + 
						"         |     \n" + 
						"         |    \n" + 
						"         |\n" + 
						"       __|________\n" + 
						"       ||       ||\n");
				break;
			case 6:
				System.out.println("         _______\n" + 
						"         |/    |\n" + 
						"         |     \n" + 
						"         |     \n" + 
						"         |    \n" + 
						"         |\n" + 
						"       __|________\n" + 
						"       ||       ||\n");
				break;
			case 5:
				System.out.println("         _______\n" + 
						"         |/    |\n" + 
						"         |     O\n" + 
						"         |     \n" + 
						"         |    \n" + 
						"         |\n" + 
						"       __|________\n" + 
						"       ||       ||\n");
				break;
			case 4:
				System.out.println("         _______\n" + 
						"         |/    |\n" + 
						"         |     O\n" + 
						"         |     |\n" + 
						"         |    \n" + 
						"         |\n" + 
						"       __|________\n" + 
						"       ||       ||\n");
				break;
			case 3:
				System.out.println("         _______\n" + 
						"         |/    |\n" + 
						"         |     O\n" + 
						"         |    /|\n" + 
						"         |    \n" + 
						"         |\n" + 
						"       __|________\n" + 
						"       ||       ||\n");
				break;
			case 2:
				System.out.println("         _______\n" + 
						"         |/    |\n" + 
						"         |     O\n" + 
						"         |    /|\\\n" + 
						"         |    \n" + 
						"         |\n" + 
						"       __|________\n" + 
						"       ||       ||\n");
				break;
			case 1:
				System.out.println("         _______\n" + 
						"         |/    |\n" + 
						"         |     O\n" + 
						"         |    /|\\\n" + 
						"         |    / \n" + 
						"         |\n" + 
						"       __|________\n" + 
						"       ||       ||\n");
				break;
			case 0:
				System.out.println("         _______\n" + 
						"         |/    |\n" + 
						"         |     O\n" + 
						"         |    /|\\\n" + 
						"         |    / \\\n" + 
						"         |\n" + 
						"       __|________\n" + 
						"       ||       ||\n");
				break;
		}
	}
}
