/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xCryptography;

/**
 *
 * @author User
 */
public class xxxxCryptographyDycrypt {
    
    public static void main( String args[] ) {
        
        int number;
        int counter = 1;
        int digit;
        int remainder;
        int newNumber = 0;
        int newValue;
        int counter1 = 1;
        int result = 0;
        int place = 100;
        
        while ( newNumber > 9 ) {
            result = result + ( place * ( newNumber % 10 ));
            newNumber = newNumber / 10;
            
            result = result + ( place * 10 * ( newNumber % 10));
            newNumber = newNumber / 10;
            place = place / 100;
            
        }
        
        while ( counter <= 4 ) {       
        
        System.out.printf("Number: %d\n", result);     
    }
    }
}

