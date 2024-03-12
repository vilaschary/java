import myInterface.*;

class  demo implements anInterface {
	public void display()
	{    
		System.out.println("Fine!");
	}
	public static void main(String [] args){
		demo t =new demo();
		t.display();
		System.out.println("The final valuse a in myINterface" + a);
	}
}  