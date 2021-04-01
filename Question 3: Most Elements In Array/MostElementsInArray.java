import java.util.HashMap;

public class MostElementsInArray {

	private static int[] numbersOne = {99, 86, 99, 99, 95, 86};
	private static int[] numbersTwo = {23, 15, 15, 74, 23};
	private static int[] numbersThree = {76};
	
	public static void main(String[] args) {
		System.out.println(mode(numbersOne)); //99
		System.out.println(mode(numbersTwo)); //15
		System.out.println(mode(numbersThree)); //76
	}
	
	private static int mode(int[] arr) {
		HashMap<Integer, Integer> hashmap = new HashMap<Integer,Integer>();
		int highestKey = 0;
		for (int i = 0; i < arr.length; i++) {
			int number = arr[i];
			if (hashmap.containsKey(number)) {
				int newValue = hashmap.get(number) + 1;
				hashmap.replace(number, newValue);
				if (isReplaceable(hashmap, highestKey, number)) {
					highestKey = number;
				}
			} else {
				hashmap.put(number, 1);
				if (hashmap.size() == 1) {
					highestKey = number;
				}
				if (isReplaceable(hashmap, highestKey, number)) {
					highestKey = number;
				}
			}
		}
		return highestKey;
	}
	
	private static boolean isReplaceable(HashMap<Integer, Integer> hashmap, int highestKey, int number) {
		if (hashmap.get(highestKey) < hashmap.get(number))
			return true;
		if (hashmap.get(highestKey) == hashmap.get(number) && highestKey > number)
			return true;
		return false;
	}

}
