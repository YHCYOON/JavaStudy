package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		// Calc calc1 = new Calc();	// �������̽��� �߻�Ŭ������ ���� new�� ��ü ����� ����
		// Calc calc2 = new Calculator();	// �߻�Ŭ������ ����� ����
		
		
		System.out.println(calc.add(num1, num2));
		
		
		
	}
}
