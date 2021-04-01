import java.math.BigInteger;

public class ExponentSum {

	public static void main(String[] args) {
		System.out.println(returnSumOfExponentResult(2, 1000));
		//Result is 1366
	}
	
	private static int returnSumOfExponentResult(Integer base, int power) {
		//Use BigInteger to store large number
		BigInteger resultOfExponent = new BigInteger(base.toString()).pow(power);
		String resultInString = resultOfExponent.toString();
		String[] numbersInString = getEachNumber(resultInString);
		return addEachNumberInStringArray(numbersInString);
	}
	
	private static String[] getEachNumber(String s) {
		String[] nums = new String[s.length()];
		for (int i = 0; i < s.length(); i++) {
			nums[i] = s.substring(i, i+1);
		}
		return nums;
	}
	
	private static int addEachNumberInStringArray(String[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += Integer.parseInt(arr[i]);
		}
		return total;
	}

}
