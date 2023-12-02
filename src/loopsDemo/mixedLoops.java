package loopsDemo;

public class mixedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int userNumber =95;
		
		if((userNumber<101) && (userNumber>0)) {
			int i = userNumber;
				while(i<101) {
					System.out.println(i);
					i++;
				}
		} else {
			System.out.println("Your number was not between 1 and 100.");
		}
	}

}
