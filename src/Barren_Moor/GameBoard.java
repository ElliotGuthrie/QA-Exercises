package Barren_Moor;

import java.util.*;

public class GameBoard 
{
	Scanner input;
	int row;
	int column;
	Random rng;
	String[][] board;
	int boardSize;
	int spawnPoint;
	int playerXLocation;
	int playerYLocation;
	boolean stillPlaying;
	String direction;

	public static void main(String[] args) 
	{
		System.out.println(" ▄▀▀█▄▄   ▄▀▀█▄   ▄▀▀▄▀▀▀▄  ▄▀▀▄▀▀▀▄  ▄▀▀█▄▄▄▄  ▄▀▀▄ ▀▄      ▄▀▀▄ ▄▀▄  ▄▀▀▀▀▄   ▄▀▀▀▀▄   ▄▀▀▄▀▀▀▄ \n" + 
				"▐ ▄▀   █ ▐ ▄▀ ▀▄ █   █   █ █   █   █ ▐  ▄▀   ▐ █  █ █ █     █  █ ▀  █ █      █ █      █ █   █   █ \n" + 
				"  █▄▄▄▀    █▄▄▄█ ▐  █▀▀█▀  ▐  █▀▀█▀    █▄▄▄▄▄  ▐  █  ▀█     ▐  █    █ █      █ █      █ ▐  █▀▀█▀  \n" + 
				"  █   █   ▄▀   █  ▄▀    █   ▄▀    █    █    ▌    █   █        █    █  ▀▄    ▄▀ ▀▄    ▄▀  ▄▀    █  \n" + 
				" ▄▀▄▄▄▀  █   ▄▀  █     █   █     █    ▄▀▄▄▄▄   ▄▀   █       ▄▀   ▄▀     ▀▀▀▀     ▀▀▀▀   █     █   \n" + 
				"█    ▐   ▐   ▐   ▐     ▐   ▐     ▐    █    ▐   █    ▐       █    █                      ▐     ▐   \n" + 
				"▐                                     ▐        ▐            ▐    ▐     Created by Elliot Guthrie\n");
		System.out.println("Welcome to Barren Moor, a text based adventure game, where your goal is \n"
				+ "to find the treasure without getting forever lost in the infinite mire!\n"
				+ "\nGood Luck!\n");
		
		GameBoard gameboard = new GameBoard();
		gameboard.input = new Scanner(System.in);
		
		System.out.println("Please input the amount of rows you want the board to have:");
		//while (!gameboard.input.hasNextInt())
			//gameboard.input.next();
		gameboard.row = gameboard.input.nextInt();
		System.out.println("Now please input the amount of columns you want the board to have:");
		//while (!gameboard.input.hasNextInt())
			//gameboard.input.next();
		gameboard.column = gameboard.input.nextInt();

		gameboard.basicBoard();
		//gameboard.treasureFiller(gameboard.boardSize);

		gameboard.playerLocation();
	}
	public int basicBoard() 
	{
		board = new String[row][column];

		//System.out.println(" ");

		for (int row = 0; row < board.length; row++) 
		{
			for (int column = 0; column < board[row].length; column++)
			{
				board[row][column] = "-";
			}
		}

		boardSize = row * column;
		return boardSize;
	}
/*
	public void treasureFiller(int boardSize)
	{
		int treasureAmount = (int) Math.ceil(boardSize / 10);
		Random rng = new Random();

		for (int i = 0; i <= treasureAmount; i++)
		{
			int n1 = rng.nextInt(row);
			int n2 = rng.nextInt(column);
			//int n3 = rng.nextInt(7) + 1;

			board[n1][n2] = Integer.toString(8);
		}

		//printBoard();
	}
*/
	public void printBoard()
	{
		for (int row = 0; row < board.length; row++) 
		{
			for (int column = 0; column < board[row].length; column++) 
			{
				System.out.print(board[row][column] + " ");
			}
			System.out.println("");
		}
	}
	public int playerSpawn() 
	{
		spawnPoint = Math.round(row / 2);
		return spawnPoint;
	}
	public void playerLocation()
	{
		playerSpawn();
		
		Random rng = new Random();
		int n1 = rng.nextInt(row);
		int n2 = rng.nextInt(column);
		board[n1][n2] = Integer.toString(8);
		
		stillPlaying = true;
		playerXLocation = spawnPoint;
		playerYLocation = spawnPoint;
		
		basicBoard();
		while(stillPlaying == true)
		{
			for(int row = 0; row < board.length; row++)
				for(int column = 0; column < board[row].length; column++)
				{
					if(row == playerXLocation && column == playerYLocation)
					{
						board[row][column] = "*";
					}
					else
					{
						board[row][column] = "-";
					}
				}
			printBoard();		
			
			System.out.println("Which cardinal direction do you want to travel in? ('North', 'East', 'South' or 'West'?)");
			Scanner dir = new Scanner(System.in);
			direction = dir.nextLine();
			
			if(direction.equalsIgnoreCase("North")) 
			{
				playerXLocation--;
				System.out.println("You move North.");
			}
			else if(direction.equalsIgnoreCase("East")) 
			{
				playerYLocation++;
				System.out.println("You move East.");
			}
			else if(direction.equalsIgnoreCase("South")) 
			{
				playerXLocation++;
				System.out.println("You move South.");
			}
			else if(direction.equalsIgnoreCase("West")) 
			{
				playerYLocation--;
				System.out.println("You move West.");
			}
			else 
			{
				System.out.println("Please input one of the cardinal directions!");
			}
			
			if(playerXLocation == n1 && playerYLocation == n2)
			{
				dir.close();
				System.out.println("\nCongratulations! You got found the treasure and saved the world! Go you!\n"); 
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
				stillPlaying = false;
			}
			else
			{
				double distanceX = n1 - playerXLocation;
				double distanceY = n2 - playerYLocation;
				double squareDistX = distanceX * distanceX;
				double squareDistY = distanceY * distanceY;
				double distFromWin = Math.sqrt(squareDistX + squareDistY);
				System.out.println("You are " + distFromWin + "m away from the treasure.");
				continue;
			}
		}
	}
}
