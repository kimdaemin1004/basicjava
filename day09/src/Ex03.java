import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		int num = 0;
		int sum = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		
		// 입력받은 문자열을 Integer type으로 변환
		num = Integer.parseInt(tmp);
		
		while(num != 0) {
			sum += num % 10; // 나머지 연산자
			System.out.printf("sum : %3d, num : %d%n", sum, num);
			
			num /= 10;
		}
System.out.println("각 자리수의 합 : " +sum); 
	}

}
