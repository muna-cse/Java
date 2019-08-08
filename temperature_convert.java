
package arithmetic;

import java.util.Scanner;


public class temperature_convert {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
       //celsious to fahrenthight
       
        double cels,F;
        System.out.print("enter cels:");
        cels=input.nextDouble();
        
       F = 1.8*cels + 32;// [F = 9/5*c + 32]
        System.out.println("F="+F);
         
        
       // fahrenthight to cels
       
       System.out.print("enter F:");
        F=input.nextDouble();
        
        cels= 0.56*F - 0.56*32 ; // [ cels = 5/9(F-32)]
        System.out.println("cels="+cels);



        
    }
    
}
