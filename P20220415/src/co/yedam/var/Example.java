package co.yedam.var;

public class Example {

	public static void main(String[] args) {
		//반지름이 5인 원의 면적
		double PI = 3.14;
		int radius = 5;
		
		double gongsic = PI * radius *radius;
		
		System.out.println(gongsic);
		System.out.println(PI * radius *radius);
		
		// 덧셈 : +, 뺄셈 : - , 곱셉 : * , 나눗셈 : /

		// 밑 면이 4 높이는 4 삼각형의 넓이를 구하시오.
		// 밑 면 * 높이 / 2 = 삼각형 넓이 답: 8
		
		int height = 4;
		int wedth = 4;
		double triangleArea = height * wedth / 2;
		System.out.println(triangleArea);
		
		

		

	}

}
