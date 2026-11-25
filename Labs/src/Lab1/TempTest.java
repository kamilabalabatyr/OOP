package Lab1;

public class TempTest {
	public static void main(String[] args) {

        Temp t1 = new Temp();              // 0C
        Temp t2 = new Temp(100);           // 100C
        Temp t3 = new Temp('F');           // 0F
        Temp t4 = new Temp(32, 'F');        // 32F

        System.out.println("t1: " + t1.getC() + "C, " + t1.getF() + "F");
        System.out.println("t2: " + t2.getC() + "C, " + t2.getF() + "F");
        System.out.println("t3: " + t3.getC() + "C, " + t3.getF() + "F");
        System.out.println("t4: " + t4.getC() + "C, " + t4.getF() + "F");

        t4.setBoth(0, 'C');
        System.out.println("t4 after setBoth: " + t4.getC() + "C, scale=" + t4.getScale());
    }
}
