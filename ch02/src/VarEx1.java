// 변수의 선언과 저장
public class VarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("6+3"); // => 문자열로 인식 (출력 결과 "6+3")
		
		System.out.println(6+3); // 덧셈
		System.out.println(6-3); // 뺼셈
		System.out.println(6*3); // 곱셈
		System.out.println(6/3); // 나눗셈
		
		// => 숫자를 바꾸고 싶으면? 4개의 행을 찾아가 값을 바꿔줘야하는 번거로움이 있다
		// 값을 변수에 담아서 관리하자!
		
		int x = 4, y = 2;
		System.out.println(x+y); // 덧셈
		System.out.println(x-y); // 뺼셈
		System.out.println(x*y); // 곱셈
		System.out.println(x/y); // 나눗셈
		
	}

}
