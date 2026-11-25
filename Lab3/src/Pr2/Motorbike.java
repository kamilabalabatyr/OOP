package Pr2;

public class Motorbike implements Driveable {
	@Override
	public void move() {
		System.out.println("The motorbike can be moved by people");
	}

	@Override
	public void brake() {
		System.out.println("The motorbike is braking");
	}

	@Override
	public void turn(String direction) {
		System.out.println("The motorbike is turning " + direction);		
	}
}
