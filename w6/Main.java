public class Main{
public static void main (String []args) {
        Thread thread=Thread.currentThread ();
        System.out.print (thread.activeCount ());
       thread.run ();
        System.out.print (thread.activeCount ());
       }
}