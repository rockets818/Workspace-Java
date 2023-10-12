package practice_Ex02;

import java.util.Scanner;

public class Practice_inClass_birth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 이름을 입력한다. : 문자열
		// 2. 생년을 입력한다. : 숫자
		// 3. 나이 계산 : 현재 년도에서 생년을 뺀다.
		// 4. 출력 : 이름, 나이
		// 5. 살아 온 날을 계산, 출력한다.
		// 6. 식비 계산
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하십시오. > ");
		String name = scanner.nextLine();
		
		System.out.print("생년(year)을 4자리로 입력하시오. > ");
		String tmp_birthYear = scanner.nextLine();
		int birthYear = Integer.parseInt(tmp_birthYear);
		
		System.out.print("생월(month)을 2자리로 입력하시오. > ");
		String tmp_birthMonth = scanner.nextLine();
		int birthMonth = Integer.parseInt(tmp_birthMonth);
		
		System.out.print("생일(day)을 2자리로 입력하시오. > ");
		String tmp_birthDate = scanner.nextLine();
		int birthDate = Integer.parseInt(tmp_birthDate);
		
		int age = 2023 - birthYear;
		int lifespan = ((2023 - birthYear) * 365) + ((10 - birthMonth) * 30) + ((05 - 30) + (30 - birthDate));
		int foodCost1 = lifespan * 3000 * 3;
		int foodCost2 = lifespan * 10000 * 3;
		
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("나이 : %d세\n", age);
		System.out.printf("살아 온 날 : %d일\n", lifespan);
		System.out.printf("식비 : %d원 (하루 3끼, 끼니당 3천원 기준)\n", foodCost1);
		System.out.printf("식비 : %d원 (하루 3끼, 끼니당 1만원 기준)\n", foodCost2);
		
		
	}

}
