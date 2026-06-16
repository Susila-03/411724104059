import java.util.*;
public class SelectionSortEg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int t=arr[i];
            arr[i]=arr[min];
            arr[min]=t;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
