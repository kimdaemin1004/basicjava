import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 3������ ������ �Է¹޾Ƽ�
		// ����, ���, ���� ����ϱ�

		int score1, score2, score3;
		int total;
		float average;
		char grade;

		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ������ ������ �Է��ϼ��� : ");
		score1 = sc.nextInt();
		System.out.print("�� ��° ������ ������ �Է��ϼ��� : ");
		score2 = sc.nextInt();
		System.out.print("�� ��° ������ ������ �Է��ϼ��� : ");
		score3 = sc.nextInt();

		total = score1 + score2 + score3;

		average = total / 3.0F;
		average = (float) total / 3;
		// average = (float)(total / 3); --> int

		if (score1 < 0 || score1 > 100 || score2 < 0 || score2 > 100 || score3 < 0 || score3 > 100) {
			System.out.println("������ �ٽ� Ȯ���� �ּ���");
		} else {

			System.out.printf("���� : %d��, ��� : %.2f��%n", total, average);

			// ���� ���ϱ�
			if (90 <= average) {
				grade = 'A';
			} else if (80 <= average) {
				grade = 'B';
			} else if (70 <= average) {
				grade = 'C';
			} else if (60 <= average) {
				grade = 'D';
			} else {
				grade = 'F';
			}

			System.out.printf("����� ������ %c �����Դϴ�.%n", grade);
		}

	}

}
