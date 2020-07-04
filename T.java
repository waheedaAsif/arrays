package arrays;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] lotterynum = {{10,15,20},
                {25,30,35}};
		
		lotterynum[0][0]=10;
		lotterynum[0][1]=15;
		lotterynum[0][2]=20;
		lotterynum[1][0]=25;
		lotterynum[1][1]=30;
		lotterynum[1][2]=35;
		
System.out.println("Lotterynum " + lotterynum [0][2]);


for (int i = 0; i < 2; i++ ) {
	   System.out.println(lotterynum[i][i]);
	   
	   
	}
	}
}
