import java.util.Scanner;

public class yieldtomaturity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to the Yield to Maturity Calculator!\n");

        System.out.print("Enter the ANNUAL coupon payment: ");
        float couponPayment = sc.nextFloat();

        System.out.print("Enter the FACE value of the bond: ");
        float faceValue = sc.nextFloat();

        System.out.print("Enter the PRICE value of the bond: ");
        float presentValue = sc.nextFloat();

        System.out.print("Enter the number of years maturity: ");
        int yearsToMaturity = sc.nextInt();

        Bond bondobj = new Bond(couponPayment, faceValue, presentValue, yearsToMaturity);
        float ytm = bondobj.getYieldToMaturity();

        System.out.println("The yield to maturity of the bond is: "+ ytm );
    }
}
class Bond {
    private float couponPayment;
    private float faceValue;
    private float presentValue;
    private int yearsToMaturity;

    public Bond(float couponPayment, float faceValue, float presentValue, int yearsToMaturity) {
        this.couponPayment = couponPayment;
        this.faceValue = faceValue;
        this.presentValue = presentValue;
        this.yearsToMaturity = yearsToMaturity;
    }

    public float getYieldToMaturity() {
        float ytm = (couponPayment + ((faceValue - presentValue) / yearsToMaturity)) / ((faceValue + presentValue) / 2);
        return ytm;
    }
}