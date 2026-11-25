package Lab2;

public class TestProb1b {
    public static void main(String[] args) {
        Shape3D cylinder = new Cylinder(3, 5);
        Shape3D sphere = new Sphere(4);
        Shape3D cube = new Cube(2);

        System.out.println(cylinder);
        System.out.println(sphere);
        System.out.println(cube);
    }
}
