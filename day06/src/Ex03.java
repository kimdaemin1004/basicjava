
public class Ex03 {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n============================");

		for (int i = 1; i < 11; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n============================");

		for (int i = 0; i < 11; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n============================");

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n============================");

		// 0���� �����ؼ� ¦���� ������ �ϱ�
		for (int i = 0; i < 10; i += 2) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n============================");

		// 1���� �����ؼ� Ȧ���� ������ �ϱ�
		for (int i = 1; i < 10; i += 2) {
			System.out.printf("%d ", i);
		}
		System.out.println("\n============================");

		// 1���� �����ؼ� (10����) ¦���� ������ �ϱ�
		// if�� ����ϱ�
		// 1) 1���� 10���� ����ϴ� for�� �ۼ��ϱ�
		// 2) if���� ����ؼ� ������ �߰���
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println("\n============================");

		// 1���� �����ؼ� (10����) Ȧ���� ������ �ϱ�
		// if�� ����ϱ�
		// 1) 1���� 10���� ����ϴ� for�� �ۼ��ϱ�
		// 2) if���� ����ؼ� ������ �߰���
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println("\n============================");

		// 1���� �����ؼ� (10����) Ȧ���� ������ �ϱ�
		// if�� ����ϱ�
		// 1) 1���� 10���� ����ϴ� for�� �ۼ��ϱ�
		// 2) if���� ����ؼ� ������ �߰���
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println("\n============================");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 1) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println("\n===========================");

		// 3) 1���� 19������ ���� �߿��� 3�� ����� ����ϱ�
		for (int i = 1; i <= 19; i++) {
			if (i % 3 == 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println("\n===========================");

		// 4) 1���� 24������ ���� �߿��� 6�� ����� ����ϱ�
		for (int i = 1; i <= 24; i++) {
			if (i % 6 == 0) {
				System.out.printf("%d ", i);
			}
		}
		System.out.println("\n===========================");
		
		
	} // end of main
	
} // end of class (class)










