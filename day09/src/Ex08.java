
public class Ex08 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		
		// sum의 값이 100을 넘을 때 i값
		while(true) {
			if (sum > 100) {
				break;
			}
			++i;
			sum += i;
		} // while
		
		System.out.println("i : " + i);
		System.out.println("sum " + sum);
	}

}
