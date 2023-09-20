package Marksheet;

import java.util.Scanner;

public class ELAIN{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        int[][] studentMarks = new int[numStudents][5];
        String[] studentNames = new String[numStudents];
        int[] studentSerialNumbers = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter the student serial number: ");
            studentSerialNumbers[i] = scanner.nextInt();

            System.out.println("Enter the student name: ");
            studentNames[i] = scanner.next();

            for (int j = 0; j < 5; j++) {
                System.out.println("Enter the marks for subject " + (j + 1) + ": ");
                studentMarks[i][j] = scanner.nextInt();
            }
        }

        int[] studentTotals = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            studentTotals[i] = 0;
            for (int j = 0; j < 5; j++) {
                studentTotals[i] += studentMarks[i][j];
            }
        }
        double[] studentAverages = new double[numStudents];
        for (int i = 0; i < numStudents; i++) {
            studentAverages[i] = (double) studentTotals[i] / 5;
        }
       double[] unitAverages = new double[5];
        for (int i = 0; i < 5; i++) {
            unitAverages[i] = 0.0;
            for (int j = 0; j < numStudents; j++) {
                unitAverages[i] += studentMarks[j][i];
            }
            unitAverages[i] /= numStudents;
        }
        System.out.println("Welcome to Student Marklist Application");
        System.out.println("________________________________________________________________________________");
        System.out.println("SNo\tStudent Name\tSub1\tSub2\tSub3\tSub4\tSub5\tTotal\tAverage");
        System.out.println("________________________________________________________________________________");
        for (int i = 0; i < numStudents; i++) {
            System.out.println((i + 1) + "\t"  + studentNames[i] + "    \t" + studentMarks[i][0] + "\t" + studentMarks[i][1] + "\t" + studentMarks[i][2] + "\t" + studentMarks[i][3] + "\t" + studentMarks[i][4] + "\t" + studentTotals[i] + "\t" + studentAverages[i]);
        }
        System.out.println("________________________________________________________________________________");
        System.out.print("Average marks per unit");
        for (int i = 0; i < 5; i++) {
            System.out.print("\t" +String.format("%.2f", unitAverages[i]));
        }
    }

}