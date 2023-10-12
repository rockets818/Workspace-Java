package practice_Ex02;
public class Ex02_09_inClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "www.codechobo.com";
		float f1 = .10f; // 0.10, 1.0e-1
		float f2 = 1e1f; // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
//		----------------------------------------------- 
//		선언부와 실행부는 한 줄 띄우자.
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d);		// 전체 14자리 중 소수점 10자리
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);		// 왼쪽 정렬
		System.out.printf("[%.8s]%n", url);			// 왼쪽에서 8글자만 출력
		
		float pi = 3.1415927f;
		double pi1 = 3.14159278912345;
		
		// 줄바꿈 : \n, %n (new line의 약자)
		System.out.printf("%f\n", pi);			// float은 소수점이하 6자리까지 출력(반올림)
		System.out.printf("%5.2f\n", pi);		// 7자리 확보, 소수점 2자리 출력
		System.out.printf("%07.2f\n", pi);		// 자리수 중 빈 곳은 0으로 채움
		System.out.printf("%2.15f\n", pi1);
		
		//정수
		int a = 55;
		int b = 126;
		
		System.out.printf("기본 정렬  : %d, %d\n", a, b);
		System.out.printf("자리수 정렬: %5d, %05d\n", a, b);
		System.out.printf("왼쪽 정렬  : %-5d, %05d\n", a, b);
		
		//문자, 문자열
		char c = 'C';				// 기본형
		String str = "abcd";		// 기본형이 아님, class 형/참조형
		
		System.out.printf("기본 정렬: \n%c\n%5c\n", c, c);
		System.out.printf("왼쪽 정렬: \n%c\n%-5c\n", c, c);
		System.out.printf("오른쪽 정렬: \n%s\n%5s\n", str, str);
		System.out.printf("왼쪽 정렬 : \n%5s\n%-5s\n", str, str);
	}

}
