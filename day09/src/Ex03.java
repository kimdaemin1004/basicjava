import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		
		// �Է¹��� ���ڿ��� Integer type���� ��ȯ
		num = Integer.parseInt(tmp);
		
		while(num != 0) {
			sum += num % 10; // ������ ������
			System.out.printf("sum : %3d, num : %d%n", sum, num);
			
			num /= 10;
		}
System.out.println("�� �ڸ����� �� : " +sum); 
	}

}