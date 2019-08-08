
package arithmetic;

import java.util.Scanner;


public class rectengle {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double length,width,rectengle_area;
        
        System.out.print("enter length:");
        length = input.nextDouble();
        
        System.out.print("enter width:");
        width = input.nextDouble();
        
        rectengle_area = length*width;
        System.out.println("area="+rectengle_area);

        
        
    }
    
}
