import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = 10;

		String str = new String("abc");

		// char (���� �ϳ�), String (���ڿ�)
		System.out.printf("���ڸ� �Է��ϼ��� : "); // "hello"
		String input = sc.nextLine(); // 'hello' ���ڿ� (String)
		char ch1 = input.charAt(0); // 'h' ���� �ϳ� (char)
		char ch2 = input.charAt(1); // 'e' ���� �ϳ� (char)
		char ch3 = input.charAt(2); // 'l' ���� �ϳ� (char)
		char ch4 = input.charAt(3); // 'l' ���� �ϳ� (char)
		char ch5 = input.charAt(4); // 'o' ���� �ϳ� (char)

		System.out.printf("%c ", ch1);
		System.out.printf("%c ", ch2);
		System.out.printf("%c ", ch3);
		System.out.printf("%c ", ch4);
		System.out.printf("%c %n", ch5);

		// String type�� char type���� �ٲٱ�

		System.out.printf("���� �ϳ��� �Է��ϼ��� : ");
		input = sc.nextLine();
		System.out.println("input : " + input);
		char ch6 = input.charAt(0);
		System.out.println("ch6 : " + ch6);

		
		//��[����] : int ���� type�� ��� int�� ��ȯ�Ǿ� �����
		if ('0' <= ch6 && ch6 <= '9') {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�");
		}
		if ('A' <= ch6 && ch6 <= 'Z') {
			System.out.println("�Է��Ͻ� ���ڴ� �빮���Դϴ�");
		}

		if ('a' <= ch6 && ch6 <= 'z') {
			System.out.println("�Է��Ͻ� ���ڴ� �ҹ����Դϴ�");
		}

	}

}







