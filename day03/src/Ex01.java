
public class Ex01 {
 public static void main(String[] args) {
	 // float type�� ����� �ʱ�ȭ
	 float f;
	 f=10.45F;
	 
	 double d;
	 d=10.43;
	 
	 

	 
	 // ASCII Code
	 // 'A' - 65, 'a' - 97, '0' - 48
	 char result='0'+'2'; // �ڵ� ����ȯ�� (int->char)
	 System.out.printf("result:%c%n", result); // ��� : b
	 
	 int result2='0'+'2'; // int type�� �Ҵ��ϸ� int�� �����
	 System.out.printf("result2:%d%n", result2); // ��� : 98
	 
	 result='2'-'0'; // �ڵ� ����ȯ�� (int->char)
	 System.out.printf("result:%c%n", result); // ��� : b
	 
	 result2='2'-'0'; // int type�� �Ҵ��ϸ� int�� �����
	 System.out.printf("result2:%d%n", result2); // ��� : 2
	 

	 
	 // ���� �����ϱ� : ''(cf. String : "")
	 char ch;
	 ch='G';
	 
	 System.out.printf("ch:%c%n", ch);
	 
	 // G -> g�� ��ȯ�ϱ�
	 // ASCII Code �̿��ϱ�
	 
	// ASCII Code
   // 'A' - 65, 'a' - 97, '0' - 48
	 // 'a' - 'A' --> 97-56 : (32)
	 // 'g' - 'G' --> 97-56 : (32)
	 
	 // ch+('a' - 'A') : �빮�ڸ� �ҹ��ڷ� ��ȯ��
	 // ch-('a' - 'A') : �ҹ��ڸ� �빮�ڷ� ��ȯ��

	 
	 System.out.printf("ch:%c%n", ch+('a' - 'A')); // g
	 System.out.printf("ch:%c%n", ch+('a' - 'A')); // ?
	 
	 //���� ������ ���� �Ҵ翬���ڸ� ����ؾ߸� �����
	 
	 
	 
	 
	 
	 
 }
}
