package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1", "조정래");
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		// System.arraycopy(bookArray1, 0, bookArray2, 0, 3);		// 얕은 복사
		
		
		// 깊은 복사
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
			bookArray2[i].setBookName(bookArray1[i].getBookName());
		}
		
		bookArray1[0].setBookName("으악");
		bookArray1[0].setAuthor("뭐지");
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray1[i].showBookInfo();
			bookArray2[i].showBookInfo();
		}
		
		String[] strArr = {"Java", "Android", "C"};
		// 기존 for문
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		// 향상된 for문
		for(String s : strArr) {	// 배열의 인덱스가 순차적으로 s에 대입
			System.out.println(s);
		}
		
		
	}

}
