import java.io.FileOutputStream;
public class demo1{
	public static void main(String args[]){
		
		try{
			FileOutputStream fout =new FileOutputStream("D:/ans/text.txt ");
			fout.write(65);
			fout.write(90);
			fout.close();
			System.out.println("File writing is over");
		}
		catch(Exception e){ 
			System.out.println(e);
		}
	}
}