
public class Ex03 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n============================");

		for (int i = 1; i < 11; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n============================");

		for (int i = 0; i < 11; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n============================");

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n============================");

		// 0부터 시작해서 짝수만 나오게 하기
		for (int i = 0; i < 10; i += 2) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n============================");

		// 1부터 시작해서 홀수만 나오게 하기
		for (int i = 1; i < 10; i += 2) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n============================");

		// 1부터 시작해서 (10까지) 짝수만 나오게 하기
		// if문 사용하기
		// 1) 1에서 10까지 출력하는 for문 작성하기
		// 2) if문을 사용해서 조건을 추가함
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println("\n============================");

		// 1부터 시작해서 (10까지) 홀수만 나오게 하기
		// if문 사용하기
		// 1) 1에서 10까지 출력하는 for문 작성하기
		// 2) if문을 사용해서 조건을 추가함
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println("\n============================");

		// 1부터 시작해서 (10까지) 홀수만 나오게 하기
		// if문 사용하기
		// 1) 1에서 10까지 출력하는 for문 작성하기
		// 2) if문을 사용해서 조건을 추가함
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println("\n============================");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 1) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println("\n===========================");

		// 3) 1부터 19까지의 정수 중에서 3의 배수만 출력하기
		for (int i = 1; i <= 19; i++) {
			if (i % 3 == 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println("\n===========================");

		// 4) 1부터 24까지의 정수 중에서 6의 배수만 출력하기
		for (int i = 1; i <= 24; i++) {
			if (i % 6 == 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println("\n===========================");
		
		
	} // end of main
	
} // end of class (class)










