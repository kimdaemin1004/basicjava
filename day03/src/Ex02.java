
public class Ex02 {
	public static void main(String[] args) {
		
		int num=10;
		System.out.println("num : " + num); //10
		
		num=num+1;
		System.out.println("num : " + num); //11
		
		num += 1;
		System.out.println("num : " + num); //12
		
		
		
		// 증가(감소) 연산자는 할당연산자를 사용하지 않아도 
		// 변수 공간에 저장된 값이 1 증가(감소)함

		++num;
		System.out.println("num : " + num); //13
		
		num++;
		System.out.println("num : " + num); //14
	}

}
