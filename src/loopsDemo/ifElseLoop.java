package loopsDemo;

public class ifElseLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// if elseif else
		
				int wins=1;
				int losses=2;
				boolean isFall=true;
			
				
				if((wins>losses) && (isFall==true))	{
					 System.out.println("It's looking good for your team to make the playoffs.");
					
				} 
				
				else if((wins>losses) && (isFall==false)) {
					    System.out.println("Your favorite team has promise, but it's too early to tell.");
					
				} 
				
				else {
					  System.out.println("It's not looking too good.");
				}
					
		// if elseif else
				
				  int mondayTemp=50;
				    int tuedayTemp=40;
				    int sundayTemp=45;
				    
					if((mondayTemp<tuedayTemp) && (sundayTemp<tuedayTemp)) {
				            System.out.println("Tuesday");
				            
				      } else if((mondayTemp>sundayTemp) && (mondayTemp>tuedayTemp)) {
				            System.out.println("Monday");
				      } else {
				          System.out.println("Sunday");
				      }
	
		// if elseif else
			
			int num1=2;
			int myNumber=4;
					    
				if(num1<myNumber) {
					 System.out.println(num1 + " is smaller than my number, " + myNumber);
					      
				} else if(num1>myNumber) {
					  System.out.println(num1 + " is larger than my number, " + myNumber);
					      
				} else if (num1==myNumber) {
					   System.out.println(num1 + " is equal to my number, " + myNumber);
			    }
						
	// if else 
				
				int userNummber=30;
				
				if((userNummber>10) && (userNummber<100)) {
					
					do {
					 
						userNummber--;
					    
					} while(userNummber>=10); {
					    System.out.println(userNummber);
					}
					
				} else {
					System.out.println("Your number is not a value that is more than 10 and less than 100.");
				}
				
	// if else
	}

}
