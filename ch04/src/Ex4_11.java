public class Ex4_11{

	public static void main(String[] args) {
		//중첩for문
		
		// 2~9단 구구단  출력 
//		for(int i=2; i<=9; i++) {
//			for(int j=1; j<=9; j++) {
//				System.out.println(i+"*"+j+"=" + i*j);
//			}
//			System.out.println();
//		}
		
		// 별찍기 1.
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
//		System.out.println("**********");
		
//		for(int i=1; i<=5; i++) { //{}내용을 5번 반복
//			System.out.println("**********");
//		}
		
//		for(int j=1; j<=10; j++) {
//			System.out.print("*");
//		}
//		
//		for(int i=1; i<=5; i++) { //행
//			for(int j=1; j<=10; j++) {//열
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// 별찍기 2.
//		System.out.println("*");
//		System.out.println("**");
//		System.out.println("***");
//		System.out.println("*****");
//		System.out.println("******");
//		
		for(int i=1; i<=10; i++) { //행
			for(int j=1; j<=i; j++) {//열
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
   
}
