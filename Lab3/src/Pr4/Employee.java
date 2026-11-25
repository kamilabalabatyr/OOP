package Pr4;
import java.util.Date;

public class Employee extends person implements Comparable<Employee>, Cloneable{
	private double annualSalary;
	private Date hireDate;
	private String insuranceNumber;
	
	//constructors
	public Employee() {
		super();
		this.annualSalary = 0;
		this.hireDate = new Date();
		this.insuranceNumber = "";
	}
	
	public Employee(String name, double annualSalary, Date hireDate, String insuranceNumber) {
		super(name);
		this.annualSalary = annualSalary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}
	
	//accessor methods
	public double getSalary() {return annualSalary; }	
	public void setSalary(int Salary) { this.annualSalary = Salary; }
	
	public Date getHireDate() {return hireDate; }	
	public void setHireDate(Date date) { this.hireDate = date; }
	
	public String getInsNumber() {return insuranceNumber; }	
	public void setInsNumber(String insNum) { this.insuranceNumber = insNum; }
	
	
	@Override
    public String toString() {
        return "Employee's name = " + getName() + 
        		", Employee's annual salary = " + annualSalary + 
        		", Employee's hired date = " + hireDate + 
        		", Employee's insurance number = " + insuranceNumber;
    }
	
	@Override
	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Employee)) return false;
        Employee other = (Employee) o;
        return this.insuranceNumber.equals(other.insuranceNumber);
    } 
	
	//comparable
	@Override
	public int compareTo(Employee other) {
		return Double.compare(this.annualSalary, other.annualSalary);
	}
	
	//shallow clone
	 @Override
	    public Employee clone() {
	        try {
	            return (Employee) super.clone(); //  
	        } catch (CloneNotSupportedException e) {
	            return null;
	        }
	    }
}
