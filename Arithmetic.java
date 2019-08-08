
package arithmetic;

import java.util.Scanner;

public class Arithmetic {

    
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      
        int x,y,answer ;
       // x=10;
        //y=20;
        System.out.println("enter first number");
        x=input.nextInt();
        
        System.out.println("enter 2nd number");
        y=input.nextInt();
        
        answer=x+y ;
        System.out.println("sum = " + answer);
        
        answer=x-y ;
        System.out.println("sub = " + answer);
        
        answer=x*y ;
        System.out.println("multiplication  = " + answer);
        
        double answer2 =  (double)x/y ;//if we want double number 
        System.out.println("division = " + answer2);
        
        answer=x%y ;
        System.out.println("reminder  = " + answer);
    
    }
    
}
