package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		// int[] numbers = {0, 1, 2, 3, 4};
		// int[] numbers = new int[] {0, 1, 2, 3, 4}; 
		
		// int[] numbers = new int[5] {0, 1, 2, 3, 4};	// ���� : �迭�� �ʱ�ȭ �Ҷ��� �迭�� ������ ������� ����
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		int[] aaa = new int[10];
		for(int i = 0; i < aaa.length; i++) {
			System.out.println(aaa[i]);
		}
		
	}

}
