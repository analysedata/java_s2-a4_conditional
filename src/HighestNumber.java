
public class HighestNumber {

	public static void main(String[] args) {
		double a = 7.3;
		double b = 7.7;
		double c = 7.1;		
		highestNumber(a, b, c);
	}
	
	public static void highestNumber(double a, double b, double c) {
		double result = 0;
		
		for (int x = 0; x < 4; x++) {
			if(a > b && a > c) {
				result = a;
			} else if(b > a && b > c) {
				result = b;
			} else if(c > a && c > b) {
				result = c;
			}
		}
		System.out.println("The highest number is: " + result);
	}

}
