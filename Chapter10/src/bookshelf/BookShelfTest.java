package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("æ»≥Á«œººø‰1");
		shelfQueue.enQueue("æ»≥Á«œººø‰2");
		shelfQueue.enQueue("æ»≥Á«œººø‰3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
