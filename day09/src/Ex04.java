
public class Ex04 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		// 1���� ����� ������ ���� �հ谡 
		// 100�� ������
		// i�� 1�� ������Ű�鼭 sum�� ���س���
		
		while((sum += ++i) <= 100) {
			System.out.printf("%d - %d%n", i, sum);			
		}
	    System.out.println("====================");
	    System.out.println("1����" + i + "���� ���ϸ� 100�� �ѽ��ϴ�." );
	    
	    
		


	}

}