package singleton;

public class Company {

	private static Company instance = new Company();
	private Company(){
		
	}
	
	public static Company getInstance() {		// instance 객체를 쓰기위해 public 메서드를 만들어줌
		return instance;
	}
}
