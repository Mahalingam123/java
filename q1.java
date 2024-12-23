import java.util.*;
class q1
{
    public static void main(String args[])
    {
    Scanner scan =new Scanner(System.in);
    String name = scan.nextLine();
    Double score = scan.nextDouble();

    scan.nextLine();
    String Address = scan.nextLine();
    System.out.println( "My name is ="+ name);
    System.out.println("my score  is ="+ score/10);
    System.out.println("My address is ="+Address);
}
}