public class Ex4_8{

	public static void main(String[] args) {

		//괄호{}안의 문장을 3번 반복
//		for(int i=1; i<=3; i++) {    
//			System.out.println("Hello");
//		}
		
		// i = 1,3,5,7,9
//		for(int i=1; i<=10; i+=2) {
//			System.out.println("Hello");
//		}
		
		// i = 1,2,4,8
//		for(int i=1; i<=10; i*=2) {
//			System.out.println("Hello");
//			System.out.println(i);
//		}
		
//		for(int i=1,j=10; i<=10; i++, j--) {
//			System.out.println("i="+i +" j=" +j);
//		}
		
		int i=1; // scope(범위) : 선언 위치부터 선언된 블럭의 끝까지
		for(; i<=10; i++) { // 조건식 모두 생략가능(true로 간주되어 무한 반복문이 된다)
			System.out.println("안녕하세요");
		}
		System.out.println(i);

	}
   
}
