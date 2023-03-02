public class Main {
    public static void main(String[] args) {
        Car car0 = new Car("Lada 2107", "Малиновая", 1999, 89, 66666);
        Car car1 = new Car("Lada 2109", "Чёрная", 2003, 101, 176456);
//        Car.getInfo("Lada 2107", "Малиновая", 1999, 89, 66666);
//        System.out.println(Car.createCar("Lada 2107", "Малиновая", 1999, 89, 66666));
        car0.getInfo();
        car0.checkRun();
        car0.on();
        car0.checkRun();
        car0.off();
        car0.checkRun();
        car0.road("Москва");
        car0.on();
        car0.road("Москва");
        Racing.equals(car0.power, car1.power, car0.model, car1.model);
        Racing.racing(car0.power, car1.power, car0.model, car1.model, 350);     //дистанция в метрах
    }
}