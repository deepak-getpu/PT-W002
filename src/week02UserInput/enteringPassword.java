package week02UserInput;

import java.util.Scanner;

public class enteringPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		boolean loggedIn=false;
		Scanner sc = new Scanner (System.in);
		
		int attempt=0;
		
				
		while (loggedIn!=true && attempt<2) {
		
		System.out.print("Enter your username : ");
		String username = sc.nextLine();
		System.out.print("Enter your password : ");
		String password = sc.nextLine();
		
		if (username.equals("Deepak") && password.equals("Khina")) {
		System.out.println("Welcome Back, " + username + "!");
		
		loggedIn=true;
		
		
		} else {
			System.out.print("Invalid Credential.");
			System.out.print(" You entered " + username);
			System.out.println(" and d " + password);
	  
			attempt+=1;
		}
		}
		

	}	
}



