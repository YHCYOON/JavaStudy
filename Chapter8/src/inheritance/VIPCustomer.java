package inheritance;

public class VIPCustomer extends Customer {

	private int agentID;
	private double saleRatio;
	
	
	// 기본 생성자
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
		System.out.println("VIPCustomer(int, String) 호출");
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	// 포인트 적립 메서드 (오버라이딩)
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

	
}
