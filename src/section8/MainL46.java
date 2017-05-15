package section8;

/**
 * Created by manishgiri on 5/14/17.
 */
public class MainL46 {

    Dimensions dimensions = new Dimensions(20, 20, 5);
    Case aCase = new Case("2208", "Dell", "240", dimensions);

    Monitor monitor = new Monitor("27 inch beast", "Acer", 27, new Resolution(2540, 1440));

    Motherboard motherboard = new Motherboard("BN-200", "Asus", "4", 6, 4);

    PC thePC = new PC(aCase, monitor, motherboard);

    
}
