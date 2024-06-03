package kosa.oop;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		System.out.println("모델명: " + car.model);
		System.out.println("시동여부: " + car.start);
		System.out.println("현재속도: " + car.speed);
		
	}  

}
