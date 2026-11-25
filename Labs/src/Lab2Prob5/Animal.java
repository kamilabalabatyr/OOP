package Lab2Prob5;

import java.util.Objects;

public abstract class Animal {
    private String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String getSound();

    @Override
    public String toString() {
        return getClass().getSimpleName() + "[name=" + name + ", age=" + age + ", sound=" + getSound() + "]";
    }
    public boolean equals(Object o) {
    	if (this == o) return true;
    	if(!(this instanceof Animal)) return false;
    	Animal newl = (Animal) o;
    	return this.name.equals(newl.name) && this.age == newl.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
