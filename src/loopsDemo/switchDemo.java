package loopsDemo;

public class switchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String day="WeDneSdAy";
//		String lowercaseday=day.toLowerCase();
//		System.out.println(lowercaseday);
//		
//		  switch(day.toLowerCase()) {
//          case "monday":
//          case "tuesday":
//          case "wednesday":
//          case "thursday":
//          case "friday":
//              System.out.println(day + " is a weekday.");
//              break;
//          case "saturday":
//          case "sunday":
//              System.out.println(day + " is a weekend day.");
//              break;
//          default:
//              System.out.println("Invalid day!");
//	}

		String month="JuNe";
		int days=0;
		String lca=month.toLowerCase();
		switch(lca) {
        case ("january"):
             days += 31;
             break;
        case ("march"):
            days += 31;
             break;
        case ("may"):
            days += 31;
             break;
        case "july":
            days += 31;
             break;
        case "august":
            days += 31;
             break;
        case "october":
            days += 31;
             break;
        case "December":
            days += 31;
            break;
            
        case "april":
        case "june":
        case "september":
        case "november":
            days += 30;
            break;
            
        case "february":
            days += 28;
            break;
    }
		System.out.println(days);

		
}
}
