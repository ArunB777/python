import java.util.*;
public class SCcondition2
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the url"); 
        String url= sc.nextLine();
        String protocol= url.substring(0,url.indexOf(":"));
        if(protocol.equals("http"))
        {
            System.out.println("hyper text transfer protocol");

        }
        else if(protocol.equals("ftp"))
        {
            System.out.println("file transfer protocol");
        }
        else
        {
            System.out.println("unknown protocol");
        }
        String ext= url.substring(url.lastIndexOf("."));
        if(ext.equals(".com"))
        {
            System.out.println("commercial");
        }
        else if(ext.equals(".org"))
        {
            System.out.println("organization");
        }
        else if(ext.equals(".net"))
        {
            System.out.println("network");
        }
        else
        {
            System.out.println("unknown extension");
        }
    }
}