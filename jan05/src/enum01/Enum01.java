package enum01;
//Enum : 열거타입
//열거한 데이터만 쓸 수 있습니다.
//같은 값은 가질 수 없습니다.
//Enum은 클래스명하고 중복할 수 없습니다.

enum Week{
	MON, TUE, WED, THU, FRI, SET, SUN;
}

public class Enum01 {
	public static void main(String[] args) {
		Week week = Week.FRI;
		
		var number = 10;
		//값으로 데이터 타입을 추론합니다. 지역변수로만 가능
		//꼭 초기화 후 사용, null초기화 안 됨, 배열 사용 불가
		System.out.println(number);
		
		var name="홍길동";
		String str = name;
		
		//레코드는 자바 16에 추가
	}
}
