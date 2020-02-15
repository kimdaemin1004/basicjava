
public class Ex02 {
	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = (x >= 0) ? x : -x;
		absY = (y >= 0) ? y : -y;
		absZ = (z >= 0) ? z : -z;
		
		// 부호 붙이기 (중첩 삼항연산자)
		signX = (x > 0) ? '+' : ((x == 0) ? ' ' : '-');
		signY = (y > 0) ? '+' : ((y == 0) ? ' ' : '-');
		signZ = (z > 0) ? '+' : ((z == 0) ? ' ' : '-');
		
		// 숫자 출력하기
		System.out.printf("x : %c%d%n", signX, absX);
		System.out.printf("y : %c%d%n", signY, absY);
		System.out.printf("z : %c%d%n", signZ, absZ);
		
	}

}
