package classpart;

public class StudentTest {
	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "����";

		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "�ϻ�";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
	}
}
