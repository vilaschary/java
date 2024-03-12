class threadX implements Runnable{
	public void run ( ){
		for(int i=1;i<=5;i++){
			System.out.println("From Thread A with i = "+-1*i);
		}
		System.out.println("Exiting from thrd a");;
	}
}
class threadY implements Runnable{
	public void run ( ){
		for(int j=1;j<=5;j++){
			System.out.println("From Thread B with j = "+2*j);
		}

		System.out.println("Exiting from thrd b");
	}
}

class threadZ implements Runnable{
	public void run ( ){
		for(int k=1;k<=5;k++){
			System.out.println("From Thread c with k = "+(2*k-1));
		}
		System.out.println("Exiting from thrd a");;
	}
}
public class demob{
	public static void main(String [] args){
		threadX x = new threadX();
		Thread t1 = new Thread(x);
		
		threadY y = new threadY();
		Thread t2 = new Thread(y);
		
		Thread t3=new Thread(new threadZ());
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println(">>>multiple threading over");
	}
}