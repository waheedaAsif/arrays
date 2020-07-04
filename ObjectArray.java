package arrays;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] data = new String [5][2];
		
		data[0][0] ="sam";
		data[0][1] ="123";
		
		data[1][0] ="bam";
		data[1][1] ="321";
		
		data[2][0] ="mam";
		data[2][1] ="231";
		
		data[3][0] ="dam";
		data[3][1] ="312";
		
		data[4][0] ="wam";
		data[4][1] ="213";
		
		System.out.println(data.length);
		System.out.println(data[4].length);
		
		
		for (int outter= 0; outter < data.length; outter++ ) {
			for ( int inner = 0; inner< data[outter].length; inner++ ) {
				
				
				System.out.print(data[outter][inner] + " ");
			//	System.out.print("outter "+ outter + " inner" + inner);
				
			}
			System.out.println();
	}
	
	//	
//		int numberAreFun [][] = new int [100][100];
//		int num = 1;
//		
//		
//		for(int row = 0; row < numberAreFun.length; row++) {
//			for( int col = 0; col < numberAreFun[row].length; col++) {
//				numberAreFun[row][col] = num++;
//				
//			}
//		}
//		
//		
//		for ( int row = 0; row < numberAreFun.length; row++) {
//			for ( int col = 0; col < numberAreFun[row].length; col ++) {
//				System.out.print(numberAreFun[row][col] + " ");
//				
//			}
//			System.out.println();
//		}
//		
		String x = "t-tacocat-t";
//		System.out.println(x.charAt(2)); // char at will return the character at that index
//		System.out.println(x.length()); // method length will return the size of the string
//		
//		
//		System.out.println("----------------------------Actual Loop ------------------------------");
//		for ( int i = 0; i < x.length(); i++) {
//			System.out.println(x.charAt(i) + "    ");
//		}
//		System.out.println("/n---------------------------Actual Loop- backward ------------------------");
//		for ( int i = x.length()-1; i >= 0; i--) {
//			System.out.println(x.charAt(i) + "  ");
//			
//		
//		}
		System.out.println("/n---------------------------so what are we doing -----------------------");
		int temp = x.length()-1;
	    boolean pal = false;
		
		for (int i = 0; i < x.length();i++) {
			if (x.charAt(i) != x.charAt(temp--)) {
				pal = true;
			
	}
		}
		System.out.println(pal);
	}
}