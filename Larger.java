import java.util.Scanner;

public class Larger {
    /*public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = userInput.nextInt();
        System.out.print("Enter the second number: ");
        int b = userInput.nextInt();
        if (a > b) {
            System.out.println(a + " is gerater than " + b);
        } else {
            System.out.println(b + " is gerater than " + a);
        }
    }
    
}*/

public static void main(String[] args) {
    Scanner userInput=new Scanner(System.in);
    System.out.print("enter a charecter : ");
    char a=userInput.next().charAt(0);
    if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='E' || a=='I' || a=='O' || a=='U'){
     System.out.println(a+ " is a vowel");
    }else if(Character.isDigit(a)){
         System.out.println(a+ " is a number");
    }else if (Character.isLetter(a)) {
         System.out.println(a+ " is an alphabet");
    }else{
         System.out.println(a+ " is a special charecter");
    }
    }
}