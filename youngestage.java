//Take input of age of 3 people by user and determine oldest and youngest among them
//mr.karan Singh
//20-10-2022
//import packages 

import java.util.Scanner;
//declaring a class
class youngestage
{
	//main started
	public static void main(String args[])
	{
		//declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		
		//declaring variables
		int age;
		int age;
		int age;
		
		
		//taking input
		System.out.println("Enter your age:");
		age= sc.nextInt();
		
		//checking age criteria
		if(age>=18)
		{
			//taking input
			System.out.println("Enter your age:" +age);
		    age= sc.nextint();
			
			System.out.println("Enter your age:" +age);
		    age= sc.nextint();
			
			System.out.println("Enter your age:" +age);
		    age= sc.nextint();
			
			//checking weight criteria
			if(age>=22)
			{
				if(age>=40)
					System.out.println("You are youngest men" +age);
				 else
				System.out.println("coming");
					
			}
			else
			{
				if(age>=80)
					System.out.println("yor are oldestmen");
				 else
				System.out.println("plese rest your home");
				
			}
		   
			//end of nested ifelse
			
		}
		else
			System.out.println("rip" );
		//end of outer ifelse	
		
		    
	}
		
	// end of main
}
// end of class 