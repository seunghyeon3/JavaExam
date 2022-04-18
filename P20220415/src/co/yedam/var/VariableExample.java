package co.yedam.var;

public class VariableExample {

	public static void main(String[] args) {

//		int var1 = 0b1011; // 2진수 표현 int var2 = 0206; //8진수 표현 int var3 = 365; //10진수
//		int var4 = 0xB3; // 16진수 표현
//		
//		System.out.println("var1 : " + var1);
//		System.out.println("var4 : " + var4);
//
//		long longVar1 = 10;
//		long longVar2 = 20L; 
//		long longVar4 = 10000000000L;
//
//		char c2 = 65;
//		char c3 = 44032;
//
//		System.out.println(c2); // A System.out.println(c3); //가
//
//		char c1 = 'A'; // 문자 String str = "AB"; //문자열.. 참조타입.
//
//		String name = "홍길동";
//		String job = "프로그래머";
//
//		System.out.println(name);
//		System.out.println(job);
//
//		// \t => tab키
//		System.out.println("번호\t이름\t직업");
//		// \n => Enter키
//		System.out.println("행 단위 출력\n");
		
		//실수 타입 : float, double
		
		float floatVar1 = 3.14;
		
		  float floatVar2 = 3.14f;
		  
		  double dolubeVar1 = 0.321;
		  
		  float floatVar3 = 0.1234567890123456789f; double doubleVar2 =
		  0.1234567890123456789;
		  
		  System.out.println(floatVar3);
		  
		  System.out.println(doubleVar2);
		 
		
		boolean stop = true;
		// 5 > 3 = true
		boolean state = false;
		
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}

}
