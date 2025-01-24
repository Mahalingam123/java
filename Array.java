// program to perform linear search 

import java.util.Scanner;

class linear {
    public static void main (String [] args)
    {

        int n=5;
        int []num  =new int[5]; // creation of array
        Scanner scan =new  Scanner(System.in);
        System.out.println(" Enter the elements of array");
        for(int i=0;i<n;i++)
        {  
        num[i]=scan.nextInt();
        
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            System.out.println(num[i]);
        }

          // imputing array element
          System.out.println(" Enter a number want to be search");
          int target= scan.nextInt();
          

          for(int j=0;j<n;j++)
          {
            if (num[j]==target) 
            {
                System.out.println(" The given target is found in the array in  "+j+"   index number " );
                break;
            }
            
        
          }
         

        

    }
    
}

// sorting array
class sort{
    public static void main (String [] args)
{
    int[] num ={266,17,67,24};
    System.out.println("Original Array");
    for(int i=0; i<4;i++)
    {
        System.out.print( num[i]+ " " );  // printing original array

    
    }
    System.out.println();
  
    int n= num.length;
    for(int i=0;i<n-1;i++)
    {
        for(int j=0; j<n-i-1;j++)
        {
            if(num[j]>num[j+1])
            {
                int temp=num[j];

                num[j]=num[j+1];
                num[j+1] =temp;
            }
        }
    }
    for(int i=0; i<4;i++)
    {
        System.out.print( num[i]+ " " );  // printing sorted array

    }


}
}

// array inserting new element
class insertion
{
    public static void main(String [] args)
    {
       
        int index =2;
        int element=4;
        int [] old={12,13,14,15};
        int n=old.length;
        for(int i=0; i<n;i++)
        {
            System.out.print(old[i]+"  ");  // printing previous array
        }
        System.out.println();

        int [] newarray =new int[n+1];
        newarray[index]=element;

        for(int i=0; i<index; i++)
        {
            newarray[i]=old[i];   
          }

            for(int i=index+1;i<newarray.length;i++)
{
    newarray[i]=old[i-1];

}
for(int i=0;i<n+1;i++)
{
    System.out.print(newarray[i] +" ");
}

    }
}