import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = 10;

		String str = new String("abc");

		// char (문자 하나), String (문자열)
		System.out.printf("문자를 입력하세요 : "); // "hello"
		String input = sc.nextLine(); // 'hello' 문자열 (String)
		char ch1 = input.charAt(0); // 'h' 문자 하나 (char)
		char ch2 = input.charAt(1); // 'e' 문자 하나 (char)
		char ch3 = input.charAt(2); // 'l' 문자 하나 (char)
		char ch4 = input.charAt(3); // 'l' 문자 하나 (char)
		char ch5 = input.charAt(4); // 'o' 문자 하나 (char)

		System.out.printf("%c ", ch1);
		System.out.printf("%c ", ch2);
		System.out.printf("%c ", ch3);
		System.out.printf("%c ", ch4);
		System.out.printf("%c %n", ch5);

		// String type을 char type으로 바꾸기

		System.out.printf("문자 하나를 입력하세요 : ");
		input = sc.nextLine();
		System.out.println("input : " + input);
		char ch6 = input.charAt(0);
		System.out.println("ch6 : " + ch6);

		
		//비교[연산] : int 이하 type은 모두 int로 변환되어 연산됨
		if ('0' <= ch6 && ch6 <= '9') {
			System.out.println("입력하신 문자는 숫자입니다");
		}
		if ('A' <= ch6 && ch6 <= 'Z') {
			System.out.println("입력하신 문자는 대문자입니다");
		}

		if ('a' <= ch6 && ch6 <= 'z') {
			System.out.println("입력하신 문자는 소문자입니다");
		}

	}

}







