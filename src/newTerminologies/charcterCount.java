package newTerminologies;

public class charcterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//Example 1
		
		String randomWord="Therefore";
	     int len1 = randomWord.length(); 
	     
	       if(len1 >= 10) {
	           System.out.println("That is a really long word!");   
	       } else {
	    	   System.out.println("Not so long word");
	       }
		
  //Example 2
	       
	    String str="Hello World!";
		String uppercase = str.toUpperCase();
		System.out.println(uppercase);
		
 //Example 3
		
      String userWord = "Khina";
      int len = userWord.length();
      
		do {	  
			if (len <= 5 ) {
				System.out.println(userWord);
		    } 
		    len--;
		} while ( len > 0 );
		
		

// printing of the charcter located within a string
		
//		System.out.println(str.Alt(0)); 
		
	
	}

}
