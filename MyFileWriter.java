import java.io.*;

public class MyFileWriter
{
    public static void main(String[] args) throws Exception
    {    
        try (FileWriter fw = new FileWriter("C:/Users/Ayush baigra/myjava/Trust.txt"))
        {
            String str = "LEARN just Programming";
            fw.write(str.getBytes());
        }
    }
}