import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 7번째 자리수를 입력하세요 : ");
		
		int seventh = sc.nextInt();
		
		if(seventh == 1 || seventh == 3) {
			System.out.println("당신은 남자입니다");
		}else if(seventh == 2 || seventh == 4){
			System.out.println("당신은 여자입니다");
		}else {
			System.out.println("다시 입력해주세요");
		}
	}

}
