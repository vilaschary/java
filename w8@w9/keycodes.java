import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class keycodes extends Applet implements KeyListener{
	String msg =""; int x=10,y=20;
	public void inti() {
		addKeyListener(this);
		requestFocus();
	}
	public void keyPressed(KeyEvent ke){
	showStatus("key down");
	int key = ke.getKeyCode();
	switch(key){
		case KeyEvent.VK_LEFT: msg += "<vilas>";
		break;
		case KeyEvent.VK_RIGHT: msg += "<Tharun>";
		break;
		case KeyEvent.VK_PAGE_DOWN: msg += "<Manoj>";
		break;
		case KeyEvent.VK_F4: msg += "<pranay>";
		break;
		case KeyEvent.VK_F5: msg += "<yuvaram>";
		break;
	}
	repaint ();
	}
	public void keyReleased(KeyEvent ke) {
		showStatus("Key up");
	}
	public void keyTyped(KeyEvent ke){
		msg+=ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(msg, x, y);
	}
}
		
		/* <applet code ="keycodes.class" width=300 height=100>
</applet> */