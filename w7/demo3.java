import java.io.FileOutputStream;
public class demo3{
	public static void main(String args[]){
		
		try{
			FileOutputStream fout =new FileOutputStream(
			"C:/Users/91934/Dropbox/My PC (LAPTOP-5U97DDPJ)/Desktop/java/w7/textout.txt");
			String s="Welocme to nptel";
			byte b[]=s.getBytes()    ;
			fout.write(b);
			fout.close();
			System.out.println("File writing is over");
		}
		catch(Exception e){ 
			System.out.println(e);
		} 
	}
}