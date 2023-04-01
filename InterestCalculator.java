import java.util.Scanner;

class SimpleInterest {
    private float principal;
    private float rate;
    private float time;

    public SimpleInterest(float principal, float rate, float time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public float calculate() {
        float interest = (principal * rate * time) / 100;
        return interest;
    }
}

class CompoundInterest {
    private float principal;
    private float rate;
    private float time;

    public CompoundInterest(float principal, float rate, float time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public float calculate() {
        float amount = (float)(principal * Math.pow((1 + rate / 100), time));
        float interest = amount - principal;
        return interest;
    }
}

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("amount: ");
        float principal = scanner.nextFloat();

        System.out.print("interest rate: ");
        float rate = scanner.nextFloat();

        System.out.print("in years: ");
        float time = scanner.nextFloat();

        System.out.print("Enter 1 to calculate simple interest, or 2 to calculate compound interest: ");
        int choice = scanner.nextInt();

        float interest;

        switch (choice) {
            case 1:
                SimpleInterest simpleInterest = new SimpleInterest(principal, rate, time);
                interest = simpleInterest.calculate();
                System.out.println("Simple interest: " + interest);
                break;
            case 2:
                CompoundInterest compoundInterest = new CompoundInterest(principal, rate, time);
                interest = compoundInterest.calculate();
                System.out.println("Compound interest: " + interest);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
