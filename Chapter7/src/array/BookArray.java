package array;

public class BookArray {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("�ȳ�0","�ϼ���0");
		library[1] = new Book("�ȳ�1","�ϼ���1");
		library[2] = new Book("�ȳ�2","�ϼ���2");
		library[3] = new Book("�ȳ�3","�ϼ���3");
		library[4] = new Book("�ȳ�4","�ϼ���4");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
			
		}
	}

}
