package practice_Ex02;

import java.util.Scanner;

public class Practice_inClass_comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫 번째 수 a를 입력하시오 : ");
		String input1 = scanner.nextLine();
		int num1 = Integer.parseInt(input1);
		
		System.out.print("두 번째 수 b를 입력하시오 : ");
		String input2 = scanner.nextLine();
		int num2 = Integer.parseInt(input2);
		
		if (num1 > num2) {
			System.out.println("a가 크다");
		} else if (num1 == num2){
			System.out.println("두 수의 값이 같다");
		} else {
			System.out.println("b가 크다");
		}
				
	}

}
