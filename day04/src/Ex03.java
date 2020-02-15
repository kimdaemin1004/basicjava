
public class Ex03 {
	public static void main(String[] args) {
		// 비트연산자 : AND(&), OR(|), XOR(^), NOT(~)
		int num1 = 10, num2 = 5;
		// 1 0 1 0, 0 1 0 1
		// 1 0 1 0
		// 0 1 0 1
		// 0 0 0 0
		
		int result = num1 & num2;
		System.out.println("result : " + result);
		
		result = num1 | num2;
		System.out.println("result : " + result);
		
		result = num1 ^ num2;
		System.out.println("result : " + result);
		
		result = ~num1 & num2;
		System.out.println("result : " + result);
		
	}

}
