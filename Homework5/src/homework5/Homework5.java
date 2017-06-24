/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

import java.util.Scanner;

/**
 *
 * @author sergey
 */
public class Homework5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
        int firstValue = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Task 1");
        System.out.println("Draw a line with desired number of stars");
        System.out.println("Please enter number of asterisks");
        firstValue = in.nextInt();  
        char charDraw = '*';
        for (int i = 0; i < firstValue; ++i) 
        {
         System.out.print(charDraw);

        }
        System.out.println("\n");
        
        
         
        System.out.println("Task 2");
        System.out.println("Display only even numbers from range");
        
        for (int i = 0; i <= 20; i++) 
        {
            if (i % 2 == 0 && i != 0 )
            {
                System.out.println(i);
            }

        }
        
        System.out.println("Task 3");
        System.out.println("Count a summ of numbers for range");
        System.out.println("Please enter last number in range");
        firstValue = in.nextInt();  
        int sum = 0;
        for (int i = 0; i <= firstValue; i++)
        {
            sum+=i; 
        }
        System.out.println(sum);
    }
    
}
