package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("�ȳ��ϼ���1");
		shelfQueue.enQueue("�ȳ��ϼ���2");
		shelfQueue.enQueue("�ȳ��ϼ���3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
