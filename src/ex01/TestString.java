package ex01;

public class TestString {

	public static void main(String[] args) {
		String name1 = "이순신";
		String name2 = "이순신";
		String name3 = new String("이순신");
		String name4 = new String("이순신");	
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		
		if(name1 == name2)                          // heap 주소의 위치 비교 
			System.out.println("같은 이름");
		else
			System.out.println("다른 이름");
		
		if(name1 == name3)
			System.out.println("같은 이름");
		else
			System.out.println("다른 이름");
		
		if(name3 == name4)
			System.out.println("같은 이름");
		else
			System.out.println("다른 이름");
		
		// 변수 데이터의 저장값(데이터의 주소)이 다르기 때문에 다른 것으로 인식함 
		// 문자열만 비교하려면 다른 함수를 써야 한다
		
		if(name1.equals(name3))                     // equals 함수는 저장위치가 아닌 문자열만 비교 
			System.out.println("같은 이름");
		else 
			System.out.println("다른 이름");
		
		// name5과 name6 중에서 뭐가 더 큰 값인가? 
		String name5 = "이순신";
		String name6 = "이이";
		
		// 문자형태의 >, < 비교는 문자열의 정렬을 하기 위한 것(오름순, 내림순), 
		// if( name5 > name6 ); >> 에러발생. 왜냐면 비교 불가이기 때문에. 질문을 바꿔야 함.
		if( name5.compareTo(name6) > 0) {
			System.out.println(name5 + "(이)가 크다");
		} else {
			if( name5.compareTo(name6) == 0) {
				System.out.println(name5 + "와 " + name6 + " 는 같은 글자다");
			} else {
				if( name5.compareTo(name6) < 0) {
					System.out.println(name5 + "(이)가 작다");
				}
			}
		}
	}
}
