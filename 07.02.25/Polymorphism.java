public class Polymorphism {
    public static void main(String[] args) {
      Main[] cars = new Main[3];
        cars[0] = new Main("Toyota", "Corolla", 2022);
        cars[1] = new subclass("Tesla", "Model S", 2023, 600);
        cars[2] = new Main("Honda", "Civic", 2021);
        for (Main car : cars) {
            car.startEngine();
        }
    }
}
