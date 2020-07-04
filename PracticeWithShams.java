package arrays;

public class PracticeWithShams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int []onedimensionarray1 = { 34, 43, 65, 1, 90 };
		System.out.println(onedimensionarray1[2]);
		
		int [] onedimensionarray2 = new int [5];
		 onedimensionarray2[0] = 34;
		 onedimensionarray2[1] = 43;
		 onedimensionarray2[2] =  65;
		 onedimensionarray2[3] =  1;
		 onedimensionarray2[4] = 90;
		 
		 System.out.println(onedimensionarray2[2]);
		 
		 // Two DimensionArray
		 
		 int [] [] twodimensionArray1 = {{23, 43, 65, 1, 90},
				                          {9, 8, 7, 6, 5}};
		 
		 System.out.println(twodimensionArray1[1][2]);
		 System.out.println(twodimensionArray1[1][0]);
		 
		 int[][] twodimensionArray2 = new int [2][5];
		 
		 twodimensionArray2 [0][0] = 23;
		 twodimensionArray2 [0][1] = 43;
		 twodimensionArray2 [0][2] = 65;
		 twodimensionArray2 [0][3] = 1;
		 twodimensionArray2 [0][4] = 90;
		 twodimensionArray2 [1][0] = 9;
		 twodimensionArray2 [1][1] = 8;
		 twodimensionArray2 [1][2] = 7;
		 twodimensionArray2 [1][3] = 6;
		 twodimensionArray2 [1][4] = 5;
		 
		 System.out.println(twodimensionArray2[1][4]);
		 
		 // three dimenstionArray
		 System.out.println("------------------3D Array---------------");
		 
		 int[][][] threedimensionArray = {{{34, 45, 67},
			                               {23, 31, 56},
			                               {12, 38, 90}}};
		 
		  System.out.println(threedimensionArray[0][1][2]);
		  System.out.println(threedimensionArray[0][0][0]);
		  System.out.println(threedimensionArray[0][2][2]);
		  System.out.println(threedimensionArray[0][2][0]);
				  
		  int[][][] threedimensionArray1 = new int [3][3][3];
		  threedimensionArray1[0][1][2] = 56;
		  threedimensionArray1[0][1][1] = 45;
		  System.out.println(threedimensionArray1[0][1][2]);
		  
	}
	

}
