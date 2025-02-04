import java.util.*;

class Ave {
    int aveCal(int A[]){   //vprogram to calculate average of an array
        int  a=0;
        int ave=0;
        for(int i=0;i<=A.length-1;i+=2){
            a+=A[i]+A[i+1];
        }
        ave=a/A.length;
        return ave;
    }
    
}
class Average{
    public static void main(String[] args ){
        int Arr[]={10,20,30,40};
        Ave cal =new Ave();    // object creation
        System.out.println(cal.aveCal(Arr)); // calling the method from another class
    }
}


// program to adding two matrix 
class Add{
    void   addCal(int[][]A,int B[][]){  // Method for adding two matrices
        int a=0;
        for(int i=0;i<A.length;i++){
        for(int j=0;j<B.length;j++){
         a= A[i][j]+B[i][j];  
         System.out.print(a+" ");
         }
         System.out.println();
         
    } 
  
    
}
}
class addition {   // Method calling in main class
    public static void main(String []args){
        int arr[][]={{1,2},{3,4}};
        int arr2[][]={{5,6},{7,8}};
        Add add=new Add();
         add.addCal(arr, arr2);
    }

    
}

// program to multiply two matrices
class mul{
    void mulCAl(int A[][],int B[][]){
        int a=0;
        if(A[0].length==B.length){
           
            for(int i=0;i<A[0].length;i++){ 
                for(int j=0;j<B.length;j++){
                    for(int k=0;k<A.length;k++){
                        a+=A[i][k]*B[k][j];
                        
                    }System.out.print(a+" ");
                    a=0;
                }System.out.println();
            } 
        }
        else{
            System.out.println("The matrix multiplication can't done");
        }
    }

}
class multi{    //  main methd calling function
    public static void main(String[] args) {
        int a[][]={{1,2},{3,4}};
        int b[][]={{5,6},{7,8}};
        mul Cal=new mul();
        Cal.mulCAl(a ,b);
    }

}

// transpose of a matrix 
class trans{
    void  tran(int A[][],int B[][]){   //  method creation 
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++)
            {
              B[i][j]= A[j][i];      //changing position of a matrix
            } 
        } 
    }
}
//  calling method in prgram
class transCall{
    public static void main(String[] args) {
        int B[][]={{1,2},{3,4}};
        int A[][]=new int[B.length][B[0].length];
        trans Transpose =new trans();
        Transpose.tran(B ,A);
    System.out.println(Arrays.deepToString(A));
    } 


}

// program to calculate maximum value in Array

class Max{

    int max (int A[]){
        int d=0;
        for(int i=0;i<A.length;i++){
            d=0;
            if(A[i]>d){
                d=A[i];
                
            }
        }
        System.out.println("Maximum");
        return d;
    }
}

class Maximum{
    public static void main(String[] args) {
        int A[]={10,20,30,40};
        Max cal =new Max();
        System.out.println(cal.max(A));
    }
    
}

// program to search the given element in the array


class search{
    int searchCal(int A[],int d){
        int r=0;
        for(int i=0;i<A.length;i++){
            if(d==A[i]){
            r=i;
            } 
         } System.out.println("Position");
         return r;
    }
}
 // method calling in main function
 class Ser{
    public static void main(String[] args) {
        int []Arr={1,2,3,4};
        int s=3;
        search Cal =new search();
        System.out.println(Cal.searchCal(Arr, s));
    }
 }

 // program to Reverse a matrix 

 class reverse{
    void revCal(int A[]){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                

            }
            
        }
    }
 }

 // program to merge to arrays
 class merges{
   
    void mer(int A[],int B[],int C[]){
        int a=0;
for(int i=a;i<A.length;i++){
    C[a++]=A[i];
    } 
    for(int j=0;j<B.length;j++){
        C[a++]=B[j];
} 
for(int i=0;i<C.length;i++)
{
    System.out.print( C[i]+ ",");
};}
 }
 // method calling in another function
