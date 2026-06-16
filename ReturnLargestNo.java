import java.util.*;
public class ReturnLargestNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int r=0;
        while(n>0){
            int d=n%10;
            if(d>r){
                r=d;
            }
            n/=10;
        }
        System.out.println(r);
    }
}
