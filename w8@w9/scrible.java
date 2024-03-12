import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class scrible extends Applet implements MouseListener,
MouseMotionListener{
	private int last_x,last_y;
	
	public void inti(){
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	public void mousePressed(MouseEvent e){
		last_x=e.getX();
		last_y=e.getY();
	}
	
public void mouseDragged(MouseEvent e){
	Graphics g =this.getGraphics();
		int x=e.getX(), y=e.getY();
	g.drawLine(last_x,last_y,x,y);
	last_x=x; last_y=y;
	}
	public void mouseClicked(MouseEvent e) {
		showStatus("mouse clicked");
}
	public void mouseMoved(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
	
}

/*
<applet code="scrible.class" height=500 width=400></applet>
*/