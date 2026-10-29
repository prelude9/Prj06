package ex04;

import java.util.Objects;

class Member {
	// Fields
	private String name;
	private String phone; 
	private int bYear;

	// Constructor : 기본생성자와 인자생성자
	public Member() {}
	
	public Member(String name, String phone, int bYear) {
		// super();  >> 현재는 의미없음 
		this.name = name;
		this.phone = phone;
		this.bYear = bYear;
	}
		//getter, setter : setter는 값을 입력하는 역할, getter는 
		
		public String getName() {
			return name;
		}

		public String getPhone() {
			return phone;
		}

		public int getbYear() {
			return bYear;
		}

		@Override
		public String toString() {
			return "Member [name=" + name + ", phone=" + phone + ", bYear=" + bYear + "]";
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(bYear, name, phone);
		}

		@Override
		public boolean equals(Object obj) {
			Member other = (Member) obj;
		/*	if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false; 
			Member other = (Member) obj;
			return Objects.equals(bYear, other.bYear) && Objects.equals(name, other.name)
					&& Objects.equals(phone, other.phone); */
			
			return name.equals(other.name);
		}
}

		
	// method

public class TestMemver {

	public static void main(String[] args) {
		Member [] mArr = new Member[3]; // 배열은 개수를 정해주어야 함 
		mArr[0] = new Member("강호동", "010", 1980);   // toString override 해줘야 함! 
		mArr[1] = new Member("서장훈", "020", 1983);
		mArr[2] = new Member("김연아", "030", 1987);
		
		System.out.println("전체 목록");
		/*
		System.out.println(mArr[0]);
		System.out.println(mArr[1]);
		System.out.println(mArr[2]);
		*/
		for(int i=0 ; i<mArr.length ; i++) {
			System.out.println(mArr[i]);
		}
		
		// 김연아의 정보를 출력하시오
		Member m = new Member("김연아", null, 0); // 이름만으로 비교한다
		for(int i=0 ; i<mArr.length ; i++) {
			if(mArr[i].equals(m))
				System.out.println(mArr[i]);
		}
		
	}

}
