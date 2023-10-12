package practice_Ex02;

public class Ex02_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 20;
		//int x = 10;
		//int y = 20;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		// int temp = x;
		int temp; 
		temp = x;
		x = y;
		y = temp;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	
	}

}