class mer{
    public static void main(String[] args) {
        int []Arr={1,2,3};
        int []arr2={4,5,6};
        int []arr3= new int[Arr.length+arr2.length];
        merges cal=new merges();
        cal.mer(Arr, arr2, arr3);
    }
}
// program to calculate sum of diagonal
class sumDia{

    
    
    int sumCal(int A[][]){
        int d=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(i==j){
                d+=A[i][j];

                }
            }
        }return d;
    }
}
// method calling 
class SumCal{
    public static void main(String[] args) {
        int arr[][]={{1,2,},{3,4,}};
        sumDia sumcalcu =new sumDia();
        System.out.println(sumcalcu.sumCal(arr));
    }
}

// proogram to  count even and odd in array

class EveOdd{
    void oddEve(int A []){
int count=0;
int ocount=0;
for(int i=0;i<A.length;i++){
    if(A[i]%2==0){
       
        count++;
    } 
    else{
        
        ocount++;
    } 
}System.out.println("No of even ="+count);
System.out.println("No of odd ="+ocount);
    }
}
// Method calling
class OEcount{
    public static void main(String[] args) {
        int A[]={1,2,3,4,5};
        EveOdd eO=new EveOdd();
        eO.oddEve(A);
}
}

// program to calculate sum of row
class SRow{
    void SR(int A[][]){
        int d=0;     // sum of row 1
        int s=0;     // sum of row 2
        for(int i=0;i<A.length;i++){
            d=0;
            for(int j=0;j<A[0].length;j++){
                d+=A[i][j];
                
                }System.out.println(d);
    }
}
}

// method caling 
class SumRow{
    public static void main(String[] args) {
        int A[][]={{1,2},{3,4}};
        SRow sum= new SRow();
        sum.SR(A);

    }
}


// program to calculate  reverse matrices 
class reverseCal{
    void REVCAl(int A[][]){
for(int i=A.length-1;i>=0;i--){
    for(int j=A.length-1;j>=0;j--){
        System.out.print(A[i][j]+" ");
    }
    System.out.println();
} 
    }
}

// Method calling in main function
class ReverseArray{
    public static void main(String[] args) {
        int Arr[][]={{1,2,},{3,4}};
        reverseCal Rev =new reverseCal();
       Rev.REVCAl(Arr);
    }
}




// program to calculate spiral of a matrix
class Spi{
     void SpiCal(int A[][]){
        int rows=0;
        int rowe=A.length-1;
        int cols=0;
        int cole=A[0].length-1;
        while(rows<=rowe&&cols<=cole){
            for(int i=cols;i<cole;i++){
                System.out.print(A[rowe][i]+" ,");  // printing last row
            }
            rowe--;
            if(rows<=rowe){
                for(int i=cole;i>=cols;i--){
                    System.out.print(A[i][cole]+" ,,");   // printing top to bottom
                }
                cole--;
            }
            for(int i=cole;i>=cols;i--){
                System.out.print(A[cols][i]+","+" ");   // printing right to left
            }
            rows++;
           
            if(cols<=cole){
                for(int i=rows;i<=rowe;i++){
                    System.out.print(A[i][cols]+", ");  // printing top to bottom
                }
                cols++;
            }
        }
     }
}

class SpiralMAin{     // main method caling  another class method
    public static void main(String[] args) {
        int A[][]={{1,2,3},{4,5,6}};
        Spi spiral =new Spi();
       spiral.SpiCal(A);
    }
}


// program to rotate a matrix 

class rotate{
    void rotateCal(int A[][]){
        int n=A.length;
        int[][] B=new  int[n][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                B[i][j]=A[n-1-j][i];
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(B[i][j]+" ");
            }
System.out.println();
        }
    }
}

class RotCall{
    public static void main(String[] args) {
        int Arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate RoMatrix= new rotate();
        RoMatrix.rotateCal(Arr);
    }
}