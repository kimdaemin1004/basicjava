
public class Ex04 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		// 1부터 몇까지 더했을 때의 합계가 
		// 100을 넘을까
		// i를 1씩 증가시키면서 sum을 더해나감
		
		while((sum += ++i) <= 100) {
			System.out.printf("%d - %d%n", i, sum);			
		}
	    System.out.println("====================");
	    System.out.println("1부터" + i + "까지 더하면 100을 넘습니다." );
	    
	    
		


	}

}
