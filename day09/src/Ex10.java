import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		int menu = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(1) square root");
			System.out.println("(1) log");
			System.out.println("원하는 메뉴를 선택하세요 (1 0-3, 종료:0 : ");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else if(!(1 <= menu && menu <=3)) {
		     System.out.println("메뉴를 잘못 선택하셨습니다 (종료:0)");
		     continue;
			}
		}

	}

}
