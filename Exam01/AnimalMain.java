package Exam01;

public class AnimalMain {

	public static void main(String[] args) {

		Animal ani = new Animal();
		System.out.println("발톱개수 " + ani.claw);
		System.out.println("꼬리길이 " + ani.tailsize);
		System.out.println("무늬 " + ani.pattern);
		System.out.println("이빨개수 " + ani.teeth);

		Dog dog = new Dog(); // 하위
		dog.pattern = "줄무늬";
		Animal ani2 = dog; // 상위에 하위가 담겨서 상위의 타입을 가져왔다
		ani2.pattern = "별모양";

		// 변수는 독단적으로 기능 수행
		Animal ani3 = new Animal();
		Dog jin = (Dog) ani2;

		System.out.println(dog.pattern);
		System.out.println(ani3.pattern);
		System.out.println(jin.pattern);
		
	}
}
