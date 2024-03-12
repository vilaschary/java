import java.io.FileInputStream;
public class demo4{
	public static void main(String args[]){
		
		try{
			FileInputStream fin =new FileInputStream(
			"C:/Users/91934/Dropbox/My PC (LAPTOP-5U97DDPJ)/Desktop/java/w7/textout.txt");
			int i=0;
			while((i=fin.read())!=-1){ //int i=finread();
			System.out.println((char)i);
		}
		fin.close();
		}
		catch(Exception e){
			System.out.println(e);
			}
	} 
} 