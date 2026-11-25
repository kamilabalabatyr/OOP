package Lab2Prob5;

public class TestProb5 {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Computer Science", "AI");
        Animal murka = new Cat("Murka", 5);

        john.assignPet(murka);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        System.out.println("Initial state:");
        System.out.println(registry);

        john.leavePetWith(alice);
        System.out.println("After John leaves pet with Alice:");
        System.out.println(registry);

        john.retrievePetFrom(alice);
        System.out.println("After John retrieves pet from Alice:");
        System.out.println(registry);

        Animal rex = new Dog("Rex", 3);
        john.assignPet(rex);
        System.out.println("John now has a dog:");
        System.out.println(registry);

        john.leavePetWith(alice);
        System.out.println("Trying to leave dog with Alice:");
        System.out.println(registry);
    }
}