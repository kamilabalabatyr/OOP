package Lab2Prob5;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;
    private Person temporaryPetOwner;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.pet = null;
        this.temporaryPetOwner = null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal getPet() {
        return pet;
    }

    public Person getTemporaryPetOwner() {
        return temporaryPetOwner;
    }

    public void setTemporaryPetOwner(Person temporaryPetOwner) {
        this.temporaryPetOwner = temporaryPetOwner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void assignPet(Animal pet) {
        if (pet == null) {
            System.out.println(name + " cannot take a null pet.");
            return;
        }

        if (this.pet != null) {
            System.out.println(name + " already has a pet.");
            return;
        }

        if (!canTakePet(pet)) {
            System.out.println(getName() + " cannot take " + pet.getClass().getSimpleName() + ".");
            return;
        }

        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public boolean canTakePet(Animal pet) {
        return true;
    }

    public void leavePetWith(Person caretaker) {
        if (caretaker == null) {
            System.out.println("Caretaker is null.");
            return;
        }

        if (!this.hasPet()) {
            System.out.println(name + " has no pet to leave.");
            return;
        }

        if (caretaker.hasPet()) {
            System.out.println(caretaker.getName() + " already has a pet.");
            return;
        }

        if (!caretaker.canTakePet(this.pet)) {
            System.out.println(caretaker.getName() + " cannot take this pet.");
            return;
        }

        Animal temp = this.pet;
        this.removePet();
        caretaker.assignPet(temp);
        caretaker.setTemporaryPetOwner(this);
    }

    public void retrievePetFrom(Person caretaker) {
        if (caretaker == null) {
            System.out.println("Caretaker is null.");
            return;
        }

        if (this.hasPet()) {
            System.out.println(this.getName() + " already has a pet.");
            return;
        }

        if (!caretaker.hasPet()) {
            System.out.println(caretaker.getName() + " has no pet to return.");
            return;
        }

        if (caretaker.getTemporaryPetOwner() != this) {
            System.out.println("This pet does not belong to " + this.getName() + ".");
            return;
        }

        Animal temp = caretaker.getPet();
        caretaker.removePet();
        caretaker.setTemporaryPetOwner(null);
        this.assignPet(temp);
    }

    public abstract String getOccupation();

    @Override
    public String toString() {
        String petInfo = (pet == null) ? "no pet" : pet.toString();
        return getClass().getSimpleName() +
                "[name=" + name +
                ", age=" + age +
                ", occupation=" + getOccupation() +
                ", pet=" + petInfo + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
