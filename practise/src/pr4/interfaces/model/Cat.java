package pr4.interfaces.model;

public class Cat implements CanHavePizza{
	private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void eatPizza() {
        System.out.println("The cat " + name + " is eating pizza");
}
}
