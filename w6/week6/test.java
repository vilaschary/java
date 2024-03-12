 /* public class test
       {
        public static void main (String[] args) {
            try {
                int a=5/0;
              System.out.print ("a ");
             } catch (ArithmeticException ae) {
               System.out.print ("ArithmeticException ");
               }catch (Exception e) {
                  System.out.print (" Exception ");
               }
             System.out.print("Hello World");
   }
}
*/
public class Question extends Thread{
    public void run () {
     for (int i=1;i<5;i++){
       System.out.println (++i);
    }
public class vilas{
    public static void main (String args []){
       Question tl=new Question ();
       t1.run ();
    }
}}