import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴를 선택하세요 (1.한식 2.중식. 3.양식) : ");
		int menu = sc.nextInt();

		if (menu == 1) {
			System.out.println("한식을 선택하셨습니다.");
		} else if (menu == 2) {
			System.out.println("중식을 선택하였습니다.");
		} else if (menu == 3) {
			System.out.println("중식을 선택하였습니다.");
		}else {
			System.out.println("메뉴를 다시 확인해 주세요.");
		}
	}
}

//switch 문으로도 바꿔보기!