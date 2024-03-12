import java.applet.Applet;
import java.awt.Graphics;
public class demo extends Applet{
	
	public void init() {
		
		
		resize(300,300);
	}
	
    public void paint(Graphics g){
        g.drawString("window has been resized to 300,300",50,50);
    }
}
