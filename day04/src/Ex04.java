
public class Ex04 {
	public static void main(String[] args) {
		// shift ������
		// << : left shift : ��Ʈ�� n��ŭ �������� �̵���
		// >> : right shift : ��Ʈ�� n��ŭ ���������� �̵���
		
		int num = 5; // 0 1 0 1
				
		System.out.println("num << 1 : " + (num << 1)); // 2**1 : 2 <--10
		//  --> 2�� n����
		System.out.println("num << 2 : " + (num << 2)); // 2**2 : 4 <--20
		System.out.println("num << 3 : " + (num << 3)); // 2**3 : 8 <--40
		
		num = 80; // ������
		
		System.out.println("num >> 1 : " + (num >> 1)); // 2**1 : 2 <--40
		System.out.println("num >> 2 : " + (num >> 2)); // 2**2 : 4 <--20
		System.out.println("num >> 3 : " + (num >> 3)); // 2**3 : 8 <--10
		
		System.out.println("num : " + num);
		System.out.println("num >>= 2 : " + (num >> 2)); // �Ҵ�


	}

}
