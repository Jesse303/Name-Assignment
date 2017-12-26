
/**
*BCS Java_345, Sep 2017
* Jesse_Martino
*Chapter_1
* Program_Assignment_1
 */

import java.util.Scanner;                       //importing the scanner

public class Name {                             //creating the class_Name
    
    public static void main(String[] args){     //running main with no arguments
      
        String s, p;                            //creating 3 variables, 2 are strings and
        int a;                                  //1 is an integer
        
        Scanner in = new Scanner(System.in);               //scanner allows for system to take input
       
        System.out.print("Enter your First Name: ");       //Telling the system to display text
        s = in.nextLine();                                 //Getting the input from the user for s
        
        System.out.print("Enter your Last Name: ");         //Telling the system to display text
        p = in.nextLine();                                  //Getting the input from the user for p
        
        System.out.print("Enter your Student ID number: ");  //Telling the system to display text
        a = in.nextInt();                                    //Getting the input from the user for a
        
        System.out.println("First Name: " +s);              //displaying all the variables that was just
        System.out.println("Last Name: " +p);               //collected.
        System.out.println("Student ID #: " +a);
        
           }
    
}
