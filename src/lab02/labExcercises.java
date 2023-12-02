
//
//Copyright (c) 2023 Promineo Tech
//Author:  Promineo Tech Academic Team
//Subject:  Boolean & Conditionals Lab
//Java Week 02 Lab  
//

package lab02;

public class labExcercises {
	
	public static void main(String[] args) {
		
		//
		// BOOLEANS and CONDITIONALS:
		//
		
		// 1. Variable Declaration:
		//		a. Create a variable named age and assign it a value of 14
		

int age;
age=15;
boolean hasLicense = false;
		

		
		
		// 2. Print a Boolean Expression:
		//		a. Print the boolean expression age >= 16 to the console and note the results.
		//		a. Change the value of age to 18 and print again.

System.out.println(age>=16);
		
		// 3. Can you drive?
		//		a. Using a conditional, print one of the following:
		//				i. "You can drive" if age is greater than or equal to 16
		//				ii. "You cannot drive" otherwise
		//
		//		a. Change the value of age and rerun to see the result
	
if((age>=16) && (hasLicense==true)) {
	System.out.println("You can drive");
} else if(age>=16){
	System.out.println("You can apply to get your license");
} else {
	System.out.println("Please wait " + (16 - age) + " year (s) to to be eligible for application of license and drive.");
}
		
		// 4. Update Solution to Question 3 as follows:
		//		a. Add a new variable called hasLicense before the conditional.
		//		b. Change the boolean expression in the conditional to additionally 
		//				include the need for hasLicense to be true.
		//		c. Try changing the values of age and hasLicense and note the different results.

//coded in the above question only. 		
		
		// 5. Milk?
		//		a. Create two new variables - costOfMilk and thirstLevel
		//		b. Create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50 
		//				or if thirstLevel is greater than 6 and prints "No Thanks" otherwise.
		//		c. Change the values and note the different results.

double costOfMilk=4;
int thirstLevel=4;
if((costOfMilk < 2.50) || thirstLevel > 6) {
	System.out.println("Milk Please");
} else {
	System.out.println("No Thanks");
}


	
		
		// 6. Cookie Distribution: 
		//			Note:  You will evenly distribute all of the cookies to the children 
		//					and as the adult you get to keep the remaining cookies for yourself.
		//
		//		a. Create two variables called numberOfCookies and numberOfChildren.
		//		b. Initialize the two variables to integer values.
		//		b. Use a conditional to print the following based on the following conditions:
		//				i. If there are 0 cookies remaining, print "Sad Face"
		//				ii. If there are less than 2 cookies, print "Yes!"
		//				iii. If there are less than 5 cookies, print "Whoohoooo!"
		//				iv. If there are 5 or more cookies, print "Jackpot!"

		int numberOfCookies=13;
		int numberOfChildren=7;
		
	//	int numberOfCookiesByEachChildren = numberOfCookies/numberOfChildren;
	//	System.out.println(numberOfCookiesByEachChildren);
		
		if ((numberOfCookies%numberOfChildren) == 0) {
			System.out.println("Sad Face");
		} else if((numberOfCookies%numberOfChildren) <= 2) {
			System.out.println("Yes");
		} else if((numberOfCookies%numberOfChildren) <= 5) {
			System.out.println("Whoohoooo!");
		} else  {
			System.out.println("Jackpot");
		}
		
		
		
				
		// 7.  Loyalty Member Program:
		//		a. Create a variable called loyaltyMemberStatus and assign the value "SILVER"
		//		b. Create a variable called loyaltyMemberDiscount and assign the value 0.0
		//		c. Using a switch, set the value of loyaltyMemberDiscount based on 
		//				the following loyaltyMemberStatus scale: 
		//				i. "SILVER" is 0.10
		//				ii. "GOLD" is 0.15
		//				iii. "PLATINUM" is 0.25
		
		String loyaltyMemberStatus="GOLD";
		double loyaltyMemberDiscount=0.0;
		
		switch (loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberDiscount=0.10;
				break;
			case "GOLD":
				loyaltyMemberDiscount=0.15;
				break;
			case "PLATINUM":
				loyaltyMemberDiscount=0.25;
				break;
		}
		System.out.println(loyaltyMemberDiscount);
		
				
				
		

		
		// 8. Using the Loyalty Member Program variables from Question 7, do the following:
		//		a. Create a variable called billTotal and assign a value
		//		b. Create a variable called adjustedTotal and assign it the billTotal minus 
		//				the loyaltyMemberDiscount percent of the billTotal
		//		c. If the adjustedBillTotal is greater than $500 upgrade the 
		//				loyaltyMemberStatus from SILVER to GOLD or from GOLD to PLATINUM
		
		double billTotal=600;
		double adjustedTotal;
		adjustedTotal=(billTotal-(billTotal*loyaltyMemberDiscount));
		
		System.out.println(billTotal);
		System.out.println(adjustedTotal);
		int count=0;
		
		while(adjustedTotal>500 && count<=0) {
		switch (loyaltyMemberStatus) {
		case "SILVER":
			System.out.println("Your Member Status is promoted to GOLD");
			break;
		case "GOLD":
			System.out.println("Your Member Status is promoted to PLATINUM");
			break;
		}
		count+=1;
		}
		
		// 9. Login -- username & password:
		//		a. Create two variables, username and password
		//		b. Create a conditional that prints one of the following:
		//				i. "login successful" if the username is "Tommy123" and the password is "12345"
		//				ii. "access denied" otherwise

		String username="Tommy123";
		String password="12347";
		
		if(username == "Tommy123" && password == "12345") {
			System.out.println("login successful");
		} else {
			System.out.println("access denied");
		}
		
		
		
		//
		// LOOPS:
		//
		
		// 10. Write a for loop that prints each number from 0 to 9
		
		int i=0;
		for(i=0;i<10;i++) {
			System.out.println(i);
		}

		
		
		// 11. Write a for loop that prints each number from 10 to 0 backwards
		int x=10;
		for (x=10;x>=0;x--) {
			System.out.println(x);
		}
		
		
		// 12. Write a for loop that prints every other number from 0 to 100
		
		int a=0;
		for(a=0; a<=10; a++) {
			if(a%2==0) {	
			System.out.println(a);
		}
		}

		
		
		// 13. Write a for loop that iterates from 0 to 100 and prints 
		//			"EVEN" if the number is even and "ODD" if it's odd

		for (int b=0; b<=10; b++) {
			if(b%2!=0) {
				System.out.println(b + " odd");
			}
			if(b%2==0) {
				System.out.println(b + " even");
			}
		}
		
		// 14. Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//			within the loop, divide each number by 3 and print the remainder to the console.

		int c=10;
		while( c>=0) {
				System.out.println(c + " " + c%3);
			c--;
		}
		String hello = "World"; 
		 System.out.println(hello.charAt(0));
		
	
		
		double assignment1=80.0;
		double assignment2=90.0;
		double assignment3=10.5;
		double assignment4=70;
		
		 if(((assignment1+assignment2) > 150) && ((assignment3>70) || (assignment4>70))) {
			    System.out.println("You passed the class."); 
		 	} else {
			    System.out.println("You failed the class.");
			}
		
		char letter='c';
		
		 if((letter=='a') || (letter=='e') || (letter=='i') || (letter=='o') || (letter=='u')) {
	            System.out.println("It's a vowel!");
	            
	        } else {
	            System.out.println("It's a consonant!");
	        }
	     
		 
		 String randomWord="Therefore";
	     int len = randomWord.length(); 
	     
	       if(len >= 10) {
	           System.out.println("That is a really long word!");   
	       } else {
	    	   System.out.println("Not so long word");
	       }
	}

}