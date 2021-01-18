package generics;

public class TreeDPrinterTest {

	public static void main(String[] args) {

		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
		
		printer.setMaterial(new Powder());
		
		Powder powder = printer.getMaterial();
		
		System.out.println(powder);
	}

}
