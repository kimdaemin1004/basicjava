import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ 7��° �ڸ����� �Է��ϼ��� : ");
		
		int seventh = sc.nextInt();
		
		if(seventh == 1 || seventh == 3) {
			System.out.println("����� �����Դϴ�");
		}else if(seventh == 2 || seventh == 4){
			System.out.println("����� �����Դϴ�");
		}else {
			System.out.println("�ٽ� �Է����ּ���");
		}
	}

}
