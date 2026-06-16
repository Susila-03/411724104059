import java.util.*;
public class MoveZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 
        int[] a=new int[n];
         for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
                j++;
            }
        }
            for(int i:a ){
                System.out.println(i);
            }
    }
}