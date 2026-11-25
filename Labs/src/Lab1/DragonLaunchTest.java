package Lab1;

public class DragonLaunchTest {
    public static void main(String[] args) {
        DragonLaunch dl = new DragonLaunch();

        dl.kidnap(new Person("1", Gender.BOY));
        dl.kidnap(new Person("2", Gender.BOY));
        dl.kidnap(new Person("3", Gender.GIRL));
        dl.kidnap(new Person("4", Gender.GIRL));

        System.out.println(dl.willDragonEatOrNot()); 
    }
}

