
public class Ex01 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) { // 외부 for문
			for (int j = 0; j < i; j++) { // 내부 for문
				System.out.print("+ ");
			}
			System.out.println();
		}

		System.out.println("===========================================");

		for (int i = 1; i <= 5; i++) {
			
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i; k++) {
				System.out.print("- ");
			}
			System.out.println();
		}
	}

}
// 다이아몬드??
// 역삼각형??
// 반대방향 직삼각형