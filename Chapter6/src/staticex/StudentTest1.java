package staticex;

public class StudentTest1 {

	public static void main(String[] args) {

		Student aaa = new Student();
		System.out.println(aaa.studentID);

		
		Student bbb= new Student();
		System.out.println(bbb.studentID);
		
		System.out.println(aaa.getSerialNum());
		System.out.println(bbb.getSerialNum());	// 스태틱 변수를 인스턴스 변수로 참조 (warning)
		System.out.println(Student.getSerialNum());	// 인스턴스 변수로 참조하지않고 클래스 이름으로 참조 
	}

}
