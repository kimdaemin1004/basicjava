import java.util.Scanner;

public class Ex13 {
   public static void main(String[] args) {
      // 3 ������ ������ �Է� �޾Ƽ�
      // ����, ����� ����ϼ���
      Scanner sc = new Scanner(System.in);
      
      // 0 - 2 : ����, 3 : ����
      int[] scores = new int[4];
      
      // ���
      float average;
      
      for(int i = 0; i < 3; i++) {
         System.out.printf("%d ��° ������ �Է��ϼ��� : ", i+1);
         scores[i] = sc.nextInt();
         scores[3] += scores[i];
      }
      
      average = (float)scores[3] / 3;
      average = scores[3] / (float)3;
      average = scores[3] / 3.0F;
      // average = (float)(scores[3] / 3);
      
      System.out.printf("���� : %d ��, ��� : %.2f ��%n", scores[3], average);
      
      
   }

}