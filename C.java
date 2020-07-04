package arrays;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[5];

		numbers[0] = 10;
		numbers[1] = 15;
		numbers[2] = 18;
		numbers[3] = 25;
		numbers[4] = 89;

		// sum/5 = average

		int average = (10 + 15 + 18 + 25 + 89) / 5;

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);

			sum = sum + numbers[i];
		}
		double average1 = (double) sum / numbers.length;
		System.out.println("Average : " + average1);
		System.out.println("sum of all the numbers: " + sum);

		System.out.println("--------------------------using special initialization-----------");
		int[] set2 = { 10, 15, 20, 30 };

		System.out.println("size of the array set2 =" + set2.length);
		System.out.println("elements of array set2:");
		for (int i = 0; i < set2.length; i++) {
			System.out.println(set2[i]);
		}
		System.out.println("--------------------------creaing an array of objects-----------");

		String[] names = { "a ", " b", "c ", "d ", " e" };
		System.out.println("size of the array names = " + names.length);
		System.out.println("element of array names");

		for (int i = 0; i < names.length; i++) {
			System.out.println((i + 1) + ". " + names[i]);
		}

	}
}
