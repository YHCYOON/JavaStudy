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
	

}
