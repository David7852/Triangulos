package triangulos;

import java.awt.Container;
import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Frame extends JFrame
{
    private Conjunto tria;
    private Container c;
    public Frame() throws HeadlessException 
    {
        setSize(610, 550);
        setTitle("Triangulos");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        tria=new Conjunto();
        tria.setBounds(0,0,610,600);
        c=getContentPane();
        c.add(tria);
        setVisible(true);
    }
}
