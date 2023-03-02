import java.util.Random;

public class Racing {
    public static void equals(int power0, int power1, String model0, String model1) {
        if (power0 > power1) {
            int different = power0 - power1;
            System.out.println(model0 + " мощнее " + model1 + " на" + different + " л.с.");
        } else {
            int different = power1 - power0;
            System.out.println(model1 + " мощнее " + model0 + " на " + different + " л.с.");
        }
    }

    public static void racing(int power0, int power1, String model0, String model1, int distance) {     //Дистанция в метрах
        double time0 = 0;
        double time1 = 0;
        int basicDistance = distance;
        Random random0 = new Random();
        Random random1 = new Random();
        int speed0;
        int speed1;
        while (distance >= 100) {
            speed0 = power0 / 2 + random0.nextInt(30, 80);
            speed1 = power1 / 2 + random1.nextInt(30, 80);
            time0 += (double) 100 / speed0;
            time1 += (double) 100 / speed1;
            distance -= 100;
        }
        if (distance > 0) {
            speed0 = power0 / 2 + random0.nextInt(30, 60);
            speed1 = power1 / 2 + random1.nextInt(30, 60);
            time0 += (double) distance / speed0;
            time1 += (double) distance / speed1;
        }
        System.out.println(model0 + " проехала " + basicDistance + " за " + time0);
        System.out.println(model1 + " проехала " + basicDistance + " за " + time1);
        if (time0 < time1) {
            System.out.println(model0 + " побеждает!!!");
        } else System.out.println(model1 + " побеждает!!!");
    }
}
