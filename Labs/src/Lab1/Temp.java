package Lab1;

public class Temp {
	private double value;
	private char scale;
	
	//Default - 0°C
	public Temp() {
	    value = 0;
	    scale = 'C';
	}
	
	//if no scale - C
	public Temp(double value) {
	    this.value = value;
	    this.scale = 'C';
	}
	
	//if no value - 0
	public Temp(char scale) {
	    this.value = 0;
	    this.scale = scale;
	}
	
	//if value and scale
	public Temp(double value, char scale) {
	    this.value = value;
	    this.scale = scale;
	}
	
	public double getC() {
	    if (scale == 'C') {
	        return value;
	    } else {
	        return 5 * (value - 32) / 9;
	    }
	}
	public double getF() {
	    if (scale == 'F') {
	        return value;
	    } else {
	        return 9 * (value / 5) + 32;
	    }
	}
	
	public void setValue(double value) {
	    this.value = value;
	}
	public void setScale(char scale) {
	    if (scale == 'C' || scale == 'F') {
	        this.scale = scale;
	    } else {
	        System.out.println("Invalid scale. Use 'C' or 'F'.");
	    }
	}
	public void setBoth(double value, char scale) {
	    setValue(value);
	    setScale(scale);
	}
	public char getScale() {
	    return scale;
	}







}

