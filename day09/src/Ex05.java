import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
      int num = 0;
      int sum = 0;
      boolean flag = true;  // while���� ���ǽ����� ���� ����
      
      System.out.print("�հ踦 ���� ���ڸ� �Է��ϼ��� (����� 0�� �Է��ϼ���) \n-->  ");
      
      while(flag) {  // flag�� ���� true�� �ʱ�ȭ�����Ƿ� ���ǽ��� ���� ��
         System.out.print(">> ");
         Scanner sc = new Scanner(System.in);
         String tmp = sc.nextLine();
         num = Integer.parseInt(tmp);
         
         if(num != 0) {
            sum += num;  // num�� 0�� �ƴϸ� sum�� ����            
         } else {
            flag = false;  // num�� 0�̸� flag�� ���� flase�� ������
                           // flag�� false�� �Ǹ� while�ݺ��� �����
         }         
      } // while
      System.out.println("�հ� : " + sum);
   }
}