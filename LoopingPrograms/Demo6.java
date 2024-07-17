public class Demo6 {
	public static void main(String[] args) {

		Demo6 loopingObj = new Demo6();

		loopingObj.find_square_root(25);
		System.out.println(5+5);
		System.out.println("Hi "+ 5 + 5);
		System.out.println("Hi "+ "Hello ");
		loopingObj.decimal_to_binary();
		loopingObj.binary_to_decimal();
	}

	private void binary_to_decimal() {

		int no = 110;
		int power = 0;
		//Demo3 ll = new Demo3();
		int decimal = 0;
		while (no > 0) {
			int rem = no % 10;
			int result = rem * find_power(2, power);
			// System.out.println(result);
			decimal = decimal + result;
			no = no / 10;
			power = power + 1;
		}
		System.out.println(decimal);
	}

	private void decimal_to_binary() {

		int box = 65;
		String result = "";
		while (box > 0) {
			int rem = box % 2;
			result = rem + result;
			box = box / 2;
		}
		System.out.println("Binary is " + result);

	}

	private void find_square_root(int no) {
		int divisor = 2;
		while (divisor < no) {
			if (no / divisor == divisor) {
				System.out.println("Square Root is " + divisor);
				break;
			}
			divisor = divisor + 1;
		}

	}
	public static int find_power(int base, int power) {

		int result = 1;
		while (power > 0) {
			result = result * base;
			power = power - 1;
		}
		return result;
	}

}
