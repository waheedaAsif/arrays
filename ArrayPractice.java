package arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. initializing array
		int[] number = new int[15];
		
		number[4] = 10;
		number[0] = 15;
		number[2] = 18908;
		
		System.out.println(number[2]);
		
		
		//2.initializing and instantiation of array
		 
		int [] grades = {90,50,32,60,50};
		 System.out.println(grades[4]);
		
		
		 //3
		 
		 double []points = { 32.45,67.58,45.7};
		  System.out.println("Array Double "+ points [2]);
		  
		  
		// 4 with forLoop
		  
		  int [] myIntArray = new int [10];
             for ( int i =0; i<10; i++) {
            	 myIntArray[i] = i*5;
            	 System.out.println(i);
            	 
             }for(int i=0; i<10; i++){
            	 System.out.println("Element "+i+" Multiplied by " + myIntArray[i]+".");
            	 
            	 
            	 
            	 
             }
             
             
	}

}
