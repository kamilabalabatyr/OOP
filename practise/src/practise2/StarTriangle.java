package practise2;

public class StarTriangle {
	int width;

public StarTriangle(int width) {
	this.width = width;
}
public String toString() {
	StringBuilder sb = new StringBuilder();
	
	for(int i = 1; i<=width; i++) {
		for(int j = 1; j<=i; j++) {
			sb.append("[*]");
		}
		if(i<width)sb.append("\n");
	}
	return sb.toString();
}
public static void main(String[] args) {
    StarTriangle bbb = new StarTriangle(10);
    System.out.println(bbb.toString());
}
}
