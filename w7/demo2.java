import java.io.*;
class demo2{
	public static void main(String [] args){
byte cites[]={'D','E','L','H','I',' ','M','A','D','R','A','S',' ','L','O','N','D','O','N','\n'};
FileOutputStream outfile=null; // create an outfile stream
try{
	outfile=new FileOutputStream(
	"C:/Users/91934/Dropbox/My PC (LAPTOP-5U97DDPJ)/Desktop/java/w7/city.txt");
	outfile.write(cites);
	outfile.close();
}
catch(IOException e){
	System.out.println(e);
	System.exit(-1);
}
	}
}