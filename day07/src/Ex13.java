import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		// 세 숫자를 입력해서 합계 최댓값, 최솟값 구하기
		
		// int num1, num2, num3;
		int total = 0;
		int max = 0;
		int min = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("%d 번째 정수를 입력하세요 : ", i+1);
			int input = sc.nextInt();
			total += input;
			
			if(i == 0) { // 첫 번째 반복
				max = min = input;
			}else { // 두 번째 이후
				// 최댓값
				if(input > max) {
					max = input;
				}else if(input < min) {
					//최솟값
					min = input;
					
				}
			}
			
		}
		
		System.out.printf("입력한 수들의 합계는 %d 입니다%n", total);
		System.out.printf("최댓값은 %d, 최솟값은 %d 입니다%n", max, min);
		
	}

}
