package arrays;

public class PalindromeClassCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String x = "tacocat";
		
		System.out.println(x.charAt(2));
		System.out.println(x.length());
		
		System.out.println("---------Actual Loop - forward-----------");
		 for(int i = 0; i < x.length(); i++) {
			 System.out.println(x.charAt(i) + "  ");
		 }
		 
		 System.out.println("/n____________ so what are we doing?!____________");
			 
		  int temp = x.length()- 1;
		  boolean pal = true;
		  for (int i = 0; i < x.length(); i++) {
			  if (x.charAt(i)!= x.charAt(temp--)) {
				  pal = false;
			  }
		 }
			
		  System.out.println(pal);
		
	}


	}


