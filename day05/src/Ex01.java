import java.util.Scanner;

// ���ǹ�
public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		
		int number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.printf("%d�� ¦���Դϴ�.%n", number);	
		}
		else {
			System.out.printf("%d�� Ȧ���Դϴ�.%n", number);
			
		}
			

	}

}
