package pr4.interfaces.model;

public class iPhone implements SellableAndPlugable{
	@Override
    public void sell() {
        System.out.println("iPhone is sold");
    }

    @Override
    public void plug() {
        System.out.println("iPhone is charging");
    }
}
