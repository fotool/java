package practice;

public class Practice4 {

	public static void main(String[] args) {
		int lineCount = 4;
		int spaceCount = lineCount/2+1;
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) {
			for(int j = 0; j<spaceCount; j++) {
				System.out.println(' ');
			}// end of inner for1
			for(int j=0; j<starCount; j++) {
				System.out.println('*');
			}// end of inner for2
			for(int j=0; j<spaceCount; j++) {
				System.out.println(' ');
			}// end of inner for3
			spaceCount-=1;
			starCount+=2;
			System.out.println();
		}// end of for

	}

}