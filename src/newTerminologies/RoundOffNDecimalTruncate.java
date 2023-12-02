package newTerminologies;

public class RoundOffNDecimalTruncate {

	public static void main(String[] args) {
		
		int[] testScores = new int[6];
		testScores[0] = 1;
		testScores[1] = 5;
		testScores[2] = 2;
		testScores[3] = 8;
		testScores[4] = 13;
		testScores[5] = 6;
			
		
		double average = 0; 
		double sum = 0;
		
		for (int i=0; i<testScores.length; i++) {
			sum += testScores[i];
			average = (sum)/testScores.length; 
			
		} 
		System.out.println(Math.round(average));
		System.out.printf("%.2f", average);
	}

}
