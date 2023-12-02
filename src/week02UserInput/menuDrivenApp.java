package week02UserInput;

import java.util.Scanner;

public class menuDrivenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter your name: ");
		
		String name = sc.nextLine ();
		
		System.out.println("Welcome " + name + ", Happy Shopping!");
		
		System.out.println("Please select the items to purchase:");
		
		int selection=0;
		double sum = 0;
		
		
		while (selection!=4) {
		
		
		System.out.println("1. Milk: 1.99");
		System.out.println("2. Ice cream: 3.25");
		System.out.println("3. coke: 7.99");
		System.out.println("4. Check out");
		
		selection = sc.nextInt();
		
		switch (selection) {
		case 1:
			sum+=1.99;
			break;
		case 2:
			sum+=3.25;
			break;
		case 3:
			sum+=7.99;
		case 4:
			break;
		default: 
			System.out.println("Please enter a valid option");
		}
		}
		System.out.println("Your total purchase is " + sum);
		
		
	}

}
