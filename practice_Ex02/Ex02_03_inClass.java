package practice_Ex02;

public class Ex02_03_inClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 3;
		System.out.println("--상수 사용 사칙연산--");
		System.out.println(5 + 3);		// 세미콜론 : 문장의 끝을 의미
		System.out.println(5 - 3);
		System.out.println(5 * 3);
		System.out.println(5 / 3);		// 정수 나누기 정수 -> 정수
		System.out.println(5 / 3.0);	// 정수 나누기 실수 -> 실수
		System.out.println();
		
		System.out.println("--변수 사용 사칙연산--");
		System.out.println(a + b);		// 변수 사용
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (float)b);
	}

}
