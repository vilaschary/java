interface I1{
double x=4.444;
void MethodI1();
}

interface I2 extends I1 {
	double y =5.55;
	void MethodI2();
}
class A1 implements I2{
	public int a1=555;
	public void MethodI1(){
		System.out.println("from I1 "+ x+y);
	}
	public void MethodI2(){
		System.out.println("from I2 "+ x+y);
	}
	
	 
}
class demo4{
	public static void main(String [] args){
		A1 a=new A1();
		a.MethodI1();
		a.MethodI2();
	} 
}