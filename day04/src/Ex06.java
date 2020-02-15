import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		//주민등록번호 7번째 자리수를 입력받아서
		//남자인지 여자인지 출력하는 프로그램을 작성하세요
		//Scanner, 삼항 연산자 사용
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 7번째 자리수를 입력하세요 : ");
		
		int number2 = sc.nextInt();
		
		String result = (number2 == 1 || number2 == 3 ) ? "남자" : (number2 == 2 || number2 == 4 ) ? "여자" : "다시 입력하세요";

		
		System.out.printf("당신은 %s입니다%n", result);
		
		
	}

}
