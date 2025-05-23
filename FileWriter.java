import java.io.*;
public class FileWriter
{
    public static void main(String[] args) throws Exception
    {    
        try (FileWriter fos= new FileWriter("C:/Users/Ayush baigra/myjava/Trust.txt"))
        {
        String str ="LEARN just Programming";
        fos.write(str);
        
        }
   
}
}