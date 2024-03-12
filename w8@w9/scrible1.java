import java.applet.*;
import java.awt.*;

public class scrible1 extends Applet{
	private int last_x,last_y;
	private Color current_color=Color.black;
	
	private Button clear_button;
	private Choice color_chocies;
	
	
	public void init(){
		this.setBackground(Color.white);
		
		clear_button = new Button("clear");
		clear_button.setBackground(Color.black);
		clear_button.setBackground(Color.lightGray);
		this.add(clear_button);
		
		color_chocies=new Choice();
		color_chocies.addItem("black");
		color_chocies.addItem("red");
		color_chocies.addItem("yellow");
		color_chocies.addItem("green");
		color_chocies.setForeground(Color.black);
		color_chocies.setBackground(Color.lightGray);
		this.add(new Label("Color: "));
		this.add(color_chocies);
	}
	public boolean mouseDown(Event e,int x,int y)
	{
		last_x=x;last_y=y;
		return true;
	}
		
	 public boolean mouseDrag(Event e, int x,int y) {
		 
			 Graphics g = this.getGraphics();
			 g.setColor(current_color);
			 g.drawLine(last_x,last_y,x,y);
			 last_x=x;
			 last_y=y;
		
			 return true;
		 }
	
	 public boolean action(Event event, Object arg) {
		 
		 if (event.target == clear_button){
			 Graphics g = this.getGraphics();
			 Rectangle r =this.bounds();
			 g.setColor(this.getBackground());
			 g.fillRect(r.x,r.y,r.width,r.height);
			 return true;
		 }
		 
		 else if(event.target == color_chocies) {
			 if(arg.equals("black")) current_color=Color.black;
		 else if(arg.equals("red")) current_color=Color.red;
		  else if(arg.equals("yellow")) current_color=Color.yellow;
		   else if(arg.equals("green")) current_color=Color.green;
		   return true;
		 }
		 
		 else return super.action(event, arg);
	 }
}

/*
<applet code="scrible1.class" height=500 width=400></applet>
*/