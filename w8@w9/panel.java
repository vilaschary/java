import java.awt.*;

public class panel{
	public static void main (String  args []) {
		Frame frame=new Frame("Frame with panel");
		Panel panl=new Panel( );
		frame.resize(200,200);
		frame.setBackground(Color.blue);
		frame.setLayout(null);
		panl.resize(100,100);
		panl.setBackground(Color.yellow);
		frame.add(panl);
		frame.show( );
	}
}
		