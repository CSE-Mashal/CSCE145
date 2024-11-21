//Mashal Shami

import java.util.Scanner; //allowing for user input

public class Homework04 {
	
public static final double PI= 3.14; //constant of pi
	
	public static void main(String[] args) {
		
Scanner key = new Scanner(System.in); //creating scanner object
		
		System.out.println("How many circles would you like to create?"); //prompting user for input
		
		int size = key.nextInt();
		
		double[] myArray = new double [size]; //creating or initializing array
		
		if(size < 0) //allowing the user to enter value again after invalid value
		{
			System.out.println("Invalid size. Enter a new value!");
			
			size= key.nextInt();
		} 
		
		for(int i = 0; i < myArray.length; i++)  //storing and accepting values of array
		{
			System.out.println("Enter the radius value of the circle at index " + i + ":");
			
			myArray[i] = key.nextDouble();	
			
		}
		
        
        double[] radArray = new double[size]; //same size as myArray so use variable
		
		for(int i = 0; i < radArray.length; i++) //storing and updating areas of myArray in radArray
		{
			double area= PI*(myArray[i]*myArray[i]);
			
			radArray[i]=area;
		}
		
		for(int i = 0; i < radArray.length; i++) //printing radArray
		{
			System.out.print(radArray[i] +" ");
		}
			
      
		System.out.println("\nWould you like to see the circles in ascending order in terms of their areas? Enter \"Yes\" or \"No\""); //creating choice for order
		
		String responseOne =key.next();
		
		if(responseOne.equalsIgnoreCase("Yes"))
		{
			for(int i = 0; i < radArray.length; i++)
			{
				int minIndex = i; // zero
				double smallest = radArray[i];  // the array at zero
				           //0+1
				for(int j = i+1; j < radArray.length; j++)
				{       //1           smallest is zero look at variable
					if(radArray[j] < smallest)
					{
						smallest = radArray[j];
						minIndex = j;
					}
				}
				
				if(smallest < radArray[i]) //they switch according to smallest value
				{
					double temp = radArray[i];
					radArray[i] = radArray[minIndex];
					radArray[minIndex] = temp;
				}
						
			}
			

			for(int i = 0; i < radArray.length; i++) //printing from smallest to largest
			{
				System.out.print(radArray[i] +" ");
			}
			
	
		}
		
		System.out.println("\nWould you like to see the circles in descending order in terms of their areas? Enter \"Yes\" or \"No\"");
		
		String responseTwo =key.next();
		
		if(responseTwo.equalsIgnoreCase("Yes")) //creating a selection sort from biggest to smallest
		{
			for (int i = 0; i < radArray.length; i++) 
			{
	            for (int j = i+1; j < radArray.length; j++) 
	            {
	                if(radArray[i] < radArray[j]) //switch depending on largest values, they swap
	                {
	                   double temp = radArray[i];
	                   
	                    radArray[i] = radArray[j];
	                    
	                    radArray[j] = temp;
						
		         	}
	            }
			}

			for(int i = 0; i < radArray.length; i++) //printing order 
			{
				System.out.print(radArray[i] +" ");
			}
			
	
		}
		
		
		 System.out.println("\nWould you like to see all unique circles? Enter \"Yes\"or \"No\"" ); //allows for only non duplicates to be printed
		 
		 String responseThree = key.next();
		
		if(responseThree.equalsIgnoreCase("Yes"))
		{
			for(int i=0; i<radArray.length; i++) 
			 {
				int count =0;
				
		         for (int j=0; j<radArray.length; j++) 
		         {
		            if(radArray[i] == radArray[j] && i!=j) 
		            {
		               count++;
		
		            }
		         }
			
		         if(count==0) 
		         {
		        	 System.out.println(radArray[i]);
		         }
			 }
		}
		
		
		System.out.println("Would you like to quit the program? Enter \"Yes\" or \"No\""); //if user wants to exit the program
		
		String responseFour = key.next();
		
		if(responseFour.equalsIgnoreCase("Yes"))
		{
			System.exit(0);
		}
		 
		
		
		
		
		
		
		
		
	}

}
