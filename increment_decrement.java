
package arithmetic;


public class increment_decrement {
    
    public static void main(String[]args){
        
        int x = 12;
        int y ;
        y = x++ ;//post increment 
        System.out.println("y = "+y);
        y = x;
        System.out.println("y = "+y);
        
        y = ++x ;//pre increment 
        System.out.println("y = "+y);
        
        y = x-- ;//post decrement 
        System.out.println("y = "+y);
        
        y = --x ;//pre increment 
        System.out.println("y = "+y);
        
        y = x++ ;//post increment 
        System.out.println("y = "+y);
        
        y = --x;//pre deccrement 
        System.out.println("y = "+y);
        
        
        

    }
}
