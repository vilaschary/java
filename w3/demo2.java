public class demo2{
int n;
int factorial(int n) {
	if(n == 0)
		return(1);
	else
		return(n*factorial(n-1));
}

public static void main(String [] args){
	demo2 x = new demo2();
	x.n=Integer.parseInt(args[0]);
	System.out.println("factorial of "+x.n+": "+x.factorial(x.n));
}
}
	