import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		// �� ���ڸ� �Է��ؼ� �հ� �ִ�, �ּڰ� ���ϱ�
		
		// int num1, num2, num3;
		int total = 0;
		int max = 0;
		int min = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("%d ��° ������ �Է��ϼ��� : ", i+1);
			int input = sc.nextInt();
			total += input;
			
			if(i == 0) { // ù ��° �ݺ�
				max = min = input;
			}else { // �� ��° ����
				// �ִ�
				if(input > max) {
					max = input;
				}else if(input < min) {
					//�ּڰ�
					min = input;
					
				}
			}
			
		}
		
		System.out.printf("�Է��� ������ �հ�� %d �Դϴ�%n", total);
		System.out.printf("�ִ��� %d, �ּڰ��� %d �Դϴ�%n", max, min);
		
	}

}
