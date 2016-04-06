package triangulos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.LinkedList;
import java.util.Random;
import javax.swing.JComponent;

public class Conjunto extends JComponent implements MouseListener
{
    private static LinkedList<Triangulo> tria;
    Color lasttouch=Color.BLACK;
    public Conjunto() 
    {
        tria=new LinkedList();
        addMouseListener(this);
        Triangulo t=new Triangulo(305,350,5,true);
        tria.add(t);
        divisionalt(t);
        
        
    }
    public void trydivision(Point p)
    {
        for(Triangulo x:tria)
        {
            if(x.contains(p)&&x.getN()>0.25)
            {
                Color t=x.getColor();
                division(x);
                lasttouch=t;
                repaint();
                break;
            }
        }
    }
    
    public void divisionalt(Triangulo x)
    {
        Triangulo t1=new Triangulo(x.getP().x,x.getP().y,(float)x.getN()/2,false);

        Triangulo t2=new Triangulo((int)(x.getP().x+((x.getN()*100/4)+x.getN()*10)*Math.cos(Math.toRadians(270))),(int)(x.getP().y+((x.getN()*100/4)+x.getN()*10)*Math.sin(Math.toRadians(270))),(float)x.getN()/2,true);

        Triangulo t3=new Triangulo((int)(x.getP().x+((x.getN()*100/4)+x.getN()*10)*Math.cos(Math.toRadians(150))),(int)(x.getP().y+((x.getN()*100/4)+x.getN()*10)*Math.sin(Math.toRadians(150))),(float)x.getN()/2,true);

        Triangulo t4=new Triangulo((int)(x.getP().x+((x.getN()*100/4)+x.getN()*10)*Math.cos(Math.toRadians(30))),(int)(x.getP().y+((x.getN()*100/4)+x.getN()*10)*Math.sin(Math.toRadians(30))),(float)x.getN()/2,true);

        t1.setColor(Color.blue);//A
            t2.setColor(Color.green);//B
            t3.setColor(Color.yellow);//C
            t4.setColor(Color.red);//D
            
        t1.setA(t3);
        t1.setB(t4);
        t1.setC(t2);

        t2.setA(x.getA());
        t2.setB(x.getB());
        t2.setC(t1);

        t3.setA(x.getA());
        t3.setB(t1);
        t3.setC(x.getC());

        t4.setA(t1);
        t4.setB(x.getB());
        t4.setC(x.getC());

        tria.addFirst(t1);
        tria.addFirst(t2);
        tria.addFirst(t3);
        tria.addFirst(t4);
        x.reset();
        tria.remove(x);
        repaint();
    }
    
    
    
    
    public void division(Triangulo x)
    {
        if(x.getW())//si es true, mira hacia arriba
        {
            Triangulo t1=new Triangulo(x.getP().x,x.getP().y,(float)x.getN()/2,false);
            
            Triangulo t2=new Triangulo((int)(x.getP().x+((x.getN()*100/4)+x.getN()*10)*Math.cos(Math.toRadians(270))),(int)(x.getP().y+((x.getN()*100/4)+x.getN()*10)*Math.sin(Math.toRadians(270))),(float)x.getN()/2,true);
            
            Triangulo t3=new Triangulo((int)(x.getP().x+((x.getN()*100/4)+x.getN()*10)*Math.cos(Math.toRadians(150))),(int)(x.getP().y+((x.getN()*100/4)+x.getN()*10)*Math.sin(Math.toRadians(150))),(float)x.getN()/2,true);
            
            Triangulo t4=new Triangulo((int)(x.getP().x+((x.getN()*100/4)+x.getN()*10)*Math.cos(Math.toRadians(30))),(int)(x.getP().y+((x.getN()*100/4)+x.getN()*10)*Math.sin(Math.toRadians(30))),(float)x.getN()/2,true);
            
            t1.setColor(x.getColor());//A
            t2.setColor(x.getColor());//B
            t3.setColor(x.getColor());//C
            t4.setColor(x.getColor());//D
            
            
            t1.setA(t3);
            t1.setB(t4);
            t1.setC(t2);
            
            t2.setA(x.getA());
            t2.setB(x.getB());
            t2.setC(t1);
            
            t3.setA(x.getA());
            t3.setB(t1);
            t3.setC(x.getC());
            
            t4.setA(t1);
            t4.setB(x.getB());
            t4.setC(x.getC());
            
            t1.pint(lasttouch);
            t2.pint(lasttouch);
            t3.pint(lasttouch);
            t4.pint(lasttouch);
            
            
            
            tria.addFirst(t1);
            tria.addFirst(t2);
            tria.addFirst(t3);
            tria.addFirst(t4);
            
            
        }else
            {
                Triangulo t1=new Triangulo(x.getP().x,x.getP().y,(float)x.getN()/2,true);
                Triangulo t2=new Triangulo((int)(x.getP().x+((x.getN()*100/4)+x.getN()*10)*Math.cos(Math.toRadians(330))),(int)(x.getP().y+((x.getN()*100/4)+x.getN()*10)*Math.sin(Math.toRadians(330))),(float)x.getN()/2,false);
                Triangulo t3=new Triangulo((int)(x.getP().x+((x.getN()*100/4)+x.getN()*10)*Math.cos(Math.toRadians(210))),(int)(x.getP().y+((x.getN()*100/4)+x.getN()*10)*Math.sin(Math.toRadians(210))),(float)x.getN()/2,false);
                Triangulo t4=new Triangulo((int)(x.getP().x+((x.getN()*100/4)+x.getN()*10)*Math.cos(Math.toRadians(90))),(int)(x.getP().y+((x.getN()*100/4)+x.getN()*10)*Math.sin(Math.toRadians(90))),(float)x.getN()/2,false);

                t1.setColor(x.getColor());//A
                t2.setColor(x.getColor());//B
                t3.setColor(x.getColor());//C
                t4.setColor(x.getColor());//D
                
                t1.setA(t3);
                t1.setB(t2);
                t1.setC(t4);

                t2.setA(t1);
                t2.setB(x.getB());
                t2.setC(x.getC());

                t3.setA(x.getA());
                t3.setB(t1);
                t3.setC(x.getC());

                t4.setA(x.getA());
                t4.setB(x.getB());
                t4.setC(t1);
                
                t1.pint(lasttouch);
            t2.pint(lasttouch);
            t3.pint(lasttouch);
            t4.pint(lasttouch);
                
                tria.addFirst(t1);
                tria.addFirst(t2);
                tria.addFirst(t3);
                tria.addFirst(t4);
                
            }
        x.reset();
        tria.remove(x);
    }
    

    
    
    
    @Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillRect(0, 0, 610, 600);
        for(Triangulo x:tria)
        {
            //Random r=new Random();
            //float[] hsbvals={0,0,0};
            //hsbvals=Color.RGBtoHSB(r.nextInt(256), r.nextInt(256), r.nextInt(256), hsbvals);
            //g.setColor(Color.getHSBColor(hsbvals[0],hsbvals[1],hsbvals[2]));
            //g.setColor(Color.getHSBColor((float)Math.random(), (float)Math.random(), (float)Math.random()));
            g.setColor(x.getColor());
            g.fillPolygon(x);
            //g.setColor(Color.getHSBColor(hsbvals[0],hsbvals[1],hsbvals[2]+25));
            //g.setColor(Color.black);
            //g.drawPolygon(x);
        }
    }
    @Override
    public void mouseClicked(MouseEvent e){
    }
    @Override
    public void mousePressed(MouseEvent e)
    {
        trydivision(e.getPoint());
    }
    @Override
    public void mouseReleased(MouseEvent e){     
    }
    @Override
    public void mouseEntered(MouseEvent e){
    }
    @Override
    public void mouseExited(MouseEvent e){
    }
}
