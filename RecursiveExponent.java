
public class RecursiveExponent {

	public static void main(String[] args) {
		System.out.println(exponent(2, 10));
	}
	
	//There needs to be a base case because if there is not it will continue
	//to recurse beyond n == 1;
	public static double exponent(double a, int n) {
		if (n == 1)
			return a;
		
		return a*exponent(a,n-1);
	}

}
