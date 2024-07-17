public class Demo5 {

	public static void main(String[] args) {
		Demo5 ll = new Demo5();
		int count = 5;
		while(count>0)
		{
		ll.find_fact(count);
		count = count - 1;
		}

		int no1 = 1, no2 = 10;
		while (no1 < no2) {
			System.out.println(no1 + " * " + no2 + " = " + (no1 * no2));
			no1 = no1 + 1;
			no2 = no2 - 1;
		}
		ll.find_fact(4);
		ll.find_fact(3);
		ll.find_fact(2);
		ll.find_fact(1);
	}

	private void find_fact(int no) {
		
		int fact = 1;
		while (no > 0) {
			fact = fact * no;
			no = no - 1;
		}
		System.out.println("Factorial is " + fact);

	}

}
