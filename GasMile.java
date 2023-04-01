import java.util.Scanner;

class Calculator{
    public float Subtraction(float a, float b){
        float s = a - b;
        return s;
    }
    public float Division(float a, float b){
        float d = a / b;
        return d;
    }
}

public class GasMile extends Calculator{

    public float kpg(float odometerActual, float odometerPrevious, float GasAdded) {
        float actualKilometers = Subtraction(odometerActual, odometerPrevious);
        float kpg =  Division(actualKilometers,GasAdded)   ;
        return kpg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("----Welcome to Gas milage Calculator-----\n");

        System.out.print("Current Odometer reading: ");
        float odometerActual = sc.nextFloat();

        System.out.print("Previous Odometer Reading:");
        float odometerPrevious = sc.nextFloat();

        System.out.print("Gas added to the tank");
        float GasAdded = sc.nextFloat();

        GasMile newobj = new GasMile();
        float kpg = newobj.kpg(odometerActual, odometerPrevious, GasAdded);

        System.out.printf("La eficiencia de combustible del automóvil es:"+ kpg+" kpg");
    }
}
