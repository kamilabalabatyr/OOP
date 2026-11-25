package Pr4;
import java.util.Date;
import java.util.Vector;

public class Manager extends Employee {
	
	private Vector<Employee> team;
    private double bonus;
    
    //constructors
	public Manager() {
		super();
		this.team = new Vector<>();
		this.bonus = 0;
	}
	
	public Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
		super(name, salary, hireDate, insuranceNumber);
        this.team = new Vector<>();
        this.bonus = bonus;
	}
	
	//accessor methods
	public double getBonus() { return bonus; }
	public void setBonus(double bonus) {this.bonus = bonus;}
	
	public Vector<Employee> getTeam(){return team;}
	
	
	public void addEmployee(Employee e) {
        team.add(e);
    }
    
    public void removeEmployee(Employee e) {
        team.remove(e);
    }
    
    @Override
    public String toString() {
        return "Manager's name = " + getName() + ", salary = " + getSalary() + ", bonus = " + bonus + ", size of the team = " + team.size();
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Manager)) return false;
        Manager other = (Manager) o;
        return this.getInsNumber().equals(other.getInsNumber());
    }
    
  //comparable
  	@Override
  	public int compareTo(Employee other) {
  		int compareSalary = Double.compare(this.getSalary(), other.getSalary());
  		
  		if(compareSalary == 0 && other instanceof Manager) {
  			return Double.compare(this.bonus, ((Manager) other).bonus);
  		}
		return compareSalary;
  	}
  	
  	//deep clone
  	@Override
    public Manager clone() {
        Manager cloned = (Manager) super.clone();
		
		cloned.team = new Vector<>();
		for (Employee e : this.team) {
		    cloned.team.add(e.clone()); 
		}
		return cloned;
    }
}
