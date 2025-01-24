class  multiT{

    public static void main (String [] args)
    {
        int a=6; //number
        int b=5; // starting
        int c= 10;
        for (int i =b; i<=c; i++)
{
    int sum =  i *a;
    System.out.println(i+" * "+a +" = "+sum);
}
        

    }
}


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
    
            if(count==2)

            {
                System.out.print( i +",");
                

            }
            
            }
            }
        }
        
 

        class fibonacci{
            public static void main(String[] args) {
                
                System.out.println("Enter number a terms");
                int a =10;
                int b=20;
                
                System.out.println(a);
                int c=a+1;
                System.out.println(c);
                for(int i=a;i<=b;i++)
                {
                   
                    int d=a+c;
                    
                    a=c;
                    c=d;
                
                    
                System.out.println(d);
                }
            }
                    





        }
                
        class fib
        {
            public static void main(String[] args) {
                int n=5;
                int a= 0;
                int b=1;
                System.out.println(a);
                System.out.println(b);
                for(int i=a; i<=n;i++)
                {
                    int a1=a+b;
                    a=b;
                    b=a1;
                    System.out.println(a1);
                }
            }
        }        
        
                
            
        




