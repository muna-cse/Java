
package arithmetic;

import java.util.Scanner;


public class triangle_area {
     public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        double base,height,area;
        
        System.out.print("enter the base:");
        base=input.nextDouble();
        
        System.out.print("enter the height:");
        height=input.nextDouble();
        
        area=0.5*base*height;//formula of triangle
        System.out.print("area="+area);

        
    }
    
}
