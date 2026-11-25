package Lab2Prob5;

import java.util.Vector;

public class PersonRegistry {
    private Vector<Person> people;

    public PersonRegistry() {
        people = new Vector<>();
    }

    public void addPerson(Person person) {
        if (person != null) {
            people.add(person);
        }
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public Vector<Person> findPeopleWithPets() {
        Vector<Person> result = new Vector<>();
        for (Person person : people) {
            if (person.hasPet()) {
                result.add(person);
            }
        }
        return result;
    }

    public Vector<Person> findPeopleWithoutPets() {
        Vector<Person> result = new Vector<>();
        for (Person person : people) {
            if (!person.hasPet()) {
                result.add(person);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PersonRegistry:\n");
        for (Person person : people) {
            sb.append(person).append("\n");
        }
        return sb.toString();
    }
}
