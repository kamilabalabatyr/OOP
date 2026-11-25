package pr3.delivery.model;

public class Airplane extends Vehicle {
	int smthing;
	
	public Airplane(String model, double baseCost, Engine engine, int smthing) {
		super(model, baseCost, engine);
		this.smthing = smthing;
	}
	
	@Override
	public double calculateDeliveryCost() {
        return baseCost + smthing*200;
    }

}
