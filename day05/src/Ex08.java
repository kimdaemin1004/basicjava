
/*
  
    Math.random() : 0.0부터 1 미만의 실수(double)를 반환함
      
      1부터 10까지의 정수 중에서 임의의 숫자 반환
      
      0.0 <= Math.random() < 1.0
      
      0.0*10 <= Math.random()*10 < 1.0*10

      0    <= (int)Math.random()*10  < 10
      
      0 + 1 <= (int)(Math.random()*10) + 1 < 10 + 1
          1 <= (int)(Math.random()*10) + 1 < 11
      
      (int)(Math.random()*10) + 1
      
      (int)(Math.random()*100) + 1
      
      (int)(Math.random()*50) + 1
      
      (int)(Math.random()*7) + 1  
  
*/

public class Ex08 {
   public static void main(String[] args) {
      // 0.0부터 1 미만의 임의의 실수(double)를 반환함
      double number = Math.random();
      
      System.out.println("number : " + number);
      // 0.2316562171049521
      // 0.9068274026261367
      
      System.out.println("===========================");
      
      // 1부터 10까지의 정수 중에서 임의의 숫자를 반환하기      
      int figure = (int)(Math.random()*10) + 1;
      System.out.println("figure : " + figure);
      
      System.out.println("===========================");
      
      // 1부터 100까지의 정수 중에서 임의의 숫자를 반환하기      
      figure = (int)(Math.random()*100) + 1;
      System.out.println("figure : " + figure);
      
      System.out.println("===========================");
      
      for(int i = 0; i < 11; i++) {
         figure = (int)(Math.random()*100) + 1;
         System.out.println("figure : " + figure);
         
      }
      
      
   }

}