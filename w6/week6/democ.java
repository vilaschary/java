class thrdId implements Runnable{
	public void run(){
		try
		{
			System.out.println("Thread " +Thread.currentThread().getId()+" is running");
		}
		catch (Exception e)
		{
			System.out.println("Exception is caught");
		}
	}
}
class democ{
public static void main(String[] args)
{
	int n=0;
	for(int i=0;i<8;i++){
	Thread object = new Thread(new thrdId());
	object.start();
}
}
}