
public class Ex10 {
	public static void main(String[] args) {
	
		// 홀수 단에는 짝수만, 짝수단에는 홀수만 곱해서
		// 출력하는 프로그램을 작성하세요
		// i를 2로 나누었을 때의 나머지와 
		// j를 2로 나누었을 때의 나머지가 다름
		
		for(int i = 2; i <=9; i++) {
			System.out.printf("-- %d 단 --%n", i);
			for(int j = 1; j <= 9; j++) {	
				if(i % 2 != j % 2) {
				System.out.printf("%d X %d = %d%n", i, j, i*j);
			}		
				
		}
			System.out.println();
	}

}
}
