
public class Ex03 {
  public static void main(String[] args) {
	  int num1 = 10;     // num1 : 10
	  int num2 = num1++; // num1 : 11, num2 : 10 // 후위연산자
	  int num3 = ++num1; // num1 : 12, num3 : 12 // 전위연산자
	  
	  System.out.printf("num1 : %d, num2 : %d, num3 : %d%n", num1, num2, num3);
	  // num1 : 12, num2 : 10, num3 : 12
	  
	  num3 = 20;
	  System.out.printf("num3 : %d%n", num3++); // 20(후위연산자)
	  System.out.printf("num3 : %d%n", num3); // 21
	  
	  num3 = 30;
	  System.out.printf("num3 : %d%n", ++num3); // 31(전위연산자)
	  System.out.printf("num3 : %d%n", num3); // 31
	  
	  int number = 10;
	  System.out.printf("%d %d %d %d %d %d%n",
			  number++, ++number, number--, ++number, number++, number);
	// 10, 12, 12, 12, 12, 13 
	// 연습 필요!!
	  
	  
  }
}
