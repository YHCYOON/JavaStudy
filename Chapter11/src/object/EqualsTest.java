package object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Student) {
			Student student = (Student)obj;
			
			if(studentID == student.studentID)
				return true;
			else
				return false;
		}
		return false;
	}
	
	public int hashCode() {
		return studentID;
	}
}

public class EqualsTest {

	public static void main(String[] args) {

		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2);			// 인스턴스 주소가 같은지 판별
		System.out.println(str1.equals(str2));	// 인스턴스의 값이 같은지 판별
	
		Student student1 = new Student(10001, "강씨");
		Student student2 = new Student(10001, "강씨");
		
		System.out.println(student1 == student2);
		System.out.println(student1.equals(student2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		
		
	}

}
