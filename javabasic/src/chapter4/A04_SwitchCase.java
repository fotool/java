package chapter4;

import java.util.Scanner;

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
	/*
	 * public static void main(String[] args) { int number1 = 6; int remainder;
	 * remainder = number1 % 2;
	 * 
	 * switch(remainder) { case 0: System.out.println("짝수"); break; case 1:
	 * System.out.println("홀수"); break; }
	 * 
	 * }
	 */
	/*
	 * public static void main(String[] args) { int number1 = 3;
	 * 
	 * 
	 * switch(number1) { case 0: System.out.println("숫자 1"); break; case 2:
	 * System.out.println("숫자 2"); break; case 3: System.out.println("숫자 3"); break;
	 * default: break; } }
	 */
	public static void main(String[] args) {
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		int number1, number3, number4, number5;
		
		// 키보드 입력
		System.out.println("숫자를 입력하세요 :");
		number1 = sc.nextInt();
		
		
		if(number1 % 3 ==0) {
			System.out.println("3의 배수입니다~");
		}else if(number1 % 4 == 0) {
			System.out.println("4의 배수입니다.");
		} else if(number1 % 5 == 0 ) {
			System.out.println("5의 배수입니다!");
		} else {
			System.out.println("그 외의 경우의 수입니다~");
		}
	}
}