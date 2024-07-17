public class Demo3 {
	public static void main(String[] args) {
		Demo3 ll = new Demo3();
		ll.addition_of_first_n_numbers(10);
		int factorial = ll.find_factorial(5);
		System.out.println("Factorial is " + factorial);
		int output = ll.find_power(4,5);
		System.out.println("Output is "+ output);
		
		ll.find_common_divisors(200,100);
		ll.find_lcm(3, 8);

	}

	private void find_lcm(int no1, int no2) {

		int big = no1 > no2 ? no1 : no2;
		while (true) {
			if (big % no1 == 0 && big % no2 == 0) {
				System.out.println("LCM is " + big);
				break;
			}
			big = big + 1;
		}

	}

	private void find_common_divisors(int no1, int no2) {

		int div = 2;
		// Ternary Operator
		int small = no1 < no2 ? no1 : no2;

		// if(no1<no2)
		// {
		// small = no1;
		// }
		// else
		// {
		// small = no2;
		// }
		int gcd = 0;
		while (div <= small) {
			if (no1 % div == 0 && no2 % div == 0) {
				// System.out.println(div);
				gcd = div;
			}
			div = div + 1;
		}
		System.out.println("GCD is " + gcd);

	}

	public int find_power(int base, int power) {

		int result = 1;
		while (power > 0) {
			result = result * base;
			power = power - 1;
		}
		return result;
	}

	private int find_factorial(int no) {

		int fact = 1;
		while (no > 0) {
			fact = fact * no; // sum = 60
			no = no - 1; // no = 3
		}
		return fact;
	}

	private void addition_of_first_n_numbers(int no) {

		int sum = 0;
		while (no > 0) {
			sum = sum + no;
			no = no - 1;
		}
		System.out.println("Sum is " + sum);

	}

}
