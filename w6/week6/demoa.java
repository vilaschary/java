//creating 3 threads and running cocurrently

class threada extends Thread{
	public void run ( ){
		for(int i=1;i<=5;i++){
			System.out.println("From Thread A with i = "+-1*i);
		}
		System.out.println("Exiting from thrd a");;
	}
}
class threadb extends Thread{
	public void run ( ){
		for(int j=1;j<=5;j++){
			System.out.println("From Thread B with j = "+2*j);
		}
		System.out.println("Exiting from thrd b");;
	}
}

class threadc extends Thread{
	public void run ( ){
		for(int k=1;k<=5;k++){
			System.out.println("From Thread c with k = "+(2*k-1));
		}
		System.out.println("Exiting from thrd a");;
	}
}
public class demoa{
	public static void main(String [] args){
		threada A=new threada();
		threadb B=new threadb();
		threadc C=new threadc();
		
		A.start();
		B.start();
		C.start();
		System.out.println("...Multithreading is over");
	}
}