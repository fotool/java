// p.123 연습문제 2

package practice;

public class practice2 {

	public static void main(String[] args) {
		// 변수 선언
		int dan, times;
		
		// 출력
		for(dan=1; dan<=10; dan++) {
			if(dan % 2 !=0) continue;
			for(times=1; times<=9; times++) {
				System.out.println(dan + "X" + times + "=" + (dan*times));
			}// end of inner for
			System.out.println();
		}// end of for
		
	}

}
