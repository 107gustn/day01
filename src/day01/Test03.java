package day01;

public class Test03 {

	public static void main(String[] args) {
		System.out.println( 100 ); //""�� ������ �Ϲ����� �����̴�.
		System.out.println( 100.123 );
		System.out.println( 100 + 1.123 ); //���� ����
		System.out.println( "�ȳ�" + "�ϼ���" ); //���� ����
		System.out.println( "�ȳ�" + 100 ); //���� + ���� ������ �ϸ� ���ڰ� ���ڷ� ��ȯ�� �Ǿ ������ �ȴ�.
		System.out.println( "�ȳ�" + (100 + 200) ); //+ �����ڴ� �켱������ ��� �տ������� ������ �Ǿ (�Ұ�ȣ)�� ���� ���� ������ �����ش�.
		System.out.println( 1 + "" + 2 );//""�� ���� ������ ���� //���ڿ� ���ڰ� ������ �Ǹ� ���ڴ� ���ڷ� ������ �ȴ�.
	}

}
