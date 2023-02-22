/******************************************************
 * Java Course 1, Module 2
 * 
 * Displaying the isosceles triangle made of asterisks
 *  
 * @author Jellie Mae Ortiz
 * Date Created: May 12, 2022
 *****************************************************/

import java.util.Scanner;

public class IsoscelesTriangle{
    
    public static void main(String[] args) {
        
        int sideSize; // the size of each 3 sides

        Scanner scan = new Scanner(System.in);

        System.out.printf("\nEnter the size of the equal sides in an isosceles triangle: ");
        sideSize = scan.nextInt();

        for(int row = 0; row <= sideSize; row++){

            for(int column = 0; column < row; column++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
        scan.close();
    } //end of main
} // end of program
