package Exam03;

public class Hydrogen extends Car {
	@Override
	public void charge() {
		System.out.println("수소 연료를 충전하다");
	}

	@Override
	public void run() {
		System.out.println("수소로 자동차를 달리다");
	}
}
