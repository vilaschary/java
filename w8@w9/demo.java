import java.awt.*;
import java.applet.*;
public class demo extends Applet{
	String msg;
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.red);
		msg ="inside int( )--";
	}
	public void paint(Graphics g){
		msg +="inside paint  ( ).";
		g.drawString(msg, 10, 30);
	}
}

/*
<applet code="demo.class" width="300" height="300">
</applet>
 */
 
 