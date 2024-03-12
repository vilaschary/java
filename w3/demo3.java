public class demo3{
int n;
int fibonacci(int n) {
	if(n == 0)
		return 0;
	else if(n==1)
		return 1;
	else 
		return(fibonacci (n-1) + fibonacci(n-2));
}

public static void main(String [] args){
	demo3 x = new demo3();
	x.n=Integer.parseInt(args[0]);
	for(int i =0; i<=x.n; i++){
	System.out.println(x.fibonacci(i));
}
}
	
}