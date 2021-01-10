package staticex;

public class HeartCounter {

	// int count;
	static int count;
	
	public HeartCounter() {
		count++;
		System.out.println("ÁÁ¾Æ¿ä °¹¼ö :" + this.count);
	}
	
	public static int getCount() {
		return count;
	}
	
	public static void main(String[] args) {
		HeartCounter h1 = new HeartCounter();
		HeartCounter h2 = new HeartCounter();
		
		System.out.println("ÃÑ count " + HeartCounter.getCount());
		
	}

}
