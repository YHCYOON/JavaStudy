package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student(100, "James");
		student1.setKorea(100);
		student1.setMath(100);
		
		Student student2 = new Student(101, "Tomas");
		student2.setKorea(70);
		student2.setMath(60);
		
		
		student1.showStudentInfo();
		student2.showStudentInfo();
	}

}
