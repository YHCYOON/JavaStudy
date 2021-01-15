package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void wiper();
	public abstract void stop();
	
	public void washCar() {
	
	}
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	public final void run() {	// 템플릿 메서드 - final 로 지정을 하면 하위클래스에서 오버라이딩 할수 없다. 변하지않는 메서드를 정의할때 씀
										
		startCar();
		drive();
		wiper();
		stop();
		washCar();
		turnOff();
	}
}
