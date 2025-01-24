import java.lang.*;
class  fib {
    public static void main(String[] args) {
        int n=5;
        System.out.println("Factorial of given number ="+fibo(n));
    }
    public static int fibo(int a){ // method  for calculating factorial
        int factorial=1;
        for(int i=1;i<=a;i++){
            factorial*=i;

        } return factorial;
    }
}
class primenum{
public static void main(String[] args) {
    int n=4;
    primenum pricheck =new primenum();
    pricheck.primecheck(n);
}
public static void primecheck(int a){
    int count=0;
    if(a<=1){
        System.out.println(a +" is not a prime");
    }
    else{
        for(int i=2;i<a;i++)
        {
            if(a%i==0){
                count++;
                System.out.println(a+" is not a prime");
            }
        }
        if(count==0){
            System.out.println("The given number"+a+ " is prime");
        }
    }
}
}


// program to calculate the fibonacci series
class fibonacci{
    public static void main(String[]args){
        int n=6;
        FiboNac(n);
    }
    public static void FiboNac(int a) {
        int num=0;
        int num1=1;
        int sum=0;
        System.out.print("[");
        System.out.print(num+" "+num1+" ");
        for(int i=1;i<a;i++){
         sum=num+num1;
         num=num1;
         num1=sum;
       System.out.print(sum+" ");
        }
        System.out.println("]");
        
    }
    
}


// program to calculate the sum of digit
class SumDigit{
    public static void main(String[] args) {
    int n=1234;  
   System.out.println( sumDig(n) ) ; 
}
public static int sumDig(int a){
    int sum=0;
    while(a>0) {         
    int digit =a%10;
    sum+=digit;
    a=a/10;
    
}return sum;}


}


// program  to  calculate palindrome
class palindromeMethod{
   
    public static void Palindromecheck(String A) {
        String B="";
        for(int i=A.length()-1;i>=0;i--){
            B+=A.charAt(i);
            }
            if(A.equals(B)){
                System.out.println(A+"The given String is palindrome");
            }  
    }

}
class palindro{ 
    public static void main(String[] args) {
    String str="AMMA";
    palindromeMethod palin=new palindromeMethod();
   palin.Palindromecheck(str);
}
}


// program to calculate gcd of given number
class gcdmeth{   // method decleration
    public static int gcdcal(int a,int b) {
        int gcd=0;
        for(int i=1;i<=a&&i<=b;i++){
            if(a%i==0&&b%i==0){
                gcd=i;
            }

        }
        return gcd;

    }
}
class GCD{ // method calling
    public static void main(String[] args) {
        int n1=24;
        int n2=36;
        gcdmeth gcd=new gcdmeth();
        System.out.println(gcd.gcdcal(n1, n2));
    }
}


// program to calculate lcm

class lcmMethod{
    public static int lcmCheck(int a,int b){
        gcdmeth gcd=new gcdmeth();
        int lcm=a*b/gcd.gcdcal(a,b);
return lcm;
    }
}
class lcmCall{
    public static void main(String[] args) {
        int n1= 12;
        int n2= 15;
        lcmMethod lcm=new lcmMethod();
        System.out.println(lcm.lcmCheck(n1,n2));
    }
}

// program to  calculate armstrong number
//method
class ArmMethod{
    
    public static int arm(int a){
        int lastnum=0;
        int result=0;
        int mul=1;
        int digit=0;
        int temp=a;
        int temp2=a;
        while(temp2>0){ // to calculate the number of digits
            temp2=temp2/10;
            digit++;
             }
        while (temp>0) { // to calculate last digit 
            mul=1;
         lastnum=temp%10;
          
         for(int i=1;i<=digit;i++){ //to caluclate the power of digit value
          mul=mul*lastnum;
       }
        
  temp=temp/10;
  result+=mul;
} return result;

    }
}
// calling function in main method
class arm{
    public static void main(String[] args) {
        int n=153;
        
        ArmMethod armCheck=new ArmMethod();
      int res= armCheck.arm(n);
      
        if(n==res){
            System.out.println("The given number "+n+" is Armstrong number ");
        }
        else{
            System.out.println("Not a Armstrong number");
        }
    }
}

// program to calculate factor coount of given num
class factor{
    public static int fac(int a){
        int count=0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
count++;
            }
        }
        return count;
    }
}
// method calling in main function
class fcount{
    public static void main(String[] args) {
        int n=12;
        factor fact=new factor();
       System.out.println (fact.fac(n));}
    }

    // program to calculate perfect number
    // method
    class perfco{
    public static void perfCal(int a){
        int sum=0;
        for(int i=1;i<=a/2;i++)
        {
            if(a%i==0){
                sum+=i;
                
            }
        } System.out.println(sum);
        if(sum==a){
            System.out.println(a+ "  Perfect number ");
        }
        else{
            System.out.println("Not a perfect");
        }
    }

    }
    // method calling
    class per{
        public static void main(String[] args) {
            int n=28;
            perfco pf=new perfco();
            pf.perfCal(n);
        }
    }

    // program to calculate power function
    class power{
        public static int powe(int a,int b) {
            int power=1;
for(int i=1;i<=b;i++){
   power*=a;
}      
    return power;    }
    }
    // method calling 
    class powercall{ public static void main(String[] args) {
        int base=3;
        int exponent= 4;
        power cal =new power();
        System.out.println(cal.powe(base,exponent)); 
    }
        
     
    }

    // program to calculate reverse of a number
    class rev{
        public static String reverCalc(int a){
            String reverse="";
            while(a>0){
             int remainder =a%10;
           reverse+=remainder;
            a=a/10;   
        }return  reverse;
    }
    }
    //method calling
    class reverser
    {
        public static void main(String[] args) {
            int n=12345;
            rev cal =new rev();
            System.out.println(cal.reverCalc(n));
        }
    }