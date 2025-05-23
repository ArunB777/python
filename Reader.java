 import java.io.*;
public class Reader
{
    public static void main(String[] args) throws Exception
    {    
        try (FileReader fos= new FileReader("C:/Users/Ayush baigra/myjava/Text.txt"))
        {
           int x;

            do{
                x=fos.read();
                if (x!=-1)
                    System.out.println((char)x);

            }while(x!=-1);        }
   
}
}