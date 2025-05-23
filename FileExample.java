import java.io.*;
public class FileExample
{
    public static void main(String[] args) throws Exception
    {    
        try (FileInputStream fos= new FileInputStream("C:/Users/Ayush baigra/myjava/Text.txt"))
        {
        byte b[]=new byte[fos.available()];
        fos.read(b);
        String str= new String(b);
        System.out.println(str);
        }
   
}
}