package chapter2;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 선언
		Scanner sc = new Scanner(System.in);
		int width, length, area;
		
		// 키보드 입력
		System.out.println("가로 길이는? : ");
		width = sc.nextInt();
		System.out.println("세로 길이는? : ");
		length = sc.nextInt();
		
		//계산
		area = width*length;
		
		//출력
		System.out.println("사각형의 넓이는 "+area+"입니다.");
	}

}