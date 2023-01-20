// printf()
public class PrintfEx1 {

	public static void main(String[] args) {

		/**
		 * println의 단점 : 출력형식 지정 불가
		 */
		// 1. 실수의 자리수 조절 불가 - 소수점 n자리만 출력하려면?
		
		// println 으로 10/3 출력
		System.out.println("ptintln. 10/3 = " + 10/3); // => 결과값 = 3 (정수/정수 = 정수)
		System.out.println("ptintln. 10.0/3 = " + 10.0/3); // => 결과값 = 3.3333333333333335 (실수/정수 = 실수)
		
		// 2. 10진수로만 출력 - 8,16진수로 출력하려면?
		System.out.println("ptintln. 0x1A = " + 0x1A); // => 결과값 = 26 (10진수)
		
		/**
		 * printf() : 지시자를 이용해서 출력형식 지정 가능
		 * 
		 * printf()의 지시자
		 * - 정수
		 * 	- %b : boolean 형식으로 출력
		 * 	- %d : 10진수(decimal) 정수의 형식으로 출력
		 * 	- %o : 8진수(octal) 정수의 형식으로 출력
		 * 	- %x : 16진수(hexa-decimal) 정수의 형식으로 출력
		 * 
		 * - 실수
		 * 	- %f : 부동 소수점(floating-point)의 형식으로 출력
		 * 	- %e : 지수(exponent) 표현식의 형식으로 출력
		 * 
		 * -문자
		 * 	- %c : 문자(character)로 출력
		 *	- %s : 문자열(string)로 출력
		 */
		
		// %.2f : 실수를 소수점 둘째 자리 까지 출력
		System.out.printf("%.2f\n", 10.0/3); // 3.33
		
		
		/**
		 * 정수를 10진수, 8진수, 16진수, 2진수로 출력
		 */
		// %d : 10진수
		System.out.printf("%d\n", 0x1A); // 26
		System.out.printf("%d\n", 15); // 15
		
		// %o : 8진수
		System.out.printf("%o\n", 15); // 17
		
		// %x : 16진수
		System.out.printf("%x%n", 0x1A);// 1a
		System.out.printf("%x\n", 15); // f
		
		// 2진수 : Integer.toBinaryString();
		System.out.printf("%s%n", Integer.toBinaryString(15)); // 1111
		
		/**
		 * 8진수와 16진수에 접두사 붙이기 : #
		 */
		System.out.printf("%#o\n", 15); // 017
		System.out.printf("%#x\n", 15); // 0xf
		System.out.printf("%#X\n", 15); // 0Xf
		
		/**
		 * 실수 출력을 위한 지시자 %f - 지수형식(%e, 간략한 형식 %g)
		 */
		float f = 123.4567890f;
		System.out.printf("%f%n", f); // 123.456787 (소수점 아래 6자리) 정밀도 7자리+의미없는 2자리
		System.out.printf("%e%n", f); //  1.234568e+02 (지수형식)
		
		System.out.printf("%g%n", 123.456789); //  123.457 (7자리의 간략한 형식)
		System.out.printf("%g%n", 0.00000001); //  1.00000e-08 (간략한 형식)
		
		System.out.printf("[%5d]%n", 10);  // [   10] 왼쪽 공백
		System.out.printf("[%-5d]%n", 10); // [10   ] 오른쪽 공백
		System.out.printf("[%05d]%n", 10); // [00010] 0으로 채움
		
		double d = 1.23456789;
		// 전체자기 14자리에 소수점자리를 10자리로 출력
		System.out.printf("%14.10f%n", d); //  1.2345678900 : 앞공백2, 뒤0 2개
		System.out.printf("%14.6f%n", d); //      1.234568: \소수점자리 6글자
		System.out.printf("%.6f%n", d); //1.234568 : 전체자리 생략, 소수점 6자리

		
		String url = "www.codechobo.com";
		System.out.printf("[%s]%n", url);    // [www.codechobo.com]
		System.out.printf("[%20s]%n", url);  // [   www.codechobo.com]
		System.out.printf("[%-20s]%n", url); // [www.codechobo.com   ]
		System.out.printf("[%.8s]%n", url);  // [www.code]


		// 여러개의 지시자
		System.out.printf("age:%d year:%d%n", 14, 2017);

	}

}
