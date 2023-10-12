package practice_Ex02;
public class Ex02_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "3";
		
		System.out.println((char)(3 + '0'));				// 숫자를 문자로 변환
		System.out.println('3' - '0' + 1);					// 문자를 숫자로 변환
		System.out.println(3 + "" + 3);						// 숫자를 문자열으로 변환
		System.out.println(Integer.parseInt(str) + 1);		// 문자열을 숫자로 변환
		System.out.println(str.charAt(0) - '0');			// 문자열을 문자로 변환
		System.out.println('3' + "" + 3);					// 문자를 문자열으로 변환
	}

}
