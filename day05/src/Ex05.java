import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�޴��� �����ϼ��� (1.�ѽ� 2.�߽�. 3.���) : ");
		int menu = sc.nextInt();

		if (menu == 1) {
			System.out.println("�ѽ��� �����ϼ̽��ϴ�.");
		} else if (menu == 2) {
			System.out.println("�߽��� �����Ͽ����ϴ�.");
		} else if (menu == 3) {
			System.out.println("�߽��� �����Ͽ����ϴ�.");
		}else {
			System.out.println("�޴��� �ٽ� Ȯ���� �ּ���.");
		}
	}
}

//switch �����ε� �ٲ㺸��!