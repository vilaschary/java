import java.awt.*;
import java.applet.*;

public class sb extends Applet implements Runnable{
	String msg ="A simple moving banner"; 
    Thread t=null;
	int state;
	boolean stopflag;
	
	public void init(){
		setBackground(Color.cyan);
		setForeground(Color.green);
		
	}
	
	public void start(){
		t = new Thread(this);
		stopflag=false;
		t.start();
	}
	public void run(){
		char ch;
		
		for( ; ; ){
			try{
				repaint();
				Thread.sleep(500);
				ch = msg.charAt(0);
				msg = msg.substring(1, msg.length());
				msg += ch;
				if(stopflag)
					break;
			}
		
			catch(InterruptedException e){    }
			}
}
	
	
	public void stop(){
		stopflag=true;
		t = null;
	}
	public void paint(Graphics g){
		g.drawString(msg, 50,30);
}}
	
	
	/*
<applet code="sb.class" width="200" height="200">
</applet>
*/
 