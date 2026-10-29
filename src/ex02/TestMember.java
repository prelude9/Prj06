package ex02;

class Member {
	// fields >> private! 속성, 특징 
	private String  name;  // 전역변수 안에서는 파랑색으로 표시됨 
	private String email;
	
	//constructor
	//기본 생성자: NoArgsConstructor
	public Member () {
		
	}
	//모든 인자가 있는 생성자 : @AllArgsConstructor
	public Member(String name, String email) {
		this.name = name;   //this가 없으면 혼선이 생김. 
		this.email = email;
	}		
	
	
	//getter 
	public String getName() {
		return this.name;
	}

	public String getEmail() {
		return email;
	}


	//setter
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email){
		this.email = email; // 여기서 email은 지역변수임
	}


	//method - 기능! 
	public void info() {
		System.out.println("이름: " + name + ", 이메일:" + email);
    }
}

public class TestMember {

	public static void main(String[] args) {
		Member m1 = new Member("박찬호", "park@kbo.or.kr");
		// m1.name  // 여기서 name 필드가 private으로 설정되어 있기 때문에 오류남 
		m1.info();
		
		Member m2 = new Member("류현진", null); 
		m2.info();
		
		// m2.email = "ryu@kbo.co.kr";  >> email은 private으로 설정되어 있기 때문에 에러남 
		// setter, getter 함수 사용 
		m2.setEmail("ryu@kbo.or.kr");
		m2.info();
		
		// m2의 이름만 알고 싶어요! 
		//System.out.println(m2.name);   >> 이렇게 하면 name이 private이라서 안 됨!
		String m2Name = m2.getName(); 
		System.out.println(m2Name);
		
		Member m3 = new Member();  // new Member()에서 오류 발생!!! ... 생성자에서 기본생성자를 만들어놓고 해야함! 
		m3.setName("최동원");
		m3.setEmail("choi@kbo.or.kr");
		m3.info();
	}

}
