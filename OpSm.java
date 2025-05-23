 import java.io.*;
public class OpSm
{
    public static void main(String[] args) throws Exception
    {    
        try (FileInputStream fos= new FileInputStream("C:/Users/Ayush baigra/myjava/Text.txt"))
        {
           int x;

            do{
                x=fos.read();
                if (x!=-1)
                    System.out.println((char)x);

            }while(x!=-1);        }
   
}
}