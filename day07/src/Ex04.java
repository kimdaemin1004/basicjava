
public class Ex04 {
	public static void main(String[] args) {
		
		// ¦�� �ܸ� ����ϼ���
		for(int i = 2; i <=9; i++) {
			if(i % 2 == 0) {
			System.out.printf("-- %d �� --%n", i);
			for(int j = 1; j <= 9; j++) {	
				System.out.printf("%d X %d = %d%n", i, j, i*j);
			}		
		}
			System.out.println();
	}

}
}
