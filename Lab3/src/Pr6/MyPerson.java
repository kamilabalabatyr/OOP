package Pr6;

import Lab2Prob5.Person;

public abstract class MyPerson extends Person implements Comparable<MyPerson>, Cloneable, PetOwner {

    public MyPerson(String name, int age) {
        super(name, age);
    }

    @Override
    public void feedPet() {
        if (hasPet()) {
            System.out.println(getName() + " is feeding " + getPet().getName());
        } else {
            System.out.println(getName() + " has no pet to feed");
        }
    }

    @Override
    public void playWithPet() {
        if (hasPet()) {
            System.out.println(getName() + " is playing with " + getPet().getName());
        } else {
            System.out.println(getName() + " has no pet to play with");
        }
    }

    @Override
    public int compareTo(MyPerson other) {
        return Integer.compare(this.getAge(), other.getAge()); 
    }

    @Override
    public MyPerson clone() {
        try {
            return (MyPerson) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}