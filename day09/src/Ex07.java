
public class Ex07 {

	public static void main(String[] args) {
		// ���� �߿��� 3, 6, 9�� ���ԵǾ� �ִ� ��� 
		// ���Ե� ������ŭ �ڼ��� ġ�� ����
		
		for(int i = 0; i < 101; i++) {
			System.out.printf("i : %d", i);
			
			int tmp = i;
			
			do { 
				if(tmp%10%3 == 0 && tmp%10 != 0) {
					System.out.print("¦");
				}
				
				}while((tmp /= 10) != 0);
				
				System.out.println();
			} // for 
		}
		
		}  // main