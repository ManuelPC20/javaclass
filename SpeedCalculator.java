import java.util.Scanner;

public class SpeedCalculator {
    private float distance;
    private float speed;

    public SpeedCalculator(float distance, float speed) {
        this.distance = distance;
        this.speed = speed;
    }

    public float calculateTime() {
        return distance / speed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to the Travel Time Calculator!\n");

        System.out.print("Enter the distance to be traveled in Kilometers: ");
        float distance = sc.nextFloat();

        System.out.print("Enter the speed of travel in miles per hour: ");
        float speed = sc.nextFloat();

        SpeedCalculator travelTime = new SpeedCalculator(distance, speed);

        float time = travelTime.calculateTime();

        System.out.printf("It will take "+time+" hours to travel "+distance+" Kilometers at "+speed+" Kilometers per hour.");
    }
}