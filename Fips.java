import java.io.*;
public class Fips
{
    public static void main(String[] args) throws Exception
    {    
        try (FileOutputStream fos= new FileOutputStream("C:/Users/Ayush baigra/myjava/Text.txt"))
        {
            String str ="learn Everything ";
            byte b[]= str.getBytes();
            fos.write(b);
            System.out.println("File written successfully");
        }
    }
}
