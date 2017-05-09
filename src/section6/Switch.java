package section6;

/**
 * Created by manishgiri on 5/8/17.
 */
public class Switch {
    private static void switchTest(char letter) {
        switch (letter) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case 'E':
                System.out.println("E");
                break;
            default:
                System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        switchTest('A');
    }
}
