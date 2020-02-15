import java.util.Scanner;

// 조건문
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		
		int number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.printf("%d는 짝수입니다.%n", number);	
		}
		else {
			System.out.printf("%d는 홀수입니다.%n", number);
			
		}
			

	}

}
