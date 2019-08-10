
package arithmetic;

import java.util.Scanner;


public class pass_fail {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int marks ;
        System .out.println("enter marks :");
          marks = input.nextInt() ;
          if(marks>=40){
                      System .out.println("pass");

          }
          else{
                      System .out.println("fail");

          }
    }
}
