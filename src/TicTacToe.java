import java.util.Scanner;

/**
 * Name:Cameron
 * Teacher:Mr.Hardman
 * Assignment Final Project
 * Date Last Modified: 01/18/2017
 */

public class TicTacToe{

	private static char[][] board = new char[3][3];

	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String playerOne;
		String playerTwo;
		int row=-1;
		int collum=-1;

		boolean
		
		
		initBoard();
		displayBoard();
		
		
		//Gets information from the user
		System.out.println("Player One what is your name?");
		playerOne = keyboard.next(); 
		System.out.println(playerOne + ", You are O"); 
		
		System.out.println("Player Two what is your name?");
		playerTwo = keyboard.next(); 
		System.out.println(playerTwo + ", You are X"); 
		
		while(row==-1){
			System.out.println(playerOne + ", Please choose a row.");
			row=keyboard.nextInt();
			
			if(board [row][0] != ' ' && board [row][1] != ' ' && board [row][2] != ' '){
				System.out.println("That row is already filled choose another row.");
				
				row=-1;
				
				
			}
			
		}
		
		while(collum==-1){
			System.out.println(playerOne + ", Please choose a collum.");
			collum=keyboard.nextInt();
			
			if(board [row][0] != ' ' && board [row][1] != ' ' && board [collum][2] != ' '){
				System.out.println("That row is already filled choose another collum.");
				
				collum=-1;
			
				
			}

		}
		while(row==-1){
			System.out.println(playerTwo + ", Please choose a row.");
			row=keyboard.nextInt();
			
			if(board [row][0] != ' ' && board [row][1] != ' ' && board [row][2] != ' '){
				System.out.println("That row is already filled choose another row.");
				
				row=-1;
				
				
			}
			
		}
		
		while(collum==-1){
			System.out.println(playerTwo + ", Please choose a collum.");
			collum=keyboard.nextInt();
			
			if(board [row][0] != ' ' && board [row][1] != ' ' && board [collum][2] != ' '){
				System.out.println("That row is already filled choose another collum.");
				
				collum=-1;
				
			}
			
		}
		
	}
	
	
	public static void initBoard()
	{
		// fills up the board with blanks
		for ( int r=0; r<3; r++ ){
			for ( int c=0; c<3; c++ ){
				board[r][c] = ' ';
			}
		}
	}


	public static void displayBoard()
	{
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}



	
	public static void displayBoard2()
	{
		for ( int r=0; r<3; r++ )
		{
			System.out.print("\t"+r+" ");
			for ( int c=0; c<3; c++ )
			{
				System.out.print( board[r][c] + " " );
			}
			System.out.println();
		}
		System.out.println("\t  0 1 2 ");
		
	}
	

		
	}



