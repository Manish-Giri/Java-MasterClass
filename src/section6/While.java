package section6;

/**
 * Created by manishgiri on 5/8/17.
 */
public class While {

    private static boolean isNumberEven(int n) {
        return n % 2 == 0 ? true : false;
    }

    public static void main(String[] args) {
        int start = 5;
        int finish = 25;
        while(start <= finish) {
            if(!isNumberEven(start)) {
                start++;
                continue;
            }
            System.out.println("Even number = " + start);
            start++;
        }
    }
}
