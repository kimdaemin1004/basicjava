import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 3과목의 성적을 입력받아서
		// 총점, 평균, 학점 출력하기

		int score1, score2, score3;
		int total;
		float average;
		char grade;

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 과목의 성적을 입력하세요 : ");
		score1 = sc.nextInt();
		System.out.print("두 번째 과목의 성적을 입력하세요 : ");
		score2 = sc.nextInt();
		System.out.print("세 번째 과목의 성적을 입력하세요 : ");
		score3 = sc.nextInt();

		total = score1 + score2 + score3;

		average = total / 3.0F;
		average = (float) total / 3;
		// average = (float)(total / 3); --> int

		if (score1 < 0 || score1 > 100 || score2 < 0 || score2 > 100 || score3 < 0 || score3 > 100) {
			System.out.println("성적을 다시 확인해 주세요");
		} else {

			System.out.printf("총점 : %d점, 평균 : %.2f점%n", total, average);

			// 학점 구하기
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

			System.out.printf("당신의 학점은 %c 학점입니다.%n", grade);
		}

	}

}
