import java.io.*;
public class Q7{
public static void main (String[]args) {
           try{
                 InputStream file =new FileInputStream ("C:/Users/91934/Dropbox/My PC (LAPTOP-5U97DDPJ)/Desktop/java/w8/Text.txt");
                 System.out.print (file.available ());
           }
           catch (Exception e) {
                 System.out.print (e);
}
}
}