
public class Ex01 {
	public static void main(String[] args) {
		
		// 1부터 10까지 정수의 합 구하기
		for(int i = 1, sum = 0; i< 11; i++) {
			sum += i;
			System.out.printf("1부터 %d까지의 합 : %d%n", i, sum);
		}
		  // sum cannot be resolved to a variable
	     //   i cannot be resolved to a variable
	     // System.out.printf("1부터 %d까지의 합 : %d%n", i, sum);
	}

}
