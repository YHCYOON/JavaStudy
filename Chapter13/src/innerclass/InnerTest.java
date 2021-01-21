package innerclass;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	public InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	
	class InClass{
		int inNum = 200;
		// static int sInNum = 100;	// 내부클래스에서는 static 변수 선언 불가
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
		
		// static void sTest() {}	// static 메서드도 선언 불가
	}
}

public class InnerTest {

	public static void main(String[] args) {

		OutClass outClass = new OutClass();
		outClass.inClass.inTest();
		
		OutClass.InClass inClass = outClass.new InClass();
		inClass.inTest();
	}

}
