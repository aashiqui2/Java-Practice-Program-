public class Demo1 {

	public static void main(String[] args) {
		Demo1 ll = new Demo1();
		ll.print_11111();
		ll.print_12345();
		ll.print_13579();
		ll.print_246810();
		ll.print_3691215();
		ll.print_3691215_2();
		ll.print_multiples_3_and_5();
		ll.print_multiples_3_or_5();
		ll.print_divisors(100);
		ll.find_count_of_divisors(100);
		ll.countDivisorOfANumber();
		ll.print_diff();
		ll.find_prime_number(313);
	}

	void find_prime_number(int no) {
		int div = 2;
		int count = 0;
		while (div < no) {
			if (no % div == 0) {
				// System.out.println("Not Prime");
				count = count + 1;
				break;

			}
			div = div + 1; // 2 to 99
			// System.out.println(count);
		}
		// System.out.println(count);
		if (count == 0) {
			System.out.println(no + " is Prime ");
		}
		// else
		// {
		// System.out.println("Given Number is Not Prime");
		// }

	}

	private void print_diff() {

		System.out.println(5);
		System.out.print(4);
		System.out.println(3);

	}

	private void find_count_of_divisors(int no) {

		int div = 2;
		int count = 0;
		while (div < no) {
			if (no % div == 0) {
				// System.out.print(div+" ");
				count = count + 1;
			}
			div = div + 1; // 2 to 99
			// System.out.println(count);
		}
		System.out.println(count);

	}

	private void countDivisorOfANumber() {

		int no = 1;
		int divisor = 5;
		int count = 0;
		while (no <= 100) {
			if (no % divisor == 0) {

				// System.out.println
				// ( no + " is divisor of "+ divisor );
				count = count + 1;
			}
			no = no + 1;
		}
		System.out.println(" total number of divisible numbers are " + count);

	}

	private void print_divisors(int no) {

		int div = 2;
		while (div < no) {
			if (no % div == 0) {
				System.out.print(div + " ");
			}
			div = div + 1;
		}

	}

	private void print_multiples_3_or_5() {

		int no = 1;
		while (no <= 30) {
			if (no % 3 == 0 || no % 5 == 0) {
				System.out.println(no);
			}
			no = no + 1;
		}
	}

	private void print_multiples_3_and_5() {

		int no = 1;
		while (no <= 30) {
			if (no % 3 == 0 && no % 5 == 0) {
				System.out.println(no);
			}
			no = no + 1;
		}

	}

	private void print_3691215_2() {

		int no = 1;
		while (no <= 5) {
			System.out.print((no * 3) + " ");
			no = no + 1;
		}

	}

	private void print_3691215() {

		int no = 3;
		while (no <= 15) {
			System.out.print(no + " ");
			no = no + 3;
		}

	}

	private void print_246810() {

		int no = 2;
		while (no <= 10) {
			System.out.print(no + " ");
			no = no + 2;
		}

	}

	private void print_13579() {

		int no = 1;
		while (no <= 9) {
			System.out.print(no + " ");
			no = no + 2;
		}

	}

	private void print_12345() {

		int no = 1;
		while (no <= 5) {
			System.out.print(no + " ");
			no = no + 1;
		}

	}

	private void print_11111() {

		int no_of_times = 1;
		while (no_of_times <= 5) {
			System.out.print(1 + " ");
			no_of_times = no_of_times + 1;
		}

	}

}
