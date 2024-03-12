import java.awt.*;
public class chk1{
chk1(){
		Frame f=new Frame("chceck box example");
		CheckboxGroup cbg = new CheckboxGroup();
		
		
		Checkbox checkbox1=new Checkbox("C++",cbg,false);
		checkbox1.setBounds(100,100,50,50);
		
		
		Checkbox checkbox2=new  Checkbox("java",true);
		checkbox2 .setBounds(50,100,50,50);
		
		
		f.add(checkbox1);
		f.add(checkbox2);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
}


	public static void main(String args[]){
		new chk1();
	}
}