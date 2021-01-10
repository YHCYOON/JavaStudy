package staticex;

public class Student {
	
	private static int serialNum = 10000;	// static 변수, 클래스 변수
	
	int studentID;		// 멤버변수, 인스턴스변수
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10; 	// 지역변수
		i++;
		System.out.println(i);
		
		// studentName = "홍길동";		// static 메서드에서는 멤버변수를 사용할수 없음
		
		return serialNum;
	}
	
	
	
}
