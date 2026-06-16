import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int o=n,r=0;
      while(n>0){
        int d=n%10;
        r=r+d*d*d;
        n/=10;
      }  
      if(r==o){
        System.out.println(r+"Armstrong no");
      }else{
        System.out.println(r+" Not Armstrong no");
      }
    }
}
