package day01;

public class Test04 {
	public static void main(String[] args) {
		/*
		bit : 2����(0, 1)�� ���ڸ��� 1bit
		1byte = 8bit
		
		(�ڷ���)type	 ũ��(byte)		����
		---------------------------------------
		byte			1		-128 ~ 127
		short			2		-32768 ~ 32767
		char			2
		int				4
		float			4
		double			8
		void			���� ���� �ʴ� Ư���� ������ ��
		*/
		
		int age = 25; //int : ����(��, ���) ǥ�� //�ڷ��� �����̸� =(���Կ�����) ��; //�����̸����� �ѱ۸��� ����� �� ������ ��õ������ ����
		double weight = 55.0; //�Ǽ� ǥ��
		double height = 160.0; //������ ���鶧 �ǹ̸� �ο��ؼ� ������ ����°� ��õ
		
		System.out.println("���� ���̴� " + age + "��");
		System.out.println("���� Ű�� " + height + "cm");
		System.out.println("���� ���Դ� " + weight + "kg");
		System.out.println();
		
		//char���� �ϳ� ǥ���� �� ���
		//���� �ϳ��� ���� ����ǥ�� ǥ���ؾ� �Ѵ�.
		char ch = 'A'; //���� �� A�� �ʱ�ȭ
		System.out.println("���� �� : " + ch);
		ch ='B';
		System.out.println("���� �� : " + ch);

		//���� ���� ���¸� ��ȯ = �ڷ� �� ��ȯ
		System.out.println("���� : " + (ch+32) ); //ASCII B=66
		System.out.println("���� : " + (char)(ch+32) ); // �������·� �� ��ȯ //B(66) + 32 = b(98)
		System.out.println("���� : " + (double)(ch+32) ); //�Ǽ����·� �� ��ȯ
		
		System.out.println( 1.111 );
		System.out.println( (int)12.111 ); //�������·� �� ��ȯ
		
		String n = "ȫ�浿"; //String�� ���ڿ��� ������ �� �ִ�.
		System.out.println(n + "�� �ȳ��ϼ���.");
		n = "�谳��";
		System.out.println("�̸� ���� : " + n);
	}
	
}
