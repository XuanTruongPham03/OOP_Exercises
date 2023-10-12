package Week7;

public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Constructor for Car.
     *
     * @param brand brand of the car.
     * @param model model of the car.
     * @param registrationNumber registration number of the car.
     * @param owner owner of the car.
     * @param numberOfDoors number of doors of the car.
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * Get Info of the car.
     *
     * @return info of the car.
     */
    public String getInfo() {
        return "Car:\n"
                + "\tBrand: " + this.brand + "\n"
                + "\tModel: " + this.model + "\n"
                + "\tRegistration Number: " + this.registrationNumber + "\n"
                + "\tNumber of Doors: " + this.numberOfDoors + "\n"
                + "\tBelongs to " + this.owner.getName() + " - " + this.owner.getAddress();
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
