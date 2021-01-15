package inheritance;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("������ �����Դϴ�");
	}
}

class Human extends Animal{
	
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�");
	}
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�");
	}
}

class Eagle extends Animal{
	
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�");
	}
}

public class AnimalTest {

	public static void main(String[] args) {

		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());
		
		Animal[] animalList = new Animal[3];
		animalList[0] = new Human();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
	}
	// ������ �����ϱ�
	// �ϳ��� Ŭ������ ��ӹ��� ���� Ŭ������ �ִ� ���
	// �� Ŭ�������� ���� �̸��� ���� �ٸ� �޼��带 ������ ��
	// ���� Ŭ���� Ÿ������ ����� �ϳ��� ������ ���� �ν��Ͻ��� ���ԵǾ� �پ��� ������ ����� �� ����
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}