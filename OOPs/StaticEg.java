package OOPs;
import java.util.*;
class Counter{
    static int c=0;
    Counter(){
        c++;
    }
    static void displayCount(){
        System.out.println("Count:"+c);
    }
}
public class StaticEg {
    public static void main(String[] args) {
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
        Counter.displayCount();  
    }
    
}
