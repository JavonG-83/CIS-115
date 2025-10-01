//Javon Green | CIS-115
//Make a program that displays a percentage of students who do and don't major in CS

import java.util.Scanner;

public class M4CW1_Green {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int majors;
    int nonMajors;
    double total;
    double percentMajors;
    double percentNonmajors;

    //INPUTS
    System.out.print("\nEnter the number of students majoring in CS: ");
    majors = input.nextInt();
    System.out.print("Enter the number of non-computer science students: ");
    nonMajors = input.nextInt();

    // CALCULATE
    total = majors + nonMajors;
    percentMajors = (majors / total) * 100;
    percentNonmajors = (nonMajors / total) * 100;

    // OUTPUT
    System.out.println("Majors: " + percentMajors + "%");
    System.out.println("Nonmajors: " + percentNonmajors + "%\n");

    input.close();
}
}