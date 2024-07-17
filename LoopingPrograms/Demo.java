public class Demo {
		public static void main(String[] args) {

		Demo ll = new Demo();
		ll.dad_daughter();
		ll.dad_daughter2();
		ll.tenali_story();
		ll.tenali_story_2();
		ll.flower_count();
		ll.milk_expense();
		ll.milk_expense2();
		ll.milk_expense3();
	}

	private void milk_expense3() {

		int expense = 0;
		int day = 1;
		int milk = 20;
		while (day <= 28) {
			expense = expense + milk;
			System.out.println("Milk given on " + day);
			day = day + 2;

		}
		// System.out.println(expense/2);
		System.out.println(expense);
	}

	private void milk_expense2() {

		int expense = 0;
		int day = 1;
		int milk = 20;
		while (day <= 28) {
			expense = expense + milk;
			day = day + 1;
			// day = day + 1;
			// day = day + 2;

		}
		// System.out.println(expense/2);
		System.out.println(expense);

	}

	private void milk_expense() {

		int expense = 0;
		int day = 1;
		int milk = 20;
		while (day <= 28) {
			expense = expense + milk;
			day = day + 1;
		}
		System.out.println(expense);

	}

	private void flower_count() {

		int temple = 7;
		int flower = 1;
		while (temple > 0) {
			flower = flower * 2;
			temple = temple - 1;
		}
		System.out.println("Initially " + flower);

	}

	private void tenali_story_2() {

		int beat = 1024;
		int security_count = 0;
		while (beat > 1) {
			// System.out.println("Security gets " + (beat/2));
			security_count = security_count + 1;
			beat = beat / 2;
		}
		System.out.println("No. of Securities " + security_count);
		System.out.println("One for Me");

	}

	private void tenali_story() {

		int beat = 1024;
		while (beat > 1) {
			System.out.println("Security gets " + (beat / 2));
			beat = beat / 2;
		}
		System.out.println("One for Me");
	}

	private void dad_daughter2() {

		int purse = 0;
		int day = 1;
		while (day <= 10) {
			purse = purse + 5;
			day = day + 1;
		}
		System.out.println(purse);
	}

	private void dad_daughter() {

		int purse = 0;
		int day = 1;
		while (day <= 10) {
			purse = purse + day;
			System.out.println("purseed milk in day "+day+" "+purse);
			day = day + 1;
		}
		System.out.println(purse);
	}

}
