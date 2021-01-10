package cooperation;

public class Subway {

	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {	// ½Â°´ÀÌ ÅÀÀ»¶§ ¸Ş¼­µå
		passengerCount++;
		this.money += money;
	}
	
	public void showInfo() {
		System.out.println("ÁöÇÏÃ¶ " + lineNumber + "¹øÀÇ ½Â°´Àº " + passengerCount + "¸í ÀÌ°í, ¼öÀÔÀº " + money + "¿ø ÀÔ´Ï´Ù.");
	}
	
}
