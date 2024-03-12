import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class demo1 extends Applet{
	
	public void init() {
		
		
		setBackground(Color.YELLOW);
	}
	
    public void paint(Graphics g){
        g.drawString("Applet Back ground example",0,50);
    }
}
