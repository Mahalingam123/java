

  // rightside triangle      
    
  class increase  {
    public static void main(String  []args )
    {
int row =5;
for(int i=1;i<=row;i++)// determine how many rows
{
    for(int j=1;j<=i;j++)
    {
        System.out.print("*") ;// print the star pattern

    }
    System.out.println();//print space for it
}
}  }    
    
    

//inverse righttriangle
class decrease{
public static void main(String[] args) {
    
 
int row =5;
for(int i=row;i>=1;i--)// determine how many rows
{
    for(int j=1;j<=i;j++)
    {
        System.out.print("*") ;// print the star pattern

    }
    System.out.println();//print space for it

}    }
}        
// pyramid pattern
class pyramid {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            } 
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
} 
 
//pyramid wwith 123 star
class q4 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            } 
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
 
    // lefthalf pyramid
    class left {
        public static void main(String[] args) {
            int n=4;
            for(int i=1;i<=n;i++)
            {
                for(int k=1;k<=n-i;k++)
                {
                    System.out.print(" ");
                } 
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
                
                System.out.println();
            }
        }
    }

// inverted left half pyramid
class inverleft {
    public static void main(String[] args) {
        int n=4;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            } 
            
            
            System.out.println();
        }
    }
}
}
//inverted full pyramid
 class invertedpyramid {
    public static void main(String[] args) {
        int n=4;
        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
        
        for(int j=1;j<=i;j++)
        {
            System.out.print(" *");
        }
        System.out.println();
    }

    
}
} 
 
 // diamond pattern 
  class diamond {
 
    public static void main(String[] args) {
        
    int n=4;
 
 for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            } 
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
        
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }

    }
}

class rombos
{
    public static void main(String[] args) {
        
        int n=4;
        for(int i=1; i<=n;i++)
        {

            
            for(int k=1; k<=2*i-i;k++)
            {
                System.out.print("  ");
            }
            for (int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
        
            
            System.out.println();
        } 
    }
}
//hourglass pattern
class hour {
 
    public static void main(String[] args) {
        
    int n=4;
 
 
        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            }
        
        for(int j=1;j<=i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
 for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i;k++)
            {
                System.out.print(" ");
            } 
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
        }       
        

    }
} 
// hollow Square
  class hollowsquare {
    public static void main(String[] args) {
        int n=4;
        for(int i=1; i<=n;i++)
        {
           for(int j=1;j<=n;j++)
           {
            
           
            if(i==1||i==n||j==1|| j==n)
            {
               System.out.print("  *");

            }
            else
            {
                System.out.print("   ");
            }
            
        }
        System.out.println();

       
    }}

     
}

// hollow pyramid


