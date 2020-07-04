package arrays;

public class MyPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] points = new int[5];
		
		points[0] = 10;
		points[1] = 15;
		points[2] = 18;
		points[3] = 25;
		points[4] = 89;
		
		int sum = 0;
		for(int i=0; i<points.length; i ++) {
		 System.out.println(points[i]);
		 sum = sum + points[i];
		}
	
		 int average = sum / points.length;
		 System.out.println("sum of all numbers" + sum);
		 System.out.println("Average " + average);
	}
}