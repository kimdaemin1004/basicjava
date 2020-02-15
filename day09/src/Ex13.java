import java.util.Scanner;

public class Ex13 {
   public static void main(String[] args) {
      // 3 과목의 성적을 입력 받아서
      // 총점, 평균을 출력하세요
      Scanner sc = new Scanner(System.in);
      
      // 0 - 2 : 성적, 3 : 총점
      int[] scores = new int[4];
      
      // 평균
      float average;
      
      for(int i = 0; i < 3; i++) {
         System.out.printf("%d 번째 성적을 입력하세요 : ", i+1);
         scores[i] = sc.nextInt();
         scores[3] += scores[i];
      }
      
      average = (float)scores[3] / 3;
      average = scores[3] / (float)3;
      average = scores[3] / 3.0F;
      // average = (float)(scores[3] / 3);
      
      System.out.printf("총점 : %d 점, 평균 : %.2f 점%n", scores[3], average);
      
      
   }

}