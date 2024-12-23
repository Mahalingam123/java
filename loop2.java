
import java.util.*;
public class loop2 {
    public static void main(String args [])
    {
        Scanner positive = new Scanner(System.in);
        int num=positive.nextInt();
        System.out.println("Enter a number "+ num);
        if (num>0){
            System.out.println("positive number");
        }
        else if(num<0)
        {
            System.out.println("NEGATIVE NUMBER");
        }
        else
        {
            System.out.println("Zero");
        }
    }
    
}
