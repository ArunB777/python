import java.io.*;
class Student implements Serializable
{
  private int rollno;
  private String name;
  private float avg;
  private String dept;
  public static int data=10;
  public transient int t;

  
 
  
  public Student(int r, String n, float a, String d)
  {
    rollno=r;
    name=n;
    avg=a;
    dept=d;
    data=500;
    t=500;
  }
 
 
  public String toString()
  {
    return "nStudent Details\n"+
            "\nRoll "+rollno+
            "\nName "+name+
            "\nAvg "+avg+
            "\nDept "+dept+
            "\nData "+data+
            "\ntransient "+t;
  }
}

public class objectDemo
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis = new FileInputStream("C:\\Users\\Ayush baigra\\myjava\\U.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s=(Student)ois.readObject();
        System.out.println(s);
        
        fis.close();
        ois.close();



    }
}