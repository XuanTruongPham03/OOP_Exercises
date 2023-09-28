package Week5.Extend2;

public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * Constructor.
     * 
     * @param name    the name of the staff.
     * @param address the address of the staff.
     * @param school  the school of the staff.
     * @param pay     the pay of the staff.
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    /**
     * Set the school of the staff.
     * 
     * @param school the school of the staff.
     */
    public void setSchool(String school) {
        if (school != null && !school.isEmpty()) {
            this.school = school;
        }
    }

    public double getPay() {
        return pay;
    }

    /**
     * Set the pay of the staff.
     * 
     * @param pay the pay of the staff.
     */
    public void setPay(double pay) {
        if (pay >= 0) {
            this.pay = pay;
        }
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString()
                + ",school=" + school
                + ",pay=" + pay + "]";
    }
}
