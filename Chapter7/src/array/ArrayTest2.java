package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		double[] num = new double[5];
		int size = 0;
		
		num[0] = 10.0; size++;
		num[1] = 20.0; size++;
		num[2] = 30.0; size++;
		
		double total = 1.0;
		
		for(int i = 0; i < num.length; i++) {
			total *= num[i];
		}
		
		System.out.println(total);
		
		// 존재하는 인덱스 까지의 곱을 구할때
		
		double total2 = 1.0;
		for(int i = 0; i < size; i++) {
			total2 *= num[i];
		}
		System.out.println(total2);
	
	}

}
