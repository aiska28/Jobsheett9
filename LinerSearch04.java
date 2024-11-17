import java.util.Scanner;

public class LinerSearch04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arrayInt = { 34, 18, 26, 48, 72, 20, 56, 63 };
        // int key = 20;
        // int result = 0;
        // for (int i = 0; i < arrayInt.length; i++) {
        //     if (arrayInt[i] == key) {
        //         result = i;
        //         break;
        //     }
        // }
        // System.out.println("The key in the array is located at index position " + result);
    
    
    //modif 
        System.out.print("Enter the number of array elements: ");
        int n = sc.nextInt();

        int[] array = new int [n];

        for ( int i = 0; i < n; i++) {
            System.out.print("Enter the array element " + i + ": ");
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the key you want to search for: ");
        int key = sc.nextInt();

        int result = -1;
        for (int i = 0; i < n; i++) {
            if (array[i] == key) {
                result = i;
                break;
            }
        }
        if (result != -1) {
            System.out.print("The key in the array is located at index position " + result);
        } else {
            System.out.print("key not found");
        }
    }
}