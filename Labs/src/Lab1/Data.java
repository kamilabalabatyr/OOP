package Lab1;

public class Data {
	private double sum;
	private double max;
	private int count;
	
	public Data() {
		sum = 0;
		max = 0;
		count = 0;
	}
	
	public void addValue(double value) {
		sum+=value;
		count++;
		if(count == 1) {
			max=value;
		}else {
			if(value>max) {
				max=value;
			}
		}
	}
	
	public double getAvg() {
		if(count==0) return 0;
		return sum/count;
	}
	
	public double getMax() {
		if(count == 0) return 0;
		return max;
	}
}
