package practice;

public class Practice3 {

	public static void main(String[] args) {
		
		for(int dan=2; dan<=9; dan++) {
			for(int times=1; times<=9; times++) {
				if(dan < times) break;
				System.out.println(dan + "X" + times + "=" + (dan*times));
			}// end of inner for
			System.out.println();
		}// end of for
		
		
	}// end of main

}// end of class
