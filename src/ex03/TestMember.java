package ex03;

// 자바의 모든 class는 기본으로 object class 상속받는다
class A extends Object {}   
// == class A {}
// equals()   : 객체 비교
// toString() : 객체이름을 출력할 때
// hashCode() : 객체의 인스턴스의 heap상의 위치를 출력 
// getClass() : 클래스 정보를 가지고 온다

class Member extends Object {
	// Fields
	private String name;
	private String phone;
	
	
	// Constructor
	// alt+shift+s 눌러서 Constructor 생성
	public Member() {    // 기본생성자 
		
	}
	
	public Member(String name, String phone) {  // 인자가 있는 생성자
		this.name = name;
		this.phone = phone;
	}
	
	//getter, setter 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	//method
	public void info() {
		System.out.println("이름: " + name +" 전화: " + phone );
	}

}

public class TestMember {

	public static void main(String[] args) {
		Member m1 = new Member("손흥민", "010-0000-0000");
		Member m2 = new Member("안정환", "010-1111-1111");
		Member m3 = new Member("차범근", "010-2222-2222");
		
		m1.info();
		m2.info();
		m3.info();

		// 손흥민의 이름과 전화번호를 찾아줘! 
		Member m = new Member("손흥민", "010-0000-0000");
		System.out.println(m1==m); // 다른 사람으로 나옴. 왜냐면 저장된 주소값이 다르므로. 그럼 m1과 m을 같은 사람으로 만들수 없을까? 
		System.out.println(m1.equals(m)); //
		
		A  a = new A();

		System.out.println("=========================");
		System.out.println(m1);             //패키지이름, 클래스 이름, 16진수 
		System.out.println(m1.toString());
		System.out.println(m1.hashCode());
		System.out.println(m1.getClass()+"\n");
		
		System.out.println(m3.hashCode());
		
	}

}
