import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		//�ֹε�Ϲ�ȣ 7��° �ڸ����� �Է¹޾Ƽ�
		//�������� �������� ����ϴ� ���α׷��� �ۼ��ϼ���
		//Scanner, ���� ������ ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ 7��° �ڸ����� �Է��ϼ��� : ");
		
		int number2 = sc.nextInt();
		
		String result = (number2 == 1 || number2 == 3 ) ? "����" : (number2 == 2 || number2 == 4 ) ? "����" : "�ٽ� �Է��ϼ���";

		
		System.out.printf("����� %s�Դϴ�%n", result);
		
		
	}

}
