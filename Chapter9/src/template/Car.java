package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void wiper();
	public abstract void stop();
	
	public void washCar() {
	
	}
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	
	public final void run() {	// ���ø� �޼��� - final �� ������ �ϸ� ����Ŭ�������� �������̵� �Ҽ� ����. �������ʴ� �޼��带 �����Ҷ� ��
										
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
