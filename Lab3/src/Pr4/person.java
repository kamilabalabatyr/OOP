package Pr4;

public class person {
	private String name;
	
	//constructors
	public person(String name) {
		this.name = name;
	}
	public person() {
		this.name = "";
	}
	
	//accessor methods
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//methods
	public String toString() {
		return "Person's name = " + name;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if (this == null) return false;
		if(!(o instanceof person)) return false;
		person other = (person) o;
		return this.name.equals(other.name);
	}
}
