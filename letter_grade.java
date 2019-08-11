
package arithmetic;

import java.util.Scanner;


public class letter_grade {
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int marks ;
        System .out.println("enter marks :");
          marks = input.nextInt() ;
          if(marks>=80 && marks<=100){
                      System .out.println("A+");

             }
          else if(marks>=70 && marks<=79){
                      System .out.println("A");

             }
          else if(marks>=60 && marks<=69){
                      System .out.println("A-");

             }
          else if(marks>=50 && marks<=59){
                      System .out.println("B");

             }
          else if(marks>=40 && marks<=49){
                      System .out.println("B-");

             

             }
          else {
                                    System .out.println("F");

          }
          
              }
    
}
