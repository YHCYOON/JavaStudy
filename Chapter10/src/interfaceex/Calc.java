package interfaceex;

public interface Calc {

	// puble static final  (상수로 선언됨)
	double PI = 3.14;
	int ERROR = -99999999;
	
	// public abstract   (추상 메서드로 선언됨)
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {		// 하위 클래스들에 공통된 것들은 디폴트 메서드로 설정. 오버라이딩 가능
		System.out.println("정수 계산기를 구현합니다");
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for ( int i : arr ) {
			total += i;
		}
		return total;
	}
	

}
