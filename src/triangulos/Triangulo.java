package triangulos;

import java.awt.Color;
import java.awt.Point;
import java.awt.Polygon;

public class Triangulo extends Polygon
{
    private Color color=Color.BLACK;
    private Point p;
    private float n;
    private boolean w;//sentido
    private Triangulo A=null;//vecino A
    private Triangulo B=null;//vecino B
    private Triangulo C=null;//vecino C

    public Triangulo(int x, int y, float m, boolean w) 
    {
        this.w=w;
        n=m;
        p=new Point(x,y);
        setvertices(w);
    }
    
    public void pint(Color t)
    {
        Color a,b,c;
        if(A==null)
            a=Color.BLACK;
        else
            a=A.getColor();
        if(B==null)
            b=Color.BLACK;
        else
            b=B.getColor();
        if(C==null)
            c=Color.BLACK;
        else
            c=C.getColor();
        
        
        color=mix(color,a , b,  c,t);
    }
    
    public Color mix(Color base, Color a,Color b, Color c,Color touch)
    {
        double red=0,blue=0,yellow=0;
        
        if(base.equals(Color.red))
            red+=0.5;
        else
            if(base.equals(Color.blue))
                blue+=0.5;
            else
                if(base.equals(Color.yellow)) 
                    yellow+=0.5;
                    else
                        if(base.equals(Color.orange))
                        {
                            red+=0.25;
                            yellow+=0.25;
                        }
                        else
                        if(base.equals(Color.green))
                        {
                            blue+=0.25;
                            yellow+=0.25;
                        }
                        else
                        if(base.equals(Color.magenta))
                        {
                            red+=0.25;
                            blue+=0.25;
                        }
        
        
        if(touch.equals(Color.red))
            red++;
        else
            if(touch.equals(Color.blue))
                blue++;
            else
                if(touch.equals(Color.yellow)) 
                    yellow++;
        else
                        if(touch.equals(Color.orange))
                        {
                            red+=0.5;
                            yellow+=0.5;
                        }
                        else
                        if(touch.equals(Color.green))
                        {
                            blue+=0.5;
                            yellow+=0.5;
                        }
                        else
                        if(touch.equals(Color.magenta))
                        {
                            red+=0.5;
                            blue+=0.5;
                        }
        
            
        
        if(a.equals(Color.red))
            red++;
        else
            if(a.equals(Color.blue))
                blue++;
            else
                if(a.equals(Color.yellow)) 
                    yellow++;
                else
                        if(a.equals(Color.orange))
                        {
                            red+=0.5;
                            yellow+=0.5;
                        }
                        else
                        if(a.equals(Color.green))
                        {
                            blue+=0.5;
                            yellow+=0.5;
                        }
                        else
                        if(a.equals(Color.magenta))
                        {
                            red+=0.5;
                            blue+=0.5;
                        }
        
        
        
        if(c.equals(Color.red))
            red++;
        else
            if(c.equals(Color.blue))
                blue++;
            else
                if(c.equals(Color.yellow)) 
                    yellow++;
                else
                        if(b.equals(Color.orange))
                        {
                            red+=0.5;
                            yellow+=0.5;
                        }
                        else
                        if(b.equals(Color.green))
                        {
                            blue+=0.5;
                            yellow+=0.5;
                        }
                        else
                        if(b.equals(Color.magenta))
                        {
                            red+=0.5;
                            blue+=0.5;
                        }
        
        if(b.equals(Color.red))
            red++;
        else
            if(b.equals(Color.blue))
                blue++;
            else
                if(b.equals(Color.yellow)) 
                    yellow++;
                else
                        if(c.equals(Color.orange))
                        {
                            red+=0.5;
                            yellow+=0.5;
                        }
                        else
                        if(c.equals(Color.green))
                        {
                            blue+=0.5;
                            yellow+=0.5;
                        }
                        else
                        if(c.equals(Color.magenta))
                        {
                            red+=0.5;
                            blue+=0.5;
                        }
        if(red>=3.5)
            return Color.red;
        if(blue>=3.5)
            return Color.blue;
        if(yellow>=3.5)
            return Color.yellow;
        
        if(red==yellow)
            return Color.orange;
        if(blue==red)
            return Color.magenta;
        if(yellow==blue)
            return Color.green;
        
        
        return base;
    }

    public Triangulo getA() {
        return A;
    }

    public Triangulo getB() {
        return B;
    }

    public Triangulo getC() {
        return C;
    }    

    public void setA(Triangulo A) {
        this.A = A;
    }

    public void setB(Triangulo B) {
        this.B = B;
    }
    
    public void setC(Triangulo C) {
        this.C = C;
    }
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    

    
    
    
    
    public boolean getW()
    {
        return w;
    }
    public double getN() 
    {
        return n;
    }
    public Point getP() 
    {
        return p;
    }
    public void setvertices(boolean w) 
    {
        if(w)
        {
            if(n>0)
            {
                addPoint((int)(p.x+((n*100)/2)*Math.cos(Math.toRadians(270))),(int)(p.y+((n*100)/2)*Math.sin(Math.toRadians(270))));
                addPoint((int)(p.x+((n*100)/2)*Math.cos(Math.toRadians(150))),(int)(p.y+((n*100)/2)*Math.sin(Math.toRadians(150))));
                addPoint((int)(p.x+((n*100)/2)*Math.cos(Math.toRadians(30))),(int)(p.y+((n*100)/2)*Math.sin(Math.toRadians(30))));
            }
        }
        else
            {
                if(n>0)
                {
                    addPoint((int)(p.x+((n*100)/2)*Math.cos(Math.toRadians(330))),(int)(p.y+((n*100)/2)*Math.sin(Math.toRadians(330))));
                    addPoint((int)(p.x+((n*100)/2)*Math.cos(Math.toRadians(210))),(int)(p.y+((n*100)/2)*Math.sin(Math.toRadians(210))));
                    addPoint((int)(p.x+((n*100)/2)*Math.cos(Math.toRadians(90))),(int)(p.y+((n*100)/2)*Math.sin(Math.toRadians(90))));
                }
            }
    }
}
