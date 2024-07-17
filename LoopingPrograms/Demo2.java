public class Demo2 {
	public static void main(String[] args) {

		Demo2 ll = new Demo2();
		ll.print_reverse(12345);
		ll.count_of_digits(4567);
		int result = ll.sum_of_digits(1234567); // 28 //10 //1

		while (result > 9) {
			result = ll.sum_of_digits(result);
		}
		System.out.println(result);
		ll.reverse_given_number(12345);
		ll.find_palindrome(1221);
		ll.find_armstrong(153);
		ll.even_position_sum(123456);
		ll.sumofmulofthree(13469367);
		int no = 9;
		int power = ll.find_power(no);
		int sum = ll.sum_of_digits(power);
		if(sum == no)
		{
		
		}
	}

	private int find_power(int no) {

		return no * no;

	}

	private void find_armstrong(int plate1) {

		int plate3 = plate1;
		int plate2 = 0; // 12345

		while (plate1 > 0) {
			int rem = plate1 % 10; // 4
			plate2 = plate2 + (rem * rem * rem); // 27 + 125 + 1
			plate1 = plate1 / 10; // 1234
		}
		System.out.println("plate1 " + plate1);
		System.out.println("plate2 " + plate2);
		if (plate3 == plate2) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}

	}

	private void find_palindrome(int plate1) {

		int plate3 = plate1;
		int plate2 = 0; // 12345

		while (plate1 > 0) {
			int rem = plate1 % 10; // 4
			plate2 = (plate2 * 10) + rem;
			plate1 = plate1 / 10; // 1234
		}
		System.out.println("plate1 " + plate1);
		System.out.println("plate2 " + plate2);
		if (plate3 == plate2) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

	private void sumofmulofthree(int num) {

		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			if (rem % 3 == 0) {
				sum = sum + rem;
			}
			num = num / 10;
		}
		System.out.println(sum);

	}

	private void even_position_sum(int plate) {

		int sum = 0;
		while (plate > 0) {
			int no = plate / 10;
			int rem = no % 10;
			sum = sum + rem;
			no = no / 10;
			plate = no;

		}
		System.out.println(sum);

	}

	private void reverse_given_number(int plate1) {

		int plate2 = 0; // 12345

		while (plate1 > 0) {
			int rem = plate1 % 10; // 4
			plate2 = (plate2 * 10) + rem;
			plate1 = plate1 / 10; // 1234
		}
		System.out.println(plate2);

	}

	private int sum_of_digits(int plate) {

		int count_of_digits = 0;
		int sum = 0;
		while (plate > 0) {
			int rem = plate % 10;
			sum = sum + rem;

			plate = plate / 10;
			count_of_digits = count_of_digits + 1;
		}
		// System.out.println("Digits count is " + count_of_digits);
		System.out.println("Sum of Digits is " + sum);
		return sum;
	}

	private void count_of_digits(int plate) {

		int count_of_digits = 0;
		while (plate > 0) {
			// System.out.println(plate%10);

			plate = plate / 10;
			count_of_digits = count_of_digits + 1;
		}
		System.out.println("Digits count is " + count_of_digits);
	}

	private void print_reverse(int plate) {

		while (plate > 0) {
			System.out.println(plate % 10);
			plate = plate / 10;
		}

	}

}
