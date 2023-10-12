package practice_Ex02;
import java.util.Scanner;						// Scanner 클래스를 사용하기 위해 import
public class Ex02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);	//Scanner 클래스의 객체를 생성
		
		System.out.print("두자리 정수를 하나 입력해주세요.>");
		
//		int num = scanner.nextInt();			// 정수를 입력받아서 변수 num에 저장
		String input = scanner.nextLine();		// 입력받은 내용(문자열)을 input에 저장
		int num = Integer.parseInt(input);		// 입력받은 내용(문자열)을 int타입의 값으로 변환해서 num에 저장
		
//		System.out.printf("입력내용 :%s%n", input);
		System.out.println("입력내용 : "+num);
		System.out.printf("num=%d%n", num);
		
	}

}
