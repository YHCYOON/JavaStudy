package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		// Calc calc1 = new Calc();	// 인터페이스는 추상클래스와 같이 new로 객체 만들수 없음
		// Calc calc2 = new Calculator();	// 추상클래스라 만들수 없음
		
		
		System.out.println(calc.add(num1, num2));
		
		
		
	}
}
