import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է��ϼ��� : ");
		int id = sc.nextInt();
		System.out.print("��й�ȣ�� �Է��ϼ��� : ");
		int password = sc.nextInt();

		// id�� 999�̰�, password�� 333�̸�, "�α��� ���� !!"��
		// id�� 999�� �ƴϰų�, password�� 333�� �ƴϸ�, "�α��� ���� !!"��
		// ����ϴ� ���α׷��� �ۼ��Ͻÿ�

		// 1) �������� ����ϱ�
		// id�� password�� ���ÿ� �����ؾ߸� "�α��� ���� !!"�� ��µ�
		// Validation (��ȿ�� �˻�)

		if (id == 999 && password == 333) {
			System.out.println("�α��� ���� !!");
		} else {
			System.out.println("�α��� ���� !!");
		}

		// 2) ��ø if���� ����ϴ� ���
		// if�� ���ο� ���ο� if���� �����ؼ� ����ϴ� ���

		if (id == 999) {
			if (password == 333) {
				System.out.println("�α��� ���� !!");
			} else {
				System.out.println("��й�ȣ�� Ȯ���ϼ��� !!");
			}

		} else {
			System.out.println("���̵� Ȯ���� �ּ��� !!");
		}
		
		// 3) boolean ������ ����ϴ� ���
		//    ���ǽ��� ����� boolean ������ �����ϰ�
		//    if���� ���ǽĿ� boolean ������ �����
		
		boolean flag;
		flag = (id == 999);
		flag = flag && (password == 333);
		
		if(flag) {
			System.out.println("�α��� ���� !!");
		}else {
			System.out.println("�α��� ���� !!");
		}
		
		// 4) boolean ���� �� �� ����ϱ�
		boolean flag1;
		boolean flag2;
		flag1 = (id == 999);
		flag2 = (password == 333);
		
		if(flag && flag2) {
			System.out.println("�α��� ���� !!");
		}else {
			System.out.println("�α��� ���� !!");
		}
		
		
		
		
	}
}


















