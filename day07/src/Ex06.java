
public class Ex06 {
	public static void main(String[] args) {
		
		// (��� ���� ����ϸ鼭)
		// Ȧ���� ���������� ����ϼ��� (j�� �̿�)
		for(int i = 2; i <=9; i++) {
			System.out.printf("-- %d �� --%n", i);
			for(int j = 1; j <= 9; j++) {	
				if(j % 2 != 0) {  // or ==1
				System.out.printf("%d X %d = %d%n", i, j, i*j);
			}		
		}
			System.out.println();
	}

}
}
