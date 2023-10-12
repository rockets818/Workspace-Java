package practice_Ex02;

public class Ex02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "www.naver.com";
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(d);
		
		System.out.println("-----------------------------------");
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d);
		System.out.printf("d=%014.10f%n", d);
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%30s]%n", url);
		System.out.printf("[%-30s]%n", url);
		System.out.printf("[%.8s]%n", url);
		System.out.printf("[%.3s]%n", url);
		System.out.printf("[%.10s]%n", url);
		
	}

}
