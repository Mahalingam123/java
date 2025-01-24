import java.util.*;
// print number  between 1 to 10
 class number {
    public static void main(String[] args) {
        
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

    }
    
}
// printing sum of n natural number
 class sum {
    public static void main(String[] args) {
        int n=10; 
        int sum=0;// initialise 0 for sum
        for(int i=1 ;i<=n;i++)
        {
             sum=sum+i ;
            
    }
    System.out.println(" The sum of first "+n+ " Natural number is "+sum);
}
    
}
// Multiplication taple for 20 times
class multi{
    public static void main(String[] args) {
        int n=20;
        int sum;
        int k=10;
        for( int i=1;i<=n;i++){

            
            sum=k*i;
            System.out.println(i+"*"+ k +"="+sum);
        }
        
    }
}

// reverse a number using for loop

class prime
{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a Number = ");
        int num= scan.nextInt();

    boolean isprime= true;
        for(int i=2;i<=num;i++)
        {
            if(num%i==0)
            {
               isprime=false;
                break;

            }
            if (isprime && num >1){
                System.out.println(" the given number is prime number  "+num);
break;
            }
            else
            System.out.println(" the given number is not prime"+num);
            }
        }
        
        
    
    
    }


class fibonacci{
    public static void main(String[] args) {
        Scanner fib =new Scanner(System.in);
        System.out.println("Enter number a terms");
        int num=fib.nextInt();
        int num1=0;
        int num2=1;
System.out.print(num1+" "+num2);
        
            for(int i=0;i<=num;i++)
            {
                int sum=num1+num2;
             System.out.print(" "+sum);
             num1=num2;
             num2=sum;



            }


        }
    }


    
