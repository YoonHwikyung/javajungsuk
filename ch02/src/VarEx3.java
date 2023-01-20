// 변수의 선언과 저장
public class VarEx3 {

	public static void main(String[] args) {
		
		final int score = 100;
		
//		score = 200; // 상수는 값을 변경할 수 없다 (The final local variable score cannot be assigned.)
		
		// boolean
		boolean power = false;
//		boolean power = 20; => Type mismatch: cannot convert from int to boolean
				
		// byte (-128~127)
//		byte b = 128; => Type mismatch: cannot convert from int to byte
		byte b = 127;
		
		// int
		int oct = 010; // 8진수, 10진수로 8
		int hex = 0X10; // 16진수, 10진수로 16
		System.out.println(oct);
		System.out.println(hex);
		
		// long
		long l = 1_000_000_000;
		long l2 = 10_000_000_000L;
		
		System.out.println(l);
		
		// float, double
		float f = 3.14f;
//		double d = 3.14d;
		double d = 3.14;
		double d1 = 3.14f; // error X : double이 float타입보다 넓은 타입

		System.out.println(f);
		System.out.println(d);	
		
		System.out.println("==============");
		
		System.out.println(10.); //10.0
		System.out.println(.10); //0.1
		System.out.println(10f); //10.0
		System.out.println(1e3); //1000.0
		
		System.out.println("\n======= 문자, 문자열 리터럴, 문자열 결합 =======");
		
		char ch = 'A';
		int i = 'A'; // 문자 A의 코드가 저장
		
		String str = ""; // 빈 문자열(empty string)
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		
		System.out.println(str4);
		
		System.out.println(""+7+7); // "77"
		System.out.println(7+7+""); // "14"
		
		

		
	}

}
