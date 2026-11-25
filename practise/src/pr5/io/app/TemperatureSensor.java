package pr5.io.app;

import java.io.*;

public class TemperatureSensor {
    private static final String BINARY_FILE = "sensor.bin";
    private static final int COUNT = 60;
    
    public static void main(String[] args) {
        generateTemperatures();
        
        patchTemperature(29, 999.9);
        
        analyzeTemperatures();
    }
    
    private static void generateTemperatures() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(BINARY_FILE))) {
            for (int i = 0; i < COUNT; i++) {
                double temperature = 15.0 + (Math.random() * 20.0);
                dos.writeDouble(temperature);
            }
            System.out.println("Generated " + COUNT + " temperature readings.");
        } catch (IOException e) {
            System.err.println("Error writing temperature data: " + e.getMessage());
        }
    }
    
    private static void patchTemperature(int index, double newValue) {
        try (RandomAccessFile raf = new RandomAccessFile(BINARY_FILE, "rw")) {
            long position = index * 8L;
            raf.seek(position);
            raf.writeDouble(newValue);
            System.out.printf("Patched reading %d with value: %.1f%n", index + 1, newValue);
        } catch (IOException e) {
            System.err.println("Error patching temperature: " + e.getMessage());
        }
    }
    
    private static void analyzeTemperatures() {
        double sum = 0;
        double max = Double.MIN_VALUE;
        int count = 0;
        
//        try (DataInputStream dis = new DataInputStream(new FileInputStream(BINARY_FILE))) {
//            System.out.println("\nTemperature Readings Analysis:");           
//            for (int i = 0; i < COUNT; i++) {
//                double temp = dis.readDouble();
//                sum += temp;
//                max = Math.max(max, temp);
//                count++;
//                
//                if (i == 29) {
//                    System.out.printf("Reading %2d: %.1f °C (CHANGED!)%n", i + 1, temp);
//                } else {
//                    System.out.printf("Reading %2d: %.1f °C%n", i + 1, temp);
//                }
//            }
            
            double average = sum / count;
            System.out.println("\n Results");
            System.out.printf("Average Temperature: %.2f °C%n", average);
            System.out.printf("Maximum Temperature: %.1f °C%n", max);
            
//        } catch (IOException e) {
//            System.err.println("Error reading temperature data: " + e.getMessage());
        //}
    }
}