
public class Ex01 {
	public static void main(String[] args) {
//		int 공간을 확보하고 nember 라는 이름표를 붙임
		int number;
		
//		number라는 공간에 값을 저장함 (값은 덮어 씌워짐)
		number = 10;
		number = 20;
		number = 30;
		System.out.print  ("number : " + number + "\n");
		System.out.println("number : " + number);
		System.out.printf ("number : %d%n", number);
		
		String str1 = "abc";
	    System.out.printf("str1 : %s%n", str1);
	    String str2 = new String("abc");
	    System.out.printf("str2 : %s%n", str2);
	    str2=null;
	    System.out.printf("str2 : %s%n", str2);
       
		
	}
	
}