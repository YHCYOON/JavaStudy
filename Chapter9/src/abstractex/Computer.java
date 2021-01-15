package abstractex;

public abstract class Computer {		// 추상클래스

	// 선언만 하고 구현부분이 없으면 추상메서드
	public abstract void display();
	public abstract void typing();
	
	
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
}
