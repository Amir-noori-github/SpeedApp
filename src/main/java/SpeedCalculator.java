import java.util.Scanner;

public class SpeedCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the distance (in kilometers): ");
        double distance = input.nextDouble();

        System.out.print("Enter the time (in hours): ");
        double time = input.nextDouble();

        double speed = calculateSpeed(distance, time);

        System.out.println("The speed is: " + speed + " km/h");

        input.close();
    }

    public static double calculateSpeed(double distance, double time) {
        return distance / time;
    }
}
