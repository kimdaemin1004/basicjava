public class Ex02 {
   public static void main(String[] args) {
      int i = 11;
      
      System.out.println("countdown ���� !!!");
      
      while(i-- != 0) { // --i != 0
         System.out.println(i);
         
         // �ܼ��� ������ ������Ű�� for��
         for(int j = 0; j < 2000000000; j++) {
            ;  // �ƹ� ������� ; ��
         }
      }
      
      System.out.println("terminate !!!");
            
   }

}