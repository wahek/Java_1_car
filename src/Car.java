public class Car {
    String model;
    int year;
    double price;
    String color;
    int power;
    boolean run;

    public Car(String model, String color, int year, int power, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.run = false;
    }

    public void getInfo() {
        System.out.println(String.format("Модель - %s, цвет - %s, год выпуска %d, объём двигателя - %d л.с., цена - %,.2f", model, color, year, power, price));
    }

    public void checkRun() {
        if (run) {
            System.out.println("Автомобиль заведён");
        } else System.out.println("Автомобиль не заведён");
    }
    public void on(){
        run = true;
    }
    public void off(){
        run = false;
    }
    public void road(String place){
        if (run){
            System.out.println("Автомобиль двигается по адрессу: "+ place);
        } else System.out.println("Автомобиль не заведён, мы не можем ехать");
    }

    public int getPower() {
        return power;
    }
}
