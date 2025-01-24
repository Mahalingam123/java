import java.util.*;
// program of days of the week problem

 class Days {
    public static void main(String [] args)
    {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int day=scan.nextInt();
        switch(day){
            case 1:
            System.out.println("monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("enter a valid number");
        
        }




    }
}
// program to display grade  description in switch
class grade{
public static void main(String[] args) {
    
    Scanner scan= new  Scanner(System.in);
    System.out.println("Enter a mark");
    int mark= scan.nextInt();
    double grade=mark/10;
    switch(mark/10)
    {

        case 1:
        case 2:
        case 3:
        case 4:
        System.out.println("F");
        break;
        case 5:
        case 6:
        System.out.println("D grade");
        break;
        case 7:
        System.out.println("C grade");
        break;
        case 8:
        System.out.println("B grade");
        break;
        case 9:
        System.out.println("A grade");
        break;
        
        default:
        System.out.println("Enter a valid mark");
        
    }
    

    
    


}
}

class calculator
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter number 1");
        int num1=scan.nextInt();
        System.out.println(" Enter number 2");
        int num2=scan.nextInt();
        System.out.println(" Enter a number between 1 to 4");
        System.out.println(" 1 for Addition");
        System.out.println(" 2 for Subtraction");
        System.out.println(" 3 for Multiplication");
        System.out.println(" 4 for Division");
        int cal =scan.nextInt();

        switch (cal) {

            case 1:
            System.out.println(num1+num2);
            break;
            case 2:
            System.out.println(num1 -num2);
            break;
            case 3:
            System.out.println(num1*num2);
            break;
            case 4:
            System.out.println(num1/num2);
            break;
            default:
            System.out.println("Enter a valid number");

        
        }
    }
}
// program to calculate area 
class area
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value of r for circle");
        double r = scan.nextDouble();
        System.out.println("enter a value of length");
        int l =scan.nextInt();
        System.out.println(" Enter a value of breadth ");
        int b =scan.nextInt();
        System.out.println("Enter a value of height");
        int h=scan.nextInt();
        System.out.println("1. for area of circle");
        System.out.println("2.for area of rectangle");
        System.out.println("3. for area of Triangle ");
        int calc =scan.nextInt();
        switch (calc) {
            case 1:
                System.out.println(2*3.14*r*r);
                break;
        case 2:
        System.out.println(l*b*h);
        break;
        case 3:
        System.out.println(0.5 *b*h);
        break;
            default:
            System.out.println(" Enter a valid number ");
                break;
        }

        }
}
// program to  check given number is even or odd using switch case 
class eveodd
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter a number ");
        int num= scan.nextInt();
        int a=num%2;
        switch (a)
        {
            case 1:
            System.out.println(num+" The  given number  is odd");
            break;
            default:
            System.out.println(num+" The given number is Even");
        }



    
    }
}
// program to create multiplication table using switch and for loop
class multi{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter a number for multiplication table");
        int n= scan.nextInt();
        for(int i=1;i<=10;i++)
        {
            int sum =i*n;
        
        switch (n) {
            
            default:
            System.out.println( i+" X "+n+"="+sum);
                break;
        }
    }

        


    }
}
// program to check 
class  prime {

    public static void main(String[] args) {
        int start =11;
        int end =30;
        for(int i=start; i<=end; i++)
        {
            int count =0;
            
        for(int j=1; j<=i; j++){
            
            
            if(i%j==0)
            {
                count++;
            }
        }
    
            switch(count)
            {

            case 2:

            {
                System.out.print( i +",");
                

            }
            
            }
            }
        }
    }