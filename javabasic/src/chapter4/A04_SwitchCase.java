package chapter4;

public class A04_SwitchCase {

	/*
	 * public static void main(String[] args) { int number1 = 3;
	 * 
	 * 
	 * switch(number1) { case 0: System.out.println("숫자 1"); break; case 2:
	 * System.out.println("숫자 2"); break; case 3: System.out.println("숫자 3"); break;
	 * }
	 */
		/* if (number1 == 1){
		 * 
		 * }else if(number1 ==2){
		 * 
		 * }else if(number1 ==3){
		 * 
		 * }
		 */
		public static void main(String[] args) {
			int number1 = 5;
			int remainder;
			remainder = number1 % 2;
			
			switch(remainder) {
			case 0:
				System.out.println("짝수");
				break;
			case 1:
				System.out.println("홀수");
				break;
			}

		}
}