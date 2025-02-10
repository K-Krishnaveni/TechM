class subclass extends Main{

    private int batteryRange;
    subclass(String make, String model, int year, int batteryRange) {
        super(make, model, year);
        this.batteryRange = batteryRange;
    }

    public int getBatteryRange() {
        return batteryRange;
    }
    public void setBatteryRange(int batteryRange) {
        this.batteryRange = batteryRange;
    }
    public void chargeBattery() {
        System.out.println("The battery of " + getCar_name() + " " + getCar_model() + " is now charging...");
    }
    @Override
    public void startEngine() {
        System.out.println("The electric motor of " + getCar_name() + " " + getCar_model() + " is now running silently.");
    }

    public static void main(String[] args) {

        subclass myTesla = new subclass("Tesla", "Model S", 2023, 600);

        System.out.println("Make: " + myTesla.getCar_name());
        System.out.println("Model: " + myTesla.getCar_model());
        System.out.println("Year: " + myTesla.getCar_type());
        System.out.println("Battery Range: " + myTesla.getBatteryRange() + " km");

        myTesla.startEngine();
        myTesla.chargeBattery();
    }
}
