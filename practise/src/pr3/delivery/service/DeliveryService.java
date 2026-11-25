package pr3.delivery.service;

import pr3.delivery.model.Vehicle;

import java.util.List;

public class DeliveryService {

    public void printAllVehicles(List<Vehicle> vehicles) {
        System.out.println("=== Vehicles List ===");
        for (Vehicle v : vehicles) {
            System.out.println(v.getVehicleInfo());
        }
    }

    public void calculateAllDeliveries(List<Vehicle> vehicles) {
        System.out.println("=== Delivery Costs ===");
        for (Vehicle v : vehicles) {
            System.out.println(v.getVehicleInfo());
            System.out.println("Cost: " + v.calculateDeliveryCost());
            System.out.println("-----");
        }
    }

    public double calculateTotalCost(List<Vehicle> vehicles) {
        double total = 0;
        for (Vehicle v : vehicles) {
            total += v.calculateDeliveryCost();
        }
        return total;
    }
}