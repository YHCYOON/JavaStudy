package singleton;

public class Company {

	private static Company instance = new Company();
	private Company(){
		
	}
	
	public static Company getInstance() {		// instance ��ü�� �������� public �޼��带 �������
		return instance;
	}
}
