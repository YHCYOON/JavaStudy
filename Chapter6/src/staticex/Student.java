package staticex;

public class Student {
	
	private static int serialNum = 10000;	// static ����, Ŭ���� ����
	
	int studentID;		// �������, �ν��Ͻ�����
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10; 	// ��������
		i++;
		System.out.println(i);
		
		// studentName = "ȫ�浿";		// static �޼��忡���� ��������� ����Ҽ� ����
		
		return serialNum;
	}
	
	
	
}
