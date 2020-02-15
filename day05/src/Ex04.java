import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		int id = sc.nextInt();
		System.out.print("비밀번호를 입력하세요 : ");
		int password = sc.nextInt();

		// id가 999이고, password가 333이면, "로그인 성공 !!"을
		// id가 999가 아니거나, password가 333이 아니면, "로그인 실패 !!"를
		// 출력하는 프로그램을 작성하시오

		// 1) 논리연산자 사용하기
		// id와 password가 동시에 만족해야만 "로그인 성공 !!"이 출력됨
		// Validation (유효성 검사)

		if (id == 999 && password == 333) {
			System.out.println("로그인 성공 !!");
		} else {
			System.out.println("로그인 실패 !!");
		}

		// 2) 중첩 if문을 사용하는 방법
		// if문 내부에 새로운 if문을 정의해서 사용하는 방법

		if (id == 999) {
			if (password == 333) {
				System.out.println("로그인 성공 !!");
			} else {
				System.out.println("비밀번호를 확인하세요 !!");
			}

		} else {
			System.out.println("아이디를 확인해 주세요 !!");
		}
		
		// 3) boolean 변수를 사용하는 방법
		//    조건식의 결과를 boolean 변수에 저장하고
		//    if문의 조건식에 boolean 변수를 사용함
		
		boolean flag;
		flag = (id == 999);
		flag = flag && (password == 333);
		
		if(flag) {
			System.out.println("로그인 성공 !!");
		}else {
			System.out.println("로그인 실패 !!");
		}
		
		// 4) boolean 변수 두 개 사용하기
		boolean flag1;
		boolean flag2;
		flag1 = (id == 999);
		flag2 = (password == 333);
		
		if(flag && flag2) {
			System.out.println("로그인 성공 !!");
		}else {
			System.out.println("로그인 실패 !!");
		}
		
		
		
		
	}
}


















