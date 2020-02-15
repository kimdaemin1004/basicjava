import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
      int num = 0;
      int sum = 0;
      boolean flag = true;  // while문의 조건식으로 사용될 변수
      
      System.out.print("합계를 구할 숫자를 입력하세요 (종료는 0을 입력하세요) \n-->  ");
      
      while(flag) {  // flag의 값을 true로 초기화했으므로 조건식이 참이 됨
         System.out.print(">> ");
         Scanner sc = new Scanner(System.in);
         String tmp = sc.nextLine();
         num = Integer.parseInt(tmp);
         
         if(num != 0) {
            sum += num;  // num이 0이 아니면 sum에 더함            
         } else {
            flag = false;  // num이 0이면 flag의 값을 flase로 변경함
                           // flag가 false가 되면 while반복이 종료됨
         }         
      } // while
      System.out.println("합계 : " + sum);
   }
}