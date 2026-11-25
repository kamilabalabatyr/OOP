package Pr6;

import Lab2Prob5.Animal;

public abstract class MyAnimal extends Animal implements Comparable<MyAnimal>, Cloneable, Trainable {
    
    public MyAnimal(String name, int age) {
        super(name, age);
    }
    
    private String[] tricks = new String[10];
    private int trickCount = 0;
    
    @Override
    public void train(String trick) {
        tricks[trickCount++] = trick;
        System.out.println(getName() + " learned: " + trick);
    }
    
    @Override
    public String[] getTricks() { return tricks; }
    
    @Override
    public int compareTo(MyAnimal other) {
        return Integer.compare(this.age, other.age); 
    }
    
    @Override
    public Animal clone() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
