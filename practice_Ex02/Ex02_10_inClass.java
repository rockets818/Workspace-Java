package practice_Ex02;
import java.util.*;	// 외부 자료형을 소스코드에 삽입한다.
public class Ex02_10_inClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner는 참조형 변수를 만드는 클래스 자료형이다.
		// 기본형이 아닌 것은 반드시 외부에서 가져와야 한다. (import)
/*		Scanner scanner = new Scanner(System.in);		// 입력객체 scanner 선언.
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();				// 문자열을 엔터까지 입력해서 input에 저장. 
		
		int num = Integer.parseInt(input);				// 입력받은 문자열을 숫자로 변환.
		System.out.println("입력내용 :" + input);
		System.out.printf("num = %d%n", num);
*/
		
		// 두 수를 입력하여 덧셈한다.
		// 1. 두 수 입력: Scanner
		// 2. 입력한 두 수는 문자열이므로 숫자로 변환: parseInt()
		// 3. 두 수를 더하고 결과 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 수: ");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		
		System.out.print("두번째 수: ");
		String input2 = scanner.nextLine();
		int num2 = Integer.parseInt(input2);
		
		System.out.println("입력내용 :" + input1 + ", " + input2);
		System.out.printf("addition = %d\n", num1 + num2);
		System.out.printf("subtration = %d\n", num1 - num2);
		System.out.printf("multiplication = %d\n", num1 * num2);
		System.out.printf("division_int = %d\n", num1 / num2);
		System.out.printf("division_float = %f\n", num1 / (float)num2);
		
	}

}
