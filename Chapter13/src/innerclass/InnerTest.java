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
		// static int sInNum = 100;	// ����Ŭ���������� static ���� ���� �Ұ�
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
		
		// static void sTest() {}	// static �޼��嵵 ���� �Ұ�
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
