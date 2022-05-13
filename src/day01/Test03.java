package day01;

public class Test03 {

	public static void main(String[] args) {
		System.out.println( 100 ); //""가 없으면 일반적인 숫자이다.
		System.out.println( 100.123 );
		System.out.println( 100 + 1.123 ); //숫자 연산
		System.out.println( "안녕" + "하세요" ); //문자 연산
		System.out.println( "안녕" + 100 ); //문자 + 숫자 연산을 하면 숫자가 문자로 변환이 되어서 연산이 된다.
		System.out.println( "안녕" + (100 + 200) ); //+ 연산자는 우선순위가 없어서 앞에서부터 연산이 되어서 (소괄호)를 통해 연산 순서를 정해준다.
		System.out.println( 1 + "" + 2 );//""가 들어가면 무조건 문자 //문자와 숫자가 연산이 되면 숫자는 문자로 연산이 된다.
	}

}
