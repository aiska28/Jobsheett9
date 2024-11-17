import java.util.Scanner;

public class Assignmentjobsheet904 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of array elements: ");
        int numberOfEllements = sc.nextInt();

        int[] number = new int[numberOfEllements];

        System.out.println("Enter value in each element ");
        for (int i = 0; i < numberOfEllements; i++) {
            System.out.print("Element to-" + i + ": ");
            number[i] = sc.nextInt();
        }

        int highestValue = number[0];
        int lowesValue = number[0];
        int avarageValue = 0;

        for (int i = 0; i < numberOfEllements; i++) {
            if (number[i] > highestValue) {
                highestValue = number[i];
            }
            if (number[i] < lowesValue) {
                lowesValue = number[i];
            }
            avarageValue += number[i];
        }
        double average = (double) avarageValue / numberOfEllements;

        System.out.println("Highes value: " + highestValue);
        System.out.println("Lowes value: " + lowesValue);
        System.out.println("Avarange value: " + average);
    } 
}