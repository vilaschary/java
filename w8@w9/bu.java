import java.awt.*;
public class bu extends Component{
	public static void main (String  args []) {
	Frame f=new Frame("BUTTON EXAMPLE");
	Button b=new Button("GAMING");
	b.setBounds(150,50,50,80);
	f.add(b);
	f.setSize(900,900);
	f.setLayout(null);
	f.setVisible(true);
}
}
	