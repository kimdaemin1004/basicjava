
public class Ex01 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // �ܺ� for��
			for (int j = 0; j < i; j++) { // ���� for��
				System.out.print("+ ");
			}
			System.out.println();
		}

		System.out.println("===========================================");

		for (int i = 1; i <= 5; i++) {
			
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i; k++) {
				System.out.print("- ");
			}
			System.out.println();
		}
	}

}
// ���̾Ƹ��??
// ���ﰢ��??
// �ݴ���� ���ﰢ��