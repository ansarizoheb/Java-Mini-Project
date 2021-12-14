// Program no.14 :Java Program on Graphics class 
import java.applet.*;
import java.awt.*;
/* 
<applet CODE="AppletExp10.class" WIDTH=400 HEIGHT=400>
</applet> 
*/
public class AppletExp10 extends Applet
{
    public void paint( Graphics g )
    {
        setBackground(Color.white);
        Color c1=new Color (255,0,0);
        Color c2=new Color (100,100,255);
        g.setColor( c1 );
        g.drawString( "Playing with colors !", 10, 10 );
        g.setColor( c2);
        g.drawLine(10,20,200,20);
        g.setColor( Color.darkGray);
        g.fillRect( 10, 50, 50,50);
        g.setColor( Color.blue );
        g.drawRect( 80, 50, 60,40);
        g.setColor( Color.pink );
        g.fillOval( 80, 100, 50, 25 );
        g.setColor( Color.red );
        g.drawOval( 50, 225, 100, 50 );
        g.setColor( Color.yellow );
        g.drawArc( 10, 110, 80, 80, 90, 180 );
        g.setColor( Color.orange);
        g.fillArc( 140, 40, 120, 120, 90, 45 );
        g.setColor( Color.magenta );
        g.fillArc( 150, 150, 100, 100, 90, 90 );
        g.setColor( Color.black );
        g.fillArc( 160, 160, 80, 80, 90, 90 );
        g.setColor( Color.green );
    }
}