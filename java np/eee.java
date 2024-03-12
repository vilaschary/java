import java.util.*;
public class eee{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
     int a=n%4;
     int b=n%100;
     int c=n%400;
     int d=a-b+c;
     if(d==0)
     System.out.println("non leap year");
     else
     System.out.println(" leap year");
    }
}