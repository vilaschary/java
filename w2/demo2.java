import java.applet.Applet;
import java.awt.Graphics;

public class demo2 extends Applet{
	
	public void paint (Graphics g){
		
	int x=0; 
	int y=0;
	String msg="";
	
	
	
		x = Integer.parseInt(getParameter ("xValue" ));
		y = Integer.parseInt(getParameter ("yValue" ));
		msg= getParameter("msg");
			g.drawString(msg, x, y);

	
		
	}
	
	
	
	}
