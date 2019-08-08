
package arithmetic;

import java.util.Scanner;

public class circle_area {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        
        double radious,circlearea;
        
       System.out.print("enter radious:");
       radious=input.nextDouble();
       
       circlearea=3.1416*radious*radious;
       System.out.print("area="+circlearea);
       
    }
    
}
