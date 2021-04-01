
public class NaturalNumbers {

	private static final int NUM_NATURALS = 100;
	
	public static void main(String[] args) {
		int sqaureOfSumNum = getSquareOfSumNums();
		int	sqaureOfNumsSum = getSquareOfNumsSum();
		int total = sqaureOfNumsSum - sqaureOfSumNum;
		System.out.println("Total: " + total);
		//Total 25164150
	}
	
	private static int getSquareOfSumNums() {
		int total = 0;
		for (int i = 1; i <= NUM_NATURALS; i++) {
			total += (int) Math.pow((double) i , 2);
		}
		return total;
	}
	
	private static int getSquareOfNumsSum() {
		int total = 0;
		for (int i = 1; i<= NUM_NATURALS; i++) {
			total += i;
		}
		return (int) Math.pow((double) total, 2.0);
	}

}
