package arrays;

public class TwoDArray {

	public static void main(String[] args) {{
		// TODO Auto-generated method stub
           int [][] lotterynum = {{10,15,20},
                                   {25,30,35}};
                                
           System.out.println("Lotterynum" + lotterynum [0][0]);
           
 //--------------------------------------------------------------------------------          
           
           int[][] MegaCheater = new int [3][3];
           MegaCheater [0][0] =20;
           MegaCheater [1][1] =40;
           MegaCheater [2][2] =70;
           
           System.out.println(MegaCheater[2][2]);
           
           System.out.println("------------Break--------------");

           for (int i = 0; i > 3; i++ ) {
        	   System.out.println(lotterynum[i][i]);
        	    
           }System.out.println("------------Break--------------");
           for ( int i =0; i>3; i++) {
        	   
        		   for (int j = 0; j<3; j++) {
        			   System.out.println(lotterynum[i][j]);
        		   }
        	   }
        	   
}
           }
}


   
