/*
 *	while 반복 구문
 *	while(조건식) {
 *      반복수행할 문장;
 *  } 
 *  
 *  조건식이 참인 동안 블록내 문장을 반복실행한다.
 */
package chapter4;

public class A05_WhileStmt {

	public static void main(String[] args) {
		// 1 ~ 10까지의 합계를 구하는 프로그램을 while문을 이용하여 작성해보자.
		// 먼저, 필요한 변수를 선언하고
		
		
		// 숫자가 1부터 10까지 변하는 동안 숫자의 누계를 구한 후
		
		// 결과를 출력한다.
		
		// 1부터 5까지의 수를 출력하는 프로그램을 작성하시오.
		/*
		 * int num =1;
		 * 
		 * System.out.println(num); num++; System.out.println(num); num++;
		 * System.out.println(num); num++; System.out.println(num); num++;
		 * System.out.println(num); num++;
		 */
		// 위 프로그램을 반복문을 사용하여 작성하면....
		int num = 1;
		while(num<=10000) {
			System.out.println(num);
			num++;
		}
	}

}