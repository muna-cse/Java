
package arithmetic;

import java.util.Scanner;


public class even_odd {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num;
        System .out.println("enter any positive number :");
        num =input .nextInt();
        
        if(num%2==0){
                    System .out.println("even ");

        }
        else{
                    System .out.println("odd ");

        }
        
    }
}
