import java.io.*;
public class demo{
	public static void main(String args[]){
		double principalamount=0.0;
		double rateofintrest=0.0;
		int numberofyear=0;
		try{
			DataInputStream in = new DataInputStream(System.in);
			String tempString;
			System.out.println("Enter principle amount: ");
			System.out.flush();
			tempString=in.readLine();
			principalamount=Float.valueOf(tempString);
			System.out.println("Enter rate of intrest: ");
			System.out.flush();
			tempString=in.readLine();
			rateofintrest=Float.valueOf(tempString);
			System.out.println("Enter number of years: ");
			System.out.flush();
			
			tempString=in.readLine();
			numberofyear=Integer.parseInt(tempString);
		}
		catch(Exception e){
			System.out.println("Exception " + e.getMessage());
		}
		
		double intresttotal= principalamount*rateofintrest*numberofyear;
		System.out.println("Total intrest = " + intresttotal);
	}
}