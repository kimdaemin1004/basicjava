import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random() * 100) +1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("1���� 100������ ���� �߿��� �ϳ��� �Է��ϼ��� : ");
			String tmp = sc.nextLine();
			input = Integer.parseInt(tmp);
			if(input > answer) {
				System.out.println("�� ���� ���� �õ��ϼ���");
			}else if(input < answer) {
				System.out.println(" �� ū ���� �õ��ϼ���");
			}
		}while(input != answer);
		System.out.println("���߼̽��ϴ�.");
	}
}