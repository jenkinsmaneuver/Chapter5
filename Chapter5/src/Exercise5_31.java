import java.util.Scanner;

public class Exercise5_31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your credit card number: ");
		long creditCardNum = input.nextLong();

		
		//System.out.println(sumOfDoubleEvenPlace(creditCardNum));
		
		if (isValid(creditCardNum)) {
			System.out.println(creditCardNum + " is valid");
		}
		else {
			System.out.println(creditCardNum + " is invalid");
		}
	}
	
		public static boolean isValid(long number) {
			return (getSize(number) >= 13) && (getSize(number) <= 16)
					&& (prefixMatched(number, 4) || prefixMatched(number, 5)
						|| prefixMatched(number, 6) || prefixMatched(number, 37))
							&& (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number))
								% 10 == 0;			
		}
		
		public static int sumOfDoubleEvenPlace(long number) {
			number = number / 10;
			int sum = 0;
			while (number != 0) {
				sum = sum + getDigit((int)((number % 10) * 2));
				number = number / 100;
			}
			return sum;
		}
		
		public static int getDigit(int number) {
			int sum = 0;
			sum = (number % 10) + (number / 10); 
			//System.out.println(sum);
			return sum;
		}
		
		public static int sumOfOddPlace(long number) {
			int sum = 0;
			while (number != 0) {
				sum = (sum + (int)(number % 10));
				number = number / 100;
			}
			return sum;
		}
		
		public static boolean prefixMatched(long number, int d) {
			return getPrefix(number, getSize(d)) == d;
		}
		
		public static int getSize(long d) {
			int count = 0;
			while(d != 0) {
				d = d / 10;
				count++;
			}
			return count;			
		}
		
		public static long getPrefix(long number, int k) {
			long prefix = number;
			
			for (int i = 0; i < getSize(number) - k; i++) {
				prefix = prefix / 10;
			}
			return prefix;			
		}
}
