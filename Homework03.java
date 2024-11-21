//Mashal Shami 

import java.util.Random; // allowing for random output from computer 

import java.util.Scanner; //allowing for user input

public class Homework03 {
	
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in); //creating scanner object
		
		int playerScore=0;  //setting the scores at 0
		int computerScore=0;
		
		 System.out.println("Lets play a game of rock, paper, scissors! There are three rounds, best of the three wins!");
			
		 System.out.println("To start enter one of the options,\"rock\", \"paper\" or \"scissors\": "); //prompting user for input
		
		while(playerScore < 2 && computerScore <2) //creating a condition for the game to run because its best out of 3
		{
		
		String player1 = key.next();
		
		Random r = new Random(); //creating random scanner object
		
        int choice = r.nextInt(3); //random variable
        
		String computerPick="";
	
		if (choice == 0)  // assigning the random choices at integer values 
		{
            computerPick = "rock";
        } else if (choice == 1) {
            computerPick = "paper";
        } else {
            computerPick = "scissors";
        }
		
        System.out.println("Computer chose " + computerPick + "!");
        
        if (player1.equals(computerPick))  //condition for it the user and computer put the same choice 
		{
			System.out.println(player1 + " and " + computerPick + "! It's a Tie!");
			} 
		else if ((player1.equals("rock") && computerPick.equals("scissors"))|| (player1.equals("paper") && computerPick.equals("rock")) || (player1.equals("scissors") && computerPick.equals("paper"))) 
		{
			System.out.println(player1 + " and " + computerPick + "! Player Wins! 1 point awarded");
			playerScore++;
		//if user gains points
		}
		else if((computerPick.equals("rock") && player1.equals("scissors"))|| (computerPick.equals("paper") && player1.equals("rock")) || (computerPick.equals("scissors") && player1.equals("paper")))  
		{
			System.out.println(player1 + " and " + computerPick + "! Computer Wins! 1 point awarded");
		     computerScore++;
		     //if computer gains points
			}
        else {
        	System.out.println("Not a valid input! Computer wins!");
        	computerScore++;
        	System.exit(0);
        	//if the user enters an invalid input computer wins
        }
      
        System.out.println("Player has won " +playerScore + " times and the computer has won " + computerScore + " times");
        
		}
    
		if (playerScore > computerScore)
		{
			System.out.println("You win!");
			} 
		else {
			System.out.println("The Computer Wins!");
			}
		
		System.out.println("Do you want to play again? Enter \"Yes\" or \"No\"");
		
		String repeat =key.next();
		
		if (repeat.equals("yes")) //repeating the game by setting score equal to zero see above condition 
		{
		
			playerScore = 0;
			computerScore = 0;
			} 
		
		else {
			System.out.println("Goodbye!");
			}
		

      
    	  

    
    	  
    	  
    	  
    	  
     
      
        
	
	
	
		
		
		
		
	

}
}
