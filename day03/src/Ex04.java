
public class Ex04 {
  public static void main(String[] args) {
	  int number = 10;
	  float f = 54.32F;
	  
	  String str1 = "abc";
	  String str2 = new String("abc");
	  
	  System.out.printf("str1 : %s%n", str1);
	  System.out.printf("str2 : %s%n", str2);
	  
	  System.out.printf("\"abc\" == \"abc\" : %b%n", "abc" == "abc");
	  System.out.printf("str1 == \"abc\" : %b%n", str1 == "abc");
	  System.out.printf("str2 == \"abc\" : %b%n", str2 == "abc"); // �ּҰ� �ٸ�
	  
	  boolean flag1 = str1.equals("abc"); // ������ ��
	  boolean flag2 = str2.equals("abc");
	  
	  System.out.printf("flag1 : %b%n", flag1);
	  System.out.printf("flag2 : %b%n", flag2);
	  
	  boolean flag3 = str2.equals("ABC"); // ��ҹ��� ��
	  System.out.printf("flag3 : %b%n", flag3);
	  
	  boolean flag4 = str2.equalsIgnoreCase("ABC"); // ��ҹ��� ���о��� ��
	  System.out.printf("flag4 : %b%n", flag4);
	  
	  


  }
}









