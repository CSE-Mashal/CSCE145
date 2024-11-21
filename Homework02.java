///Mashal Shami

import java.util.Scanner; //allowing for user input

public class Homework02 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in); //creating scanner object 
		
		String contestantPrize = "nothing"; //creating string for prize
	
		String donuts = "Donuts";   //creating strings for all the different prizes 
		String cake = "Cake";
		String candy = "Candy";
		String sticker =" Stickers ";
		String tickets = "Tickets";
		String fries = "Fries";
		String corn ="Corn";
		String tshirt="T-shirt";
		
		System.out.println("Hello! Welcome to the fair simulation, to see if you can take part in a game pick a number 1-10!!!"); //prompting the user for initial input
		
		int number = key.nextInt();
		
		if(number >= 1 && number <= 5) //create a condition in which the user can continue playing the game 
		{
			System.out.println("You guessed correctly and are able to play our game!");
		}
		else if(number > 5)//another condition, if true nothing else will run
		{
			System.out.println("Unfortunately you guessed incorrectly and cannot play. Better luck next time! Exiting the program!"); 
			System.exit(0);//exits the program
		}
		
		System.out.println("Lets play! Try to earn a free prize or treat! Choose a color, green, red, yellow, or blue."); //printing statement prompting user for input
					
		String response = key.next();
		
		if(response.equalsIgnoreCase("green")) //If user enters green the print statement down below will print on console
		{
			contestantPrize = donuts;
			
			System.out.println("Contestant you have won Donuts, would you like to keep it or trade for Cake. Enter \"Donuts\" or \"Cake\" :"); //allowing the user to make a decision
			
			response = key.next(); //I have key.next(); because my strings are one word otherwise use key.nextLine();
			
			if(response.equalsIgnoreCase("Donuts"))
			{
				contestantPrize =donuts;
			}
			else if(response.equalsIgnoreCase("Cake"))
			{
				contestantPrize =cake;
			}
			else
			{
				System.out.println("You got nothing!"); //most likely will not be used but should always have an else to finish block
			}		
		}
		else if(response.equalsIgnoreCase("red"))//if chooses keep
		{
			contestantPrize = candy;
			
			System.out.println("You have won Candy would you like to keep it or trade for a sticker. Enter \"Candy\" or \"Stickers\" :");
			
			response = key.next();
			
			if(response.equalsIgnoreCase("Candy"))
			{
				contestantPrize = candy;
			}
			else if(response.equalsIgnoreCase("Stickers"))
			{
				contestantPrize = sticker;
			}
			else
			{
				System.out.println("You got nothing!");
			}
		}
		else if(response.equalsIgnoreCase("yellow"))//if chooses keep
		{
			contestantPrize = tickets;
			
			System.out.println("You have won Tickets would you like to keep it or trade for fries. Enter \"Tickets\" or \"Fries\" :");
			
			response = key.next();
			
			if(response.equalsIgnoreCase("Tickets"))
			{
				contestantPrize =tickets;
			}
			else if(response.equalsIgnoreCase("Fries"))
			{
				contestantPrize = fries;
			}
			else
			{
				System.out.println("You got nothing!");
			}
		}
		else if(response.equalsIgnoreCase("blue"))//if chooses keep
		{
			contestantPrize = corn;
			
			System.out.println("You have won Corn would you like to keep it or trade for a T-Shirt. Enter \"Corn\" or \"T-Shirt\" :");
			
			response = key.next();
			
			if(response.equalsIgnoreCase("Ice Cream"))
			{
				contestantPrize =corn;
			}
			else if(response.equalsIgnoreCase("T-Shirt"))
			{
				contestantPrize = tshirt;
			}
			
		}
		else
		{
			System.out.println("You got nothing!");
			
		}
		System.out.println("You get " +contestantPrize+"! Thank you for playing!"); //Statement to print out what you have after decisions are made
		
			
			
	
		
		
		
		
		

		
		
	
		
	}

}
