package Lab1;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> kidnapped = new Vector<>();

    public void kidnap(Person p) {
        kidnapped.add(p);
    }

    // true = dragon will eat 
    // false = no lunch 
    public boolean willDragonEatOrNot() {
        int top = 0; 

        for (int i = 0; i < kidnapped.size(); i++) {
            Person cur = kidnapped.get(i);

            if (top > 0) {
                Person prev = kidnapped.get(top - 1);
                
                if (prev.getGender() == Gender.BOY && cur.getGender() == Gender.GIRL) {
                    top--;
                    continue;
                }
            }

            kidnapped.set(top, cur);
            top++;
        }

        while (kidnapped.size() > top) kidnapped.remove(kidnapped.size() - 1);

        return top > 0;
    }

    @Override
    public String toString() {
        return kidnapped.toString();
    }
}

