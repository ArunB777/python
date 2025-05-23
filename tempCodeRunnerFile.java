import java.awt.*;
class Myframe extends Frame
{
    Label l;
    TextField tf;
    Button b;

    public Myframe()
    {
        super ("My App");

        setLayout(new FlowLayout());

        l=new Label("Name");
        tf=new Textfield(20);
        b=new Button("OK");

        add(l);
        add(tf);
        add(b);
    }
}
public class Fir

{ 
    public static void main(String[] args)
    {
        Myframe f=new Myframe();
        f.setSize(500,500);
        f.Visible(true);
    }
} 