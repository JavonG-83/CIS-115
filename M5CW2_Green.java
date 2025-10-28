//Javon Green
//

import java.util.Scanner;

public class M5CW2_Green {
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println();
    //Start\\
    
    // Java Data Types with Examples - Arrays
    // Taught to us, so we should be able to use them

    final int size = 5;
    double[] items = new double[size];
    int counter = 0;
    
    do{
        System.out.println("Enter the price for item #"+(counter+1));
        items[counter] = input.nextDouble();
        if (items[counter] > 0 && items[counter] <10000){
            counter += 1;
        }
        else{
            System.out.println("Invalid price. Please enter a value between 0 and 10,000.");
        }
    }while(counter<size);

    //Calculate
    double total = 0, average = 0;

    for(int i=0; i<size; i++){
        total += items[i];
    }
    average = total/size;

    //Output
    System.out.println("All prices entered successfully!");
    System.out.println("Your total is: "+total);
    System.out.println("The average of the items is: "+average);

    //End\\
    input.close();
}}
