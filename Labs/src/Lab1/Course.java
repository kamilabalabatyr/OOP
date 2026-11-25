package Lab1; 

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String description;
    private int credits;
    private List<String> prerequisites;

    public Course(String name, String description, int credits) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = new ArrayList<>();
    }

    public Course(String name, String description, int credits, List<String> prerequisites) {
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisites = new ArrayList<>(prerequisites);
    }

    public String getName(){
    	return name;
    	}
    public String getDescription() { 
    	return description;
    	}
    public int getCredits() {
    	return credits;
    	}
    public List<String> getPrerequisites(){
    	return new ArrayList<>(prerequisites);
    	}

    @Override
    public String toString() {
        return "Course{name='" + name + "', credits=" + credits +
        		", prerequisites=" + prerequisites + "}";
    }
}
