package section8;

/**
 * Created by manishgiri on 5/14/17.
 */
public class MainL46 {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case aCase = new Case("2208", "Dell", "240", dimensions);

        Monitor aMonitor = new Monitor("27 inch beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard aMotherboard = new Motherboard("BN-200", "Asus", "4", 6, 4);

        PC thePC = new PC(aCase, aMonitor, aMotherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherboard().loadProgram("Windows 98");
        thePC.getTheCase().pressPowerButton();
    }

}
