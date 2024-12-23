import java.util.Scanner;
  class loop {
    public static void main(String [] args) 
    {
        Scanner loop =new Scanner(System.in);
        int num= loop.nextInt();
        System.out.println("Enter a Year ="+num);
        if((num%4==0)&&(num%100!=0)||(num%400 ==0))
        {
            System.out.println("leap year");
        }
        else  {
            System.out.println(" not aleap year");
        }
         
        }
    }