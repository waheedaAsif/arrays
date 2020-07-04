package arrays;

public class MinArrayandMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] array = {8, 15, 1, 2, 7, 9, 10, 4};
		int data =array.length;
		
		for( int i = 0; i < array.length; i++) {
			if (array[i] < data) {
				data = array [i];
				System.out.println("minimum amount of array " + data);
			}
			
		}
		
		
		int [] maximum = {5, 7, 1, 2, 7, 9, 20, 4};
		int data1 = maximum[0];
		
		for( int i = 0; i < maximum.length; i++) {
			if (maximum[i] > data1) {
				data1 = maximum [i];
				
			}
	}
		System.out.println("maximum amount "+  data1);
	}
}
