

public class StringPractice

{
    public static void main(String[] args)
    {
       String str="programmer@gmail.com";
       int i=str.indexOf("@");
       String uname=str.substring(0,i);
       String domain=str.substring(i+1,str.length());
       System.out.println("User name is: "+uname);
       System.out.println("Domain name is: "+domain);
       int j=domain.indexOf(".");
       String name=domain.substring(0,j);
       System.out.println(name.equals("gmail"));

    }
}
