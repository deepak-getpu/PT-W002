package loopExercise;

public class Excercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = "Sam";

		if (name == "Tom") {
			System.out.println("Hello Tom!");
		} else {
			System.out.println("Your name is not Tom, " + name);
		}

		int age = 12;

		if (age >= 16) {
			System.out.println("You are eligible to get licence.");

		} else {
			System.out.println("You are required to wait " + (16 - age) + " year (s) to get your licence.");

		}

		// if else if else

		int costOfMilk = 4;

		if (costOfMilk <= 2) {
			System.out.println("You can get 3 packets");
		} else if (costOfMilk <= 3) {
			System.out.println("You can get 2 packets");
		} else {
			System.out.println("You can get 0 packsts");
		}

		// Switch

		char grade = 'E';
		int score = 0;

		switch (grade) {
		case 'A':
			System.out.println("90%");
			break;
		case 'B':
			System.out.println("80%");
			break;
		case 'C':
			System.out.println("70%");
			break;
		case 'D':
			System.out.println("60%");
			break;
		default:
			System.out.println("You are fail");
		}

		// nested loop

		if (5 == 5) {
			if (4 == 3) {
				System.out.println("5 is 5 and 4 is 4");
			} else {
				System.out.println("5 is 5");

			}
		}

		if (5 == 5 && 4 == 4) {
			System.out.println("Yes");
		}

		// New Program

		int costOfEggs = 15;
		int dozenOfEggsToPurchase = 0;

		if (costOfEggs <= 5) {
			dozenOfEggsToPurchase = 1;
		} else if (costOfEggs <= 3) {
			dozenOfEggsToPurchase = 2;
		} else if (costOfEggs < 2) {
			dozenOfEggsToPurchase = 3;
		} else {
			dozenOfEggsToPurchase = 0;
		}

		System.out.println(dozenOfEggsToPurchase + " dozens of Eggs.");
	}

}
