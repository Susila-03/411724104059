import java.util.*;
public class Arrays{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // int max=arr[0];
        // for(int i=0;i<n;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        // }
        //     System.out.println(max);

        // int max=-1,smax=-1;
        // for(int i=0;i<n;i++){
        //     if(arr[i]>max){
        //         smax=max;
        //         max=arr[i];
        //     }else if(arr[i]>smax){
        //         smax=arr[i];
        //     }
        // }
        // System.out.println(smax);

        // int s=0;
        // int e=arr.length-1;
        // while(s<e){
        //     int t=arr[s];
        //     arr[s]=arr[e];
        //     arr[e]=t;
        //     s++;
        //     e--;
        // }
        // for(int num:arr){
        //     System.out.print(num);
        // }

        int n=sc.nextInt();
        int m=sc.nextInt();
        String[][] arr=new String[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.next();
            }
        }
        String s = arr[0][0];
        int sum=(int)s.charAt(0)+(int)s.charAt(1);
        if(sum/2==0){
            System.out.println(1);
        }else{
            System.out.println("blanck");
        }
    }
}