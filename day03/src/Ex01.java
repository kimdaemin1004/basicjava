
public class Ex01 {
 public static void main(String[] args) {
	 // float type의 선언과 초기화
	 float f;
	 f=10.45F;
	 
	 double d;
	 d=10.43;
	 
	 

	 
	 // ASCII Code
	 // 'A' - 65, 'a' - 97, '0' - 48
	 char result='0'+'2'; // 자동 형변환됨 (int->char)
	 System.out.printf("result:%c%n", result); // 결과 : b
	 
	 int result2='0'+'2'; // int type에 할당하면 int로 저장됨
	 System.out.printf("result2:%d%n", result2); // 결과 : 98
	 
	 result='2'-'0'; // 자동 형변환됨 (int->char)
	 System.out.printf("result:%c%n", result); // 결과 : b
	 
	 result2='2'-'0'; // int type에 할당하면 int로 저장됨
	 System.out.printf("result2:%d%n", result2); // 결과 : 2
	 

	 
	 // 문자 저장하기 : ''(cf. String : "")
	 char ch;
	 ch='G';
	 
	 System.out.printf("ch:%c%n", ch);
	 
	 // G -> g로 변환하기
	 // ASCII Code 이용하기
	 
	// ASCII Code
   // 'A' - 65, 'a' - 97, '0' - 48
	 // 'a' - 'A' --> 97-56 : (32)
	 // 'g' - 'G' --> 97-56 : (32)
	 
	 // ch+('a' - 'A') : 대문자를 소문자로 변환함
	 // ch-('a' - 'A') : 소문자를 대문자로 변환함

	 
	 System.out.printf("ch:%c%n", ch+('a' - 'A')); // g
	 System.out.printf("ch:%c%n", ch+('a' - 'A')); // ?
	 
	 //변수 공간의 값은 할당연산자를 사용해야만 변경됨
	 
	 
	 
	 
	 
	 
 }
}
