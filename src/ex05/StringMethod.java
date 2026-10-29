package ex05;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
	System.out.println("문자열길이: " + "hello".length()); // length 뒤에는 () 있어야 함 
	System.out.println("문자열길이: " + "안녕하세요".length());
	
	//            01234 5 6 7 8 9
	String str = "Java 프로그래밍";
	System.out.println("1위치의 글자: " + str.charAt(1));

	//             1234567890
	String str2 = "Hello World";
	System.out.println("부분문자열 substring: " + str2.substring(0, 4+1)); // 0~4까지 자르는데 +1, 그냥 외움.. 
	System.out.println("부분문자열 substring: " + str2.substring(6) );  // 6부터 끝까지

	String str3 = "banana";
	System.out.println("문자(a)의 위치: " + str3.indexOf('a'));       //1
	System.out.println("문자(a)의 위치: " + str3.indexOf('a', 2));	//3
	System.out.println("문자(a)의 위치: " + str3.lastIndexOf('a'));   //5 
	
	// ~를 포함하는
	String str4 = "choco pie + apple pie";
	System.out.println("pie 문자열을 포함하는가? " + str4.contains("pie"));
	
	// ~로 시작하는
	String str5 = "filename.java";
	System.out.println("file의 시작: " + str5.startsWith("file"));
	System.out.println("file의 위치: " + str5.indexOf("file"));
	
	// ~로 끝나는 
	System.out.println(".java로 끝나는: " + str5.endsWith(".java"));

	// 문자열 비교
	String str6 = "Java";
	String str7 = "java";
	System.out.println(str6.equals(str7));
	System.out.println(str6.equalsIgnoreCase(str7));
	
	// 대소문자 변환
	System.out.println(str6.toUpperCase());
	System.out.println(str6.toLowerCase());
	
	// 앞뒤의 공백 제거
	String str8 = "      짱구   ";
	System.out.println(str8);
	System.out.println(str8.length());
	
	System.out.println(str8.trim());
	System.out.println(str8.trim().length());
	
	// 교체
	String str9 = "I love Java";
	System.out.println(str9);
	System.out.println(str9.replace("Java", "Python")); // 출력할 때만 Python임 
	System.out.println(str9); // str9 데이터가 변한 것은 아님 
	
	String str10 = str9.replace("Java", "아나콘다");
	System.out.println(str10);
	
	// split! 문자열을 문자열 배열로 분리 
	String str11 = "red,green,blue";   // >> 공백없이 작성할 것 
	System.out.println(str11);
	String [] colorArr = str11.split(",");
	System.out.println(colorArr);  //[Ljava.lang.String;@18b4aac2
	//System.out.println(Arrays.toString(colorArr)); 
	System.out.println(colorArr[0]);
	System.out.println(colorArr[1]);
	System.out.println(colorArr[2]);
	
	// String.format(...)
	String name = "Alice";
	int age = 30;
	System.out.println(String.format("이름: %s, 나이: %d", name, age));
	
	} 

}