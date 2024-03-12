import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/* <applet code ="keycodes.class" width=300 height=100>
</applet> */
public class keycodes extends Applet implements KeyListener{
	String msg =""; int x=10,y=20;
	public void inti() {
		addKeyListener(this);
		requestFocus();
	}
	public void KeyPressed(KeyEvent ke){
	showStatus("key down");
	int key = Ke.getKeyCode();
	switch(key){
		case KeyEvent.VF_F1: msg += "<vilas>";
		break;
		case KeyEvent.VF_F2: msg += "<Tharun>";
		break;
		case KeyEvent.VF_F3: msg += "<Manoj>";
		break;
		case KeyEvent.VF_F4: msg += "<pranay>";
		break;
		case KeyEvent.VF_F3: msg += "<yuvaram>";
		break;
	}
	repaint ();
	}
	public void KeyReleased(KeyEvent ke) {
		showStatus("Key up");
	}
	public void KeyTyped(KeyEvent ke){
		msg+=ke.getKeyChar();
		repaint();
	}
	public void paint(Graphics g){
		g.drawString(msg, x, y);
	}
}
		