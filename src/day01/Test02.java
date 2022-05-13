package day01;

public class Test02 {
	public static void main(String[] args) {
		
		/*
		Test02파일 생성 후 본인의 인적사항을 출력해 주세요.
		이름 : 홍길동
		나이 : 20살
		주소 : 산골짜기
		*/
		
		System.out.println("이름 : 홍길동");
		System.out.println("나이 : 20살");
		System.out.println("주소 : 산골짜기");
		
		// \n : 엔터와 비슷, \t : 탭 크기만큼 왼쪽으로 이동
		// \" : "(큰따옴표 표현), // : (역슬러시 하나 표현)
		System.out.println("안\n녕\n하\n세요"); // "" : 문자열을 포현할때 사용
		System.out.println("12346578\t12\t12"); //tab키는 space 8칸을 확보하고 내용을 채운뒤 비어져있는 남은 칸을 띄워준다. //비어있는공간이 없으면 새롭게 8칸 공간을 만든다.
		System.out.println("\"안녕하세요\""); // "앞에 \를 붙여주면 "를 일반적인 문자로 사용할 수 있다.
		System.out.println("안\\녕"); // \를 표현할 때는 \하나 더 붙여준다.
	}

}
