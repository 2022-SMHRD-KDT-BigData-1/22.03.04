package Exam01;

public class AnimalMain {

	public static void main(String[] args) {

		Animal ani = new Animal();
		System.out.println("���鰳�� " + ani.claw);
		System.out.println("�������� " + ani.tailsize);
		System.out.println("���� " + ani.pattern);
		System.out.println("�̻����� " + ani.teeth);

		Dog dog = new Dog(); // ����
		dog.pattern = "�ٹ���";
		Animal ani2 = dog; // ������ ������ ��ܼ� ������ Ÿ���� �����Դ�
		ani2.pattern = "�����";

		// ������ ���������� ��� ����
		Animal ani3 = new Animal();
		Dog jin = (Dog) ani2;

		System.out.println(dog.pattern);
		System.out.println(ani3.pattern);
		System.out.println(jin.pattern);
		
	}
}
