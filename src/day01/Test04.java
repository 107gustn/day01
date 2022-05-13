package day01;

public class Test04 {
	public static void main(String[] args) {
		/*
		bit : 2진수(0, 1)의 한자리가 1bit
		1byte = 8bit
		
		(자료형)type	 크기(byte)		범위
		---------------------------------------
		byte			1		-128 ~ 127
		short			2		-32768 ~ 32767
		char			2
		int				4
		float			4
		double			8
		void			값을 갖지 않는 특수한 데이터 형
		*/
		
		int age = 25; //int : 정수(음, 양수) 표현 //자료형 변수이름 =(대입연산자) 값; //변수이름으로 한글명을 사용할 수 있지만 추천하지는 않음
		double weight = 55.0; //실수 표현
		double height = 160.0; //변수를 만들때 의미를 부여해서 변수명 만드는거 추천
		
		System.out.println("나의 나이는 " + age + "살");
		System.out.println("나의 키는 " + height + "cm");
		System.out.println("나의 무게는 " + weight + "kg");
		System.out.println();
		
		//char문자 하나 표현할 때 사용
		//문자 하나는 작은 따옴표로 표현해야 한다.
		char ch = 'A'; //변수 값 A로 초기화
		System.out.println("변경 전 : " + ch);
		ch ='B';
		System.out.println("변경 후 : " + ch);

		//값에 대한 형태를 변환 = 자료 형 변환
		System.out.println("연산 : " + (ch+32) ); //ASCII B=66
		System.out.println("연산 : " + (char)(ch+32) ); // 문자형태로 형 변환 //B(66) + 32 = b(98)
		System.out.println("연산 : " + (double)(ch+32) ); //실수형태로 형 변환
		
		System.out.println( 1.111 );
		System.out.println( (int)12.111 ); //정수형태로 형 변환
		
		String n = "홍길동"; //String은 문자열을 저장할 수 있다.
		System.out.println(n + "님 안녕하세요.");
		n = "김개똥";
		System.out.println("이름 변경 : " + n);
	}
	
}
