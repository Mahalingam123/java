import java.lang.reflect.Array;
import java.util.*;
class max{
    public static void main(String[] args) {
        int d=0;
        int A[]={2,5,3,9};
        for(int i=0;i<A.length;i++){
          
        if(d<A[i]){
            d=A[i];

        }
    }
    System.out.println(d);
}}
class min{
    public static void main(String[] args) {
       
        int A[]={2,5,3,9};
        int d=A[0];
        for(int i=0;i<A.length;i++){
          
        if(d>A[i]){
            d=A[i];

        }
    }
    System.out.println(d);
}}


class Average{
    public static void main(String []args)
    {
        int d=0;
        int[] arr={3,5,7,9};
        for(int i=0;i<arr.length-1;i=i+2)
        {
            d+=arr[i]+arr[i+1];

        }System.out.println(d/arr.length);
            
        }
    }

   class count{
    public static void main(String[] args) {
        int count=0; int backcount=0;
        int[]arr={2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
            {
                count++;
            }
            else{
                backcount++;
            }
        }
        System.out.println("Even ="+count+" Odd="+backcount);
    }
   }  
   class secondlar{
    public static void main(String[] args) {
        {
            int[]num={12,35,1,10,34};
            int n=num.length;
            for(int i=0;i<n;i++)
            {
                for(int j=0; j<n-1;j++)
                {
                    if(num[j]>num[j+1])
                    {
                        int temp=num[j];
        
                        num[j]=num[j+1];
                        num[j+1] =temp;
                    }
                    
                  
            }
                
               
            }
            System.out.print(num[n-2]);  }
               
            
        }
    }
    class sumEven{
        public static void main(String[]args){
            int d=0;
            int A[]={2,4,6,8,10};
            for(int i=0;i<A.length;i=i+2){
                 d+=A[i];
                
                }
                System.out.println(d); }
    }
    //program to merge two arrays
    class merge{
        public static void main(String[] args) {
            int a=0;
            int []old={1,3,5};
            int[]old2={2,4,6};
            int[] new_A= new int[old.length+old2.length];
            for(int i=0;i<old.length;i++){
                new_A[a++]=old[i];
            } 
            for(int i =0;i<old2.length;i++){
                new_A[a++]=old2[i];
            }
        System.out.println(Arrays.toString(new_A));
        }
        
    }

   
class sort{
    public static void main(String[] args) {
        
            int[]num={3,1,4,2};
            int n=num.length;
            for(int i=0;i<n;i++)
            {
                for(int j=0; j<n-1;j++)
                {
                    if(num[j]>num[j+1])
                    {
                        int temp=num[j];
        
                        num[j]=num[j+1];
                        num[j+1] =temp;
                    }
                }} 
                System.out.println(Arrays.toString(num));          

            }}
            
   class freq{
    public static void main(String[] args) {
        int count=1;
       int visited=-1;
       int []arr={2,3,2,5,3};
       int [] visit = new int[arr.length];

       for(int i=0;i<arr.length;i++){
    
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
               visit[j]=visited;
            }
        } 
       
        if(visit[i]!=visited){
            visit[i]=count;
        } count=1;
       }
       for(int i=0;i<arr.length;i++){
        if(visit[i]!=visited)
        {
            System.out.println("Element ="+ arr[i]+" frequency ="+visit[i]);
        }
       }
System.out.println(Arrays.toString(visit));
    }
}
        
    // program to remove dublicate
    class dubli{
        public static void main(String[] args) {
       
       int visited=-1;
       int []arr={2,3,2,5,7,7,7,9,5,3};
       for(int i=0;i<arr.length;i++){
    
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){    
               arr[j]=visited;
            }
        } 
    }
    System.out.print("[");
    for(int i=0;i<arr.length;i++){
        if(arr[i]!=visited){
            System.out.print(arr[i]+" ");
        }
    }
    System.out.print("]");
}}

      
    

// program to determine 3 method in one class 
class method {
    public static void main(String[] args) {
        int[]A={3,1,4,2};
        System.out.println("Sorting");
        sort(A); // sorting method
        System.out.println("Frequency");
        freq(A);// Frequency method
    }
    public static void sort(int[] A){        // method one for srting array
        
            int n=A.length;
            for(int i=0;i<n;i++)
            {
                for(int j=0; j<n-1;j++)
                {
                    if(A[j]>A[j+1])
                    {
                        int temp=A[j];
        
                        A[j]=A[j+1];
                        A[j+1] =temp;
                    }
                }} 
             System.out.println(Arrays.toString(A)) ;   
                   

            }
            public static void freq(int []A) { int count=1;
                for(int i=0;i<A.length;i++)
                {  
                    for(int j=i+1;j<A.length-1;j++){
                        if(A[i]==A[j]){
                            count++;
                            A[j]=-1;
                        } 
                        }count =1;
                    }
                    for(int i=0;i<A.length;i++){
                        if(A[i]!=-1){
                            System.out.println(A[i]+" Frequency "+ count);
                    }
                }

                
            }
        }

    

