package Lab2Prob4;
 
public class TestProb4 {
    public static void main(String[] args) {
        Circuit r1 = new Resistor(7.0);
        Circuit r2 = new Resistor(10.0);
        Circuit r3 = new Resistor(6.0);
        Circuit r4 = new Resistor(4.0);

        Circuit c1 = new Parallel(r1, r2);
        Circuit c2 = new Series(r3, r4);
        Circuit circuit = new Parallel(c1, c2);

        circuit.applyPotentialDiff(24.0);

        System.out.println("Whole circuit:");
        System.out.println("Resistance: " + circuit.getResistance());
        System.out.println("Potential difference: " + circuit.getPotentialDiff());
        System.out.println("Current: " + circuit.getCurrent());
        System.out.println("Power: " + circuit.getPower());

        System.out.println();

        System.out.println("r1 -> " + r1);
        System.out.println("r2 -> " + r2);
        System.out.println("r3 -> " + r3);
        System.out.println("r4 -> " + r4);

        System.out.println();
        System.out.println("c1 -> " + c1);
        System.out.println("c2 -> " + c2);
    }
}