package practice_Ex02;

public class Ex02_08_inClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 5;		// 변수 선언, 동일 변수 연속 선언
		
		System.out.println("x=" + x + " 입니다.");	// 문자열과 변수 결합
		System.out.println("y=" + y + " 입니다.");
		System.out.println();
		
		int tmp = x;
		x = y;
		y = tmp;
		System.out.println("교환 후 x=" + x + " 입니다.");
		System.out.println("교환 후 y=" + y + " 입니다.");
	}

}
