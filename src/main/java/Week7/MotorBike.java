package Week7;

public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * Get info of the motorbike.
     *
     * @return info of the motorbike.
     */
    public String getInfo() {
        return "Motor Bike:\n"
                + "\tBrand: " + this.brand + "\n"
                + "\tModel: " + this.model + "\n"
                + "\tRegistration Number: " + this.registrationNumber + "\n"
                + "\tHas Side Car: " + this.hasSidecar + "\n"
                + "\tBelongs to " + this.owner.getName() + " - " + this.owner.getAddress();
    }

    public boolean isHasSidecar() {
        return this.hasSidecar;
    }

    public boolean getHasSidecar() {
        return this.hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
