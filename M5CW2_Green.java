//Javon Green
//M5CW1
//A program that finds the sum & average of a list of itmes, using a do...while function

import java.util.Scanner;

public class M5CW2_Green {
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println();

    //Start\\
    
        //Declare

    //Java Data Types with Examples - Arrays
    //good pratice to use a const integer for list length    
    final int size = 5;
    double[] items = new double[size];
    int counter = 0;

        //Input
    do{
        System.out.print("Enter price for item #"+(counter+1)+": ");
        items[counter] = input.nextDouble();
        //If the item cost is valid, move on to the next item of the list
        if (items[counter] > 0 && items[counter]<=10000){
            counter += 1;
        }
        //If not, prompt the user to try again, staying on the same item
        else{
            System.out.println("Invalid price. Please enter a value between 0 and 10,000.");
        }
    //Repeats until counter exceeds the list length
    }while(counter<size);

        //Calculate

    double total = 0, average = 0;

    //for each item in the list, add it to the total
    for(int i=0; i<size; i++){
        total += items[i];
    }
    //find the average
    average = total/size;

        //Output
    
    System.out.println("");
    System.out.println("All prices entered successfully!");
    System.out.println("Your total is: $"+total);
    System.out.println("The average of the items is: $"+average);

    input.close();

    //End\\
}}

//Think I finally got the hang of this JAVA programming thing