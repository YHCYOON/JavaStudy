package array;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("¾È³ç0","ÇÏ¼¼¿ä0");
		library[1] = new Book("¾È³ç1","ÇÏ¼¼¿ä1");
		library[2] = new Book("¾È³ç2","ÇÏ¼¼¿ä2");
		library[3] = new Book("¾È³ç3","ÇÏ¼¼¿ä3");
		library[4] = new Book("¾È³ç4","ÇÏ¼¼¿ä4");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
			
		}
	}

}
