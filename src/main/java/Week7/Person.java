package Week7;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList;

    /**
     * Constructor for Person.
     *
     * @param name name of the person.
     * @param address address of the person.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        this.vehicleList = new ArrayList<Vehicle>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicleList.add(vehicle);
    }

    /**
     * Remove a vehicle from the list of vehicles.
     *
     * @param registrationNumber registration number of the vehicle.
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle vehicle : this.vehicleList) {
            if (vehicle.getRegistrationNumber().equals(registrationNumber)) {
                this.vehicleList.remove(vehicle);
                break;
            }
        }
    }

    /**
     * Get info of the person.
     *
     * @return info of the person.
     */
    public String getVehiclesInfo() {
        if (this.vehicleList.size() == 0) {
            return this.name + " has no vehicle!";
        } else {
            String result = this.name + " has:\n\n";
            for (Vehicle vehicle : this.vehicleList) {
                result += vehicle.getInfo() + "\n";
            }
            return result;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
