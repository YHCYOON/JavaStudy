package string;

public class StringTest {

	public static void main(String[] args) {

		String str1 = new String("java");
		String str2 = new String("android");

		System.out.println(System.identityHashCode(str1));
		
		str1 = str1.concat(str2);
		System.out.println(System.identityHashCode(str1));
		System.out.println(str1);	// 기존의 java 에 붙는게 아니고 javaandroid 라는 새로운 메모리를 생성
	}

}
