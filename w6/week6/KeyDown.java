import java.awt.*;

public class Cards extends java.applet.Applet {
	CardLayout layout;
	public void inti( ){
		layout= new CardLayout();
		setLayout (layout);
		add ("1", new Button("vilas"));
		add ("2", new Button("pranay"));
		add ("3", new Button("manoj"));
		add ("4", new Button("yuvaram"));
		add ("5", new Button("tharun"));
		
	}
	
	public boolean keyDown (Event e,int key){
		layout.next(this);
		return(true);
	}
}

 