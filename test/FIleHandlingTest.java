import java.io.*;
import java.util.Scanner;
  class Filestest {
    public static void main(String[] args) {
        File file= new File("C:\\Users\\V.Madhan\\Desktop\\FileTest.txt");
        try{
        
             file.createNewFile();                // creating new file 
         
                               
             BufferedWriter bf =new BufferedWriter(new FileWriter(file));
    Scanner scan =new Scanner(System.in);
    System.out.println("Enter a user input to write in a file ");   // user input to a file 
    String a= scan.nextLine();  
     String b="Hello coding"      ;                 // writing a file with buffered writer
   bf.write(a);
   bf.newLine();
   bf.write(b);
   bf.flush();
   bf.close();
   BufferedReader br=new BufferedReader(new FileReader(file));   // reading file with buffered reader 
   String line =br.readLine();
   
   while(line !=null){
    System.out.println(line);
    line=br.readLine();
             
    }
   
   br.close();
        }
       
        catch(Exception e){
            System.out.println("Exception handled "   );
            e.printStackTrace();
        }
        boolean c=    file.exists(); 
        if(c==true){
            System.out.println("File already exists");  // // checkin file is there or not
         }  
         else{
            System.out.println("Not there");
         }
}
  }






  // deleting a file
class hand {
    public static void main(String[] args) {
        File v=new File("C:\\Users\\V.Madhan\\Desktop\\Delete.txt");
       try{
        v.createNewFile();               // creating a file 
       
       }
       catch(IOException e){
        System.out.println("Exception handled");
       }
       boolean a=v.exists();
        if(a==true){
            System.out.println("File already exists");
            v.delete(); // deleting a file
        }
        else {
                System.out.println("File not there or deleted");
             }
           

    }
}
  





class copy{
public static void main(String[] args) {
    try{
        PrintWriter pw =new PrintWriter("C:\\Users\\V.Madhan\\Desktop\\A.txt");
        BufferedReader bf =new BufferedReader(new FileReader("C:\\Users\\V.Madhan\\Desktop\\testfile.txt"));
       String l=bf.readLine();
       while(l!=null){
        pw.println(l);
        pw.flush();
        l=bf.readLine();
       }

    }
    catch(Exception e){
        System.out.println("Exception handled");
    }
    System.out.println("Success fully copied");
}
}





// Searching a  word in a file



class Ser{
    public static void main(String[] args) {
       
        try {
            File f=new File("C:\\Users\\V.Madhan\\Desktop\\h.txt");
            f.createNewFile();
          /*   PrintWriter pw =new PrintWriter(f);
            pw.println("Hello how are you");
            pw.println("Java is oop language");
            pw.println("I am  Developer");
            pw.flush();*/
            BufferedReader br=new BufferedReader(new FileReader(f));
   String l=br.readLine();
   int c=0;
   int linecount =0;
   int noOFword=0;
   String target="TODO";
            while(l!=null){
                c++;
                linecount++;   // counting number of line
                String[]A=l.split(" ");
                noOFword+=A.length;             // number of words in a line 
                for(int i=0;i<A.length;i++){
                    if(A[i].equalsIgnoreCase(target)){
                        System.out.println("Found at  " + c +" Line ");
                    }
                }
                l=br.readLine();

            }
            System.out.println(" Number  of line in this file  =" + linecount );
            System.out.println("number of words in a Words  =  " + noOFword);
        } catch (Exception e) {
            // TODO: handle exception
        }
       
    }
}



//user input  to a file
class input{
    public static void main(String[] args) {
        
        try {
            PrintWriter pw =new  PrintWriter("C:\\Users\\V.Madhan\\Desktop\\input.txt");
Scanner scan =new Scanner(System.in);
System.out.println("Type Exit to stop the operation ");
System.out.println("Enter  user input to write a file");
String a="Exit";
String in =scan.nextLine();
while(a.equalsIgnoreCase(in)==false){
       
       pw.println(in);
       pw.flush();
       System.out.println("Enter  user input to write  next line ");
       in=scan.nextLine();
}


        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}


class listFile{
    public static void main(String[] args){
        try{
        File f=new File("C:\\Users\\\\V.Madhan\\\\Desktop");
        File[] file =f.listFiles();
  for(File a:file){
    System.out.println(a);
  }
  System.out.println("Text File only");
   for(File b:file){
    if(b.isFile()){
      String name=  b.getName();
      int last=name.lastIndexOf(".");
      String sub= name.substring(last+1);
      if(sub.equals("txt")){
        System.out.println(b);
      }
    }
   }

    }
    catch(Exception e){
        System.out.println("Exception handled"+e);
    }
}
}