package arraylist;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("����",100);
		studentLee.addSubject("����",98);
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(1001, "Kim");
		studentKim.addSubject("����",60);
		studentKim.addSubject("����",68);
		
		studentKim.showStudentInfo();
		
	}

}
