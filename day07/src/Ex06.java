
public class Ex06 {
	public static void main(String[] args) {
		
		// (모든 단을 출력하면서)
		// 홀수만 곱해지도록 출력하세요 (j를 이용)
		for(int i = 2; i <=9; i++) {
			System.out.printf("-- %d 단 --%n", i);
			for(int j = 1; j <= 9; j++) {	
				if(j % 2 != 0) {  // or ==1
				System.out.printf("%d X %d = %d%n", i, j, i*j);
			}		
		}
			System.out.println();
	}

}
}
