
public class Ex09 {
	public static void main(String[] args) {
	
		// Ȧ�� �ܿ��� ¦����, Ȧ���ܿ��� ¦���� ���ؼ�
		// ����ϴ� ���α׷��� �ۼ��ϼ���
		// i�� 2�� �������� ���� �������� 
		// j�� 2�� �������� ���� �������� ����
		
		for(int i = 2; i <=9; i++) {
			System.out.printf("-- %d �� --%n", i);
			for(int j = 1; j <= 9; j++) {	
				if(i % 2 == 0 && j % 2 == 1) {
				System.out.printf("%d X %d = %d%n", i, j, i*j);
			}		
				
		}
			for(int j = 1; j <= 9; j++) {	
				if(i % 2 == 1 && j % 2 == 0) {
					System.out.printf("%d X %d = %d%n", i, j, i*j);
				}		
				
			}
			System.out.println();
	}

}
}
