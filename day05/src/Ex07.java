import java.util.Scanner;

// ���ǹ� : switch��
public class Ex07 {
	public static void main(String[] agrs) {
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
		
		switch((int)average/10) {
		     case 10:
		     case 9:
		    	 grade = 'A';
		    	 break;
		     case 8:
		    	 grade = 'B';
		    	 break;
		     case 7:
		    	 grade = 'C';
		    	 break;
		     case 6:
		    	 grade = 'D';
		    	 break;
		     default:
		    	 grade = 'F';
		}
		
		System.out.printf("����� ������ %c �����Դϴ�.%n", grade);

		
		
		
		
		
		
		
		
		
		
		
		
		}
	}

}
