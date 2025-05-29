package testproject;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		System.out.println(reverseNum(num));
	}

	private static int reverseNum(int num) {
		// TODO Auto-generated method stub
		int rev = 0;
		while (num > 0) {
			int lastDigit = num % 10;
			rev = rev * 10 + lastDigit;
			num /= 10;
		}
		return rev;
	}

}
