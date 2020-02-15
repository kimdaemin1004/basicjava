
public class Ex02 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		// 1부터 10까지 정수의 합 구하기
		for(i = 1; i< 11; i++) {
			sum += i;
			System.out.printf("1부터 %d까지의 합 : %d%n", i, sum);
		}
		
		System.out.println("========================");	
		
		System.out.printf("1부터 %d까지의 합 : %d%n", i-1, sum);
		
		  // sum cannot be resolved to a variable
	     //   i cannot be resolved to a variable
	     // System.out.printf("1부터 %d까지의 합 : %d%n", i, sum);
	}

}
