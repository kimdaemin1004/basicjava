import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		int menu = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(1) square root");
			System.out.println("(1) log");
			System.out.println("���ϴ� �޴��� �����ϼ��� (1 0-3, ����:0 : ");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}else if(!(1 <= menu && menu <=3)) {
		     System.out.println("�޴��� �߸� �����ϼ̽��ϴ� (����:0)");
		     continue;
			}
		}

	}

}