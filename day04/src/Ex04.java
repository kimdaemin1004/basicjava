
public class Ex04 {
	public static void main(String[] args) {
		// shift 연산자
		// << : left shift : 비트를 n만큼 왼쪽으로 이동함
		// >> : right shift : 비트를 n만큼 오른쪽으로 이동함
		
		int num = 5; // 0 1 0 1
				
		System.out.println("num << 1 : " + (num << 1)); // 2**1 : 2 <--10
		//  --> 2의 n제곱
		System.out.println("num << 2 : " + (num << 2)); // 2**2 : 4 <--20
		System.out.println("num << 3 : " + (num << 3)); // 2**3 : 8 <--40
		
		num = 80; // 이진수
		
		System.out.println("num >> 1 : " + (num >> 1)); // 2**1 : 2 <--40
		System.out.println("num >> 2 : " + (num >> 2)); // 2**2 : 4 <--20
		System.out.println("num >> 3 : " + (num >> 3)); // 2**3 : 8 <--10
		
		System.out.println("num : " + num);
		System.out.println("num >>= 2 : " + (num >> 2)); // 할당


	}

}
