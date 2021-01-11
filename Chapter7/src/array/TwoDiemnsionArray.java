package array;

public class TwoDiemnsionArray {

	public static void main(String[] args) {

		int[][] arr = new int[2][3];
		System.out.println(arr.length);	//행의 길이 2
		System.out.println(arr[0].length);	//1행의 길이 3
		
		int[][] arr2 = {{1, 2, 3}, {4, 5, 6}};
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
			System.out.println(arr2[i][j]);
			}
		}
		
	
	}

}
