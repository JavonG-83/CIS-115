import java.util.Scanner;
/**
* M5HW1_starter_file
*/


public class M5HW1_Green
{
public static void main(String[] args)
{
    //VARIABLES\\
Scanner k = new Scanner(System.in);
double answer, average = 0, total = 0;
int count, size;
char grade;
String repeat = "y";

do{
    //REDO\\
total = 0;
System.out.println("");
    //INPUT\\
System.out.println("How many grades would you like to enter?");
size = k.nextInt();
count = 0;
do{
    System.out.print("Enter grade #"+(count+1)+": ");
    answer = k.nextDouble();
    if (answer>=0 && answer<=100){
        total += answer;
        count += 1;
    }
    else{
        System.out.println("Invalid; must be a number between 0 and 100");
    }
}while(count<size);

//PROGRAM\\

average = total/count;

if (average >= 90){ grade = 'A';}
else if (average >= 80){ grade = 'B'; }
else if (average >= 70){ grade = 'C'; }
else if (average >= 60){ grade = 'D'; }
else{ grade = 'F'; }

//OUTPUT\\

System.out.println("Average is "+average);
System.out.println("Grade is " + grade);
k.nextLine();

System.out.println("Would you like to rerun this program? (y/n)");
repeat = k.nextLine();

}while(repeat.equals("y"));

System.out.println("END OF PROGRAM");
k.close();

}}