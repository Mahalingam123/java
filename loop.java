import java.util.*;
public class loop {
    public static void main(String [] args) 
    {
       /* Scanner loop =new Scanner(System.in);
        int num= loop.nextInt();
        System.out.println("Enter a number ="+num);
        if(num%2==0)
        {
            System.out.println("Even number");

        }
        else{
            System.out.println("odd number");*/
        
        /*Scanner positive = new Scanner(System.in);
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
        }*/

    
   /*  Scanner positive = new Scanner(System.in);
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
    }*/

   /* canner grade = new Scanner(System.in);
    int num=grade.nextInt();
    System.out.println("Enter a Mark "+ num);
    if (num>= 90)

    {
        System.out.println("Grade is A");
    }
    else if((num>=80)&&(num<=89))
    {
        System.out.println("Grade is B");

    }

    else if((num>=70)&&(num<=79))
    {
        System.out.println( "Grade is C");
    }    
    
    else if ((num>=60)&&(num<=69))
    {
        System.out.println("Grade is D");
    }
  else 
{ System.out.println("sorry");

}*/
/*Scanner scan = new Scanner(System.in);
int number = scan.nextInt();
int number1 =scan.nextInt();
System.out.println("number 1="+number);
System.out.println("number 2="+number1);
if (number> number1)
{
    System.out.println("this is larger than number 2");
}
else
{
System.out.println(" number 2 is larger than number 1");
}*/
/*Scanner vote =new Scanner(System.in);
int a =vote.nextInt();
System.out.println(" Enter your age ="+a);
if (a>=18)
{
    System.out.println("Your Eligible to vote");
}
else 
{
    System.out.println("your not eligible");
}*/
/*Scanner scan =new Scanner(System.in);
System.out.println("enter a number ");
Double a=scan.nextDouble();
System.out.println("Enter number2");
Double b=scan.nextDouble();
System.out.println("Enter a number3");
double c=scan.nextDouble();
System.out.println();

 double discriminant =b *b - 4*a*c;
 if (discriminant >0) {
    double root1= -b+Math.sqrt(discriminant)/(2*a);
    double root2 =-b-Math.sqrt(discriminant)/(2*a);
    System.out.println(" the discriminant is greater than zero it a two roots" +root1 +"and" +root2); 
    
 }
 else if(discriminant==0)
 {
    double root = -b/(2*a);
    System.out.println(" the discriminant is zero it has one real root" + root);
}
 else{
    double realroot =-b/(2*a);
     double imaginaryroot= Math.sqrt(discriminant)/(2*a);
     System.out.println(("else it has realroot"+realroot+"and imaginaary root"+imaginaryroot));
 }*/
 
Scanner scan =new Scanner(System.in);
double num1 =scan.nextDouble();
System.out.println("Enter a number "+ num1);
double num2= scan.nextDouble();
System.out.println("enter a number "+num2);
int a = scan.nextInt();
System.out.println("1.Addition");
System.out.println("2.Subs");
System.out.println("3.multi");
System.out.println("4.division");
if (a==1)
{
    System.out.println( num1+num2);
}
else if(a==2)
{
    System.out.println(num1-num2);
}
else if (a==3)
{
    System.out.println(num1*num2);
}
else 
{
    System.out.println(num1/num2);
}



 }
    
 }
