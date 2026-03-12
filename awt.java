import java.awt.*;
import java.awt.event.*;

public class SimpleAWT extends Frame implements ActionListener
{

    Label l;
    TextField t;
    Button b;
    TextArea ta;
    Checkbox cb;
    Choice ch;
    List list;
    Scrollbar sb;

    public SimpleAWT()
    {
        setTitle("Simple AWT Program");
        setSize(400,400);
        setLayout(new FlowLayout());
        setBackground(Color.lightGray);

        l = new Label("Enter Name");
        l.setFont(new Font("Arial", Font.BOLD, 14));

        t = new TextField(15);
        b = new Button("Submit");
        ta = new TextArea(5,30);

        cb = new Checkbox("I like Java");

        ch = new Choice();
        ch.add("BCA");
        ch.add("B.Sc");
        ch.add("B.Tech");

        list = new List(3);
        list.add("C");
        list.add("C++");
        list.add("Java");

        sb = new Scrollbar();

        add(l);
        add(t);
        add(b);
        add(cb);
        add(ch);
        add(list);
        add(ta);
        add(sb);

        b.addActionListener(this);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        ta.setText("Hello " + t.getText());
    }

    public static void main(String args[])
    {
        new SimpleAWT();
    }
}