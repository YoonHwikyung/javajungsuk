public class Ex4_7{

	public static void main(String[] args) {

		int num = 0;
		
		//괄호{} 안의 내용을 10번 반복한다.
//		for (int i=1; i<=10; i++) {
//			System.out.println(Math.random()); // 0.0<x<~1.0
//		}
		
		// Quiz. 1~10사이의 난수를 20개
//		for (int i=1; i<=20; i++) {
//			System.out.println(Math.random()*10); // 0.0<x<~10.0
//		}
		
		// Quiz. 1~10사이의 정수를 20개
//		for (int i=1; i<=20; i++) {
//			System.out.println((int)Math.random()*10); // 다 0 나옴 => 곱하기 전에 형변환 했기 때문
//			System.out.println((int) (Math.random()*10)); // 0<=x<10 => 0~9
//			System.out.println((int) (Math.random()*10) +1); // 1<=x<=10 => 1~10
//		}
		
		// Quiz. -5~5사이의 난수를 20개
		// -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5 (11개)
		for (int i=1; i<=20; i++) {
//			System.out.println((int)(Math.random()*11)); // 0<=x<11 => 0~10
			System.out.println((int)(Math.random()*11) -5); // 0<=x<11 => 0~10
		}
		
		//괄호{} 안의 내용을 5번 반복한다.
//		for (int i=1; i<=5; i++) {
//			num = (int)(Math.random() * 6);
//			System.out.println(num);
//		}

	}

}
