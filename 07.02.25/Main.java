class Main {
    private String car_name;
    private String car_model;
    private int car_type;

    Main(String car_name, String car_model, int car_type) {
        this.car_name = car_name;
        this.car_model = car_model;
        this.car_type = car_type;
    }

    String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    String getCar_model() {
        return car_model;
    }

    int getCar_type() {
        return car_type;
    }

    public void setCar_type(int car_type) {
        this.car_type = car_type;
    }

    public void startEngine() {
        System.out.println("the Engine of " + car_name + " " + car_model + " " + car_type + " " + "has started");
    }

    public static void main(String args[]) {
        Main car = new Main("Mercedes", "Benz", 2022);
        System.out.println("Car name:" + car.getCar_name());
        System.out.println("car type" + car.getCar_type());
        System.out.println("car model" + car.getCar_model());
        car.startEngine();
    }
}