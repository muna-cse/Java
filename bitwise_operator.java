package arithmetic;


public class bitwise_operator {
    
     public static void main (String[]args){
        int a=32,b=11 , c;
        
        c=a&b; // bitwise AND
        System.out.println("c = "+c);
        
         c=a|b; // bitwise OR
        System.out.println("c = "+c);
        
         c=a^b; // bitwise X-OR
        System.out.println("c = "+c);
        
         c=a<<3; // bitwise LEFT SHIFT
        System.out.println("c = "+c);
        
         c=a>>3; //// bitwise RIGHT SHIFT
        System.out.println("c = "+c);
        
     }
     
}
