package section5;

/**
 * Created by hi on 5/7/2017.
 */
public class MethodOverloading {

    private static double calcFeetAndInchesToCentimeters(int feet, double inches) {
        if(feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        }
        else {
            int feetInInches = feet * 12;
            double totalInches = feetInInches + inches;
            double cm = totalInches * 2.54;
            return cm;
        }
    }

    private static double calcFeetAndInchesToCentimeters(double inches) {
        if(!(inches >= 0)) {
            return -1;
        }
        else {
            int feet = (int) inches / 12;
            double inch = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, inch);
        }
    }

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(1, 4));
        System.out.println(calcFeetAndInchesToCentimeters(38));
        System.out.println(calcFeetAndInchesToCentimeters(-11, 4));
        System.out.println(calcFeetAndInchesToCentimeters(6, 43));

    }
}
