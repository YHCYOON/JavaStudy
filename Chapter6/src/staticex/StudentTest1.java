package staticex;

public class StudentTest1 {

	public static void main(String[] args) {

		Student aaa = new Student();
		System.out.println(aaa.studentID);

		
		Student bbb= new Student();
		System.out.println(bbb.studentID);
		
		System.out.println(aaa.getSerialNum());
		System.out.println(bbb.getSerialNum());	// ����ƽ ������ �ν��Ͻ� ������ ���� (warning)
		System.out.println(Student.getSerialNum());	// �ν��Ͻ� ������ ���������ʰ� Ŭ���� �̸����� ���� 
	}

}
