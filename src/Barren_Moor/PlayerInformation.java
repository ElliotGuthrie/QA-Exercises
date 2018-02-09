package Barren_Moor;

public class PlayerInformation extends GameBoard
{
	int playerXLocation;
	int playerYLocation;
	
	public void playerLocation()
	{
		playerXLocation = spawnPoint;
		playerYLocation = spawnPoint;
		
		basicBoard();
		
		for(int i = 0; i < board.length; i++)
			for(int j = 0; j < board[row].length; j++)
			{
				if(i == playerXLocation && j == playerYLocation)
				{
					board[i][j] = "*";
					System.out.println(board[i][j] + " ");
					
				}
				else
				{
					board[i][j] = "-";
					System.out.println(board[i][j] + " ");
				}
				System.out.println("");
			}
		printBoard();
	}
}
