public class demo2{
	 public static void main(String args[]){
		 try{
			 int i= args.length;
			 String myString[]=new String[i];
			 if(args[0].equals("JAVA")){
				 System.out.println("first word is JAVA");
			 }
			 System.out.println("Number of aruguments" +i);
			 int x=12/i;
			 int y[]={555,999};
			 y[i]=x;
		 }
		
		 catch(ArrayIndexOutOfBoundsException ess) {
			 System.out.println("Array index OOB : "+ess );
		 }
	 }
}
			 
		 
			 