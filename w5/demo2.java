interface I1{
	public static final double PI =3.1413434567;
	static final double lamda=0.04;
	//int x
	//int x=100;
	//private static final int p =444;
	//abstract public static void methodI1();
	
	void methodI2();
}

class A1 implements I1 {
	public int al=555;
	public void methodI1(){
		System.out.println("From I1 "+PI);
	} 
	public void methodI2(){
		System.out.println("From I1 "+lamda);
	}
}
	public class demo2{
		public static void main(String [] args){
			A1 a = new A1();
			a.methodI1();
			a.methodI2();
		}
	}
			