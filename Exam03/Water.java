package Exam03;

public class Water extends Car {
	@Override
	public void charge() {
		System.out.println("물 연료를 충전하다");
	}

	@Override
	public void run() {
		System.out.println("물로 자동차를 달리다");
	}

}
