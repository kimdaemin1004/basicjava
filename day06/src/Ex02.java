
public class Ex02 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		// 1���� 10���� ������ �� ���ϱ�
		for(i = 1; i< 11; i++) {
			sum += i;
			System.out.printf("1���� %d������ �� : %d%n", i, sum);
		}
		
		System.out.println("========================");	
		
		System.out.printf("1���� %d������ �� : %d%n", i-1, sum);
		
		  // sum cannot be resolved to a variable
	     //   i cannot be resolved to a variable
	     // System.out.printf("1���� %d������ �� : %d%n", i, sum);
	}

}
