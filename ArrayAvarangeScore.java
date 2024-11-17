import java.util.Scanner;

public class ArrayAvarangeScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int[] score = new int[num];
        // double total = 0;
        // double averange;
         double numberOfPasses = 0;

        // for (int i = 0; i < score.length; i++) {
        //     System.out.print("Enter student score " + (i + 1) + ": ");
        //     score[i] = sc.nextInt();
        // }

        // for (int i = 0; i < score.length; i++){
        //     if (score[i] > 70) {
        //         numberOfPasses += 1;
        //     }
        // }

        // for (int i = 0; i < score.length; i++) {
        //     total += score[i];
        // }

        // averange = total / score.length;
        // System.out.println("The class avarange score is " + averange);
        // System.out.print("Number of students who passed: " + numberOfPasses);


        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        int[] scores = new int[numberOfStudents];


        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter the final score " + i + ": ");
            scores[i] = sc.nextInt();
        }

        int totalPassedScore = 0;
        int totalFailedScore = 0;
        int numPassed = 0;
        int numFailed = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            if (scores[i] >= 70) {
                totalPassedScore += scores[i];
                numPassed++;
            } else {
                totalFailedScore += scores[i];
                numFailed++;
            }
        }

        double averagePassed = (double) totalPassedScore / numPassed;
        double averageFailed = (double) totalFailedScore / numFailed;

        System.out.println("The average score of students who passed is " + averagePassed);
        System.out.println("The average score of students who failed is " + averageFailed);

    }
}