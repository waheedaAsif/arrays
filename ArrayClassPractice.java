package arrays;

public class ArrayClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//declare an array
		
		// size of array starts for 1
		int numbers [] = new int[5];
		
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		int indexNumber = 0;
		
		System.out.println(numbers[indexNumber++]);
		System.out.println(numbers[indexNumber++]);
		System.out.println(numbers[indexNumber++]);
		System.out.println(numbers[indexNumber++]);
		System.out.println(numbers[indexNumber]);
		
		// ctrl + alt + arrow key down ------ will copy the line you are at
		
		
		System.out.println("the index number " + indexNumber);
		
		System.out.println("printing the array using a loop ----------------");
		System.out.println("size of the array using the length " + numbers.length);
		
		for(int i = 0; i < numbers.length; i++);
		 System.out.println(numbers[4]);
		
	}

	
	

}
