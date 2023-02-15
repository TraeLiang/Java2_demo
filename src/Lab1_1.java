import java.util.Scanner;
import java.util.Arrays;
public class Lab1_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of  array :");
        int i = input.nextInt();
        int[] array1 = new int[i];
        int[] array2 = new int[i];
        System.out.print("Enter the 1st integer array of size:");
        for (int j : array1) {
            j = input.nextInt();
        }
        System.out.print("Enter the 2st integer array of size:");
        for (int k : array2) {
            k = input.nextInt();
        }
        if (Arrays.equals(array1, array2)) {

            System.out.print("The two array have the same value");
        } else {
            System.out.print("The two array have the different value");
            System.out.print("The two array have the different value");
            System.out.print("The two array have the different value");
            System.out.print("The two array have the different value");
            System.out.print("The two array have the different value");



        }

    }
}

