package generics;

public class TreeDPrinterTest {

	public static void main(String[] args) {

		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
		Powder powder = printer.getMaterial();
		System.out.println(powder);
		System.out.println(printer);
		
		TreeDPrinter<Plastic> printer2 = new TreeDPrinter<Plastic>();
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial();
		System.out.println(plastic);
		System.out.println(printer2);
			
//		Water 클래스는 Material 에서 상속받지 않아서 사용할수 없음
//		TreeDPrinter<Water> printer3 = new TreeDPrinter<Water>();
//		printer3.setMaterial(new Water());
//		System.out.println(printer3);
		
		printer2.printing();
	}
	

}
 