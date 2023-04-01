import java.util.Scanner;

public class DegreeofFreedom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Degree of Freedom \n");

        System.out.print("Enter the number of females who do not deposit: " );

        int femaleNoDep = sc.nextInt();

        System.out.print("Enter the number of females who do not litter: ");
        int femaleNoL = sc.nextInt();
        System.out.print("Enter the number of males who do not deposit: ");
        int maleNoDep = sc.nextInt();
        System.out.print("Enter the number of males who do not litter: ");
        int maleNoL = sc.nextInt();

        //declaration of the objs Human in this case objmlae // objfemale
        Human Objmale = new Human("Male", maleNoDep, maleNoL);
        Human objfemale = new Human("Female", femaleNoDep, femaleNoL);

        int totalNoDepositLitter = Objmale.getNoDeposit() + Objmale.getNoLitter() + objfemale.getNoDeposit() + objfemale.getNoLitter();


        int femaleNoDepositLitter = (int) Math.round((float) totalNoDepositLitter * 0.25);
        int maleNoDepositLitter = totalNoDepositLitter - femaleNoDepositLitter;

        System.out.println("The number of females who do not deposit and litter: " + femaleNoDepositLitter);

        System.out.println("The number of males who do not deposit and litter: " + maleNoDepositLitter);
    }
}

class Human {
    private String gender;
    private int noDeposit;
    private int noLitter;

    public Human(String gender, int noDeposit, int noLitter) {
        this.gender = gender;
        this.noDeposit = noDeposit;
        this.noLitter = noLitter;
    }
    public String getGender() {
        return gender;
    }
    public int getNoDeposit() {
        return noDeposit;
    }
    public int getNoLitter() {
        return noLitter;
    }
}