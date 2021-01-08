package classpart;

public class StudentTest {
	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "서울";

		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "일산";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
	}
}
