package section9;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by manishgiri on 5/26/17.
 */
public class ArrayChallenge {

    private static int[] bubbleSortArray(int[] array) {
        int[] result = Arrays.copyOf(array, array.length);
        int temp = 0;
        // sort
        for(int i = 0; i < result.length; i++) {
            for (int j = 1; j < result.length - i; j++) {
                if(result[j-1] > result[j]) {
                    temp = result[j-1];
                    result[j-1] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }

    private static int[] getIntegers(int num) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[num];
        System.out.println("Enter " + num + " integers:");
        for(int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static void main(String[] args) {
        int size = 5;

        int[] numbers = getIntegers(size);
        System.out.println("Entered: " + Arrays.toString(numbers));

        int[] sortedArr = bubbleSortArray(numbers);
        System.out.println("Sorted: " + Arrays.toString(sortedArr));
    }
}
