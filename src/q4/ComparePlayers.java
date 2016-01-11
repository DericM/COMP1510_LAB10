package q4;

//**************************************************************
//ComparePlayers
//
//Reads in two Player objects and tells whether they represent
//the same player.
//**************************************************************
import java.util.Scanner;
public class ComparePlayers
{
	public static void main(String[] args)
	{
		Player player1 = new Player();
		Player player2 = new Player();
		//Scanner scan = new Scanner();
		//Prompt for and read in information for player 1
		player1.readPlayer();
		player2.readPlayer();
		//Prompt for and read in information for player 2
		//Compare player1 to player 2 and print a message saying
		//whether they are equal
		if(player1.equals(player2)){
			System.out.println("Player1 equals Player2");
		}
		else {
			System.out.println("Player1 dose NOT equal Player2");
		}
		
	}
}