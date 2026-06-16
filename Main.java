import java.util.*;

//print N to 1
// public class Main {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=n;i>=1;i--){//=5){
//             System.out.println(i);
//         }
//     }
// }

//Sum of First N
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int s=0;
//         for(int i=0;i<=n;i++){
//             s+=i;
//         }
//         System.out.println(s);
//     }
// }

//input of 10 numbers and sum the odd and print it
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[10];
//         int s=0;
//         for(int i=0;i<10;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<arr.length;i++){
//             if(i%2!=0){
//                  s+=arr[i];
//             }
//         }
//         System.out.println(s);
//     }
// }

//Leap year
// public class Main{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int yr=sc.nextInt();
//         if(yr%400==0||(yr%4==0 && yr%100!=0)){
//             System.out.println("Leap year");
//         }else{
//             System.out.println("Not Leap year");
//         }
//     }
// }

//Valid triangle
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();
//         if(a+b>c && b+c>a && c+a>b){
//             System.out.println("Valid triangle");
//         }else{
//             System.out.println("Not Valid triangle");
//         }
//     }
// }

//multiple of both 3 and 5
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         if(n%3==0 && n%5==0){
//             System.out.println("Multiple of both 3 and 5");
//         }else{
//             System.out.println("Not Multiple of both 3 and 5");
//         }
//     }
// }

//check wheather a number lies between 10 and 50
// public class Main {
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     if(n>10 && n<50){
//         System.out.println("It lies between the points");
//     }else{
//         System.out.println("Not Lies between the points");
//     }
// }
// }

//Number-pattern
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();
//         int cur=1;
//         for(int i=0;i<x;i++){
//             for(int j=0;j<i+1;j++){
//                 System.out.print(cur+" ");
//                 cur++;
//             }
//             System.out.println();
//         }
//     }
// }


//Alphabet-pattern
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<i+1;j++){
//                 System.out.print((char)('A'+j)+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//triangle pattern
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n-1-i;j++){
//                 System.out.print(" ");
//             }
//             for(int k=0;k<i+1;k++){
//                 System.out.print((char)('A'+k));
//             }
//             for(int l=i-1;l>=0;l--){
//                   System.out.print((char)('A'+l));
//             }
//             System.out.println();
//         }
//     }
// }

// //1-0 Pattern
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             int curr=i%2;
//             for(int j=0;j<i;j++){
//                 System.out.print(curr);
//                 curr=1-curr;
//             }
//             System.out.println();
//         }
//     }
// }

//Square root of a number
import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int l=0,h=n;
        int ans=0;
        while(l<=h){
            int m=l+(h-l)/2;
            long v=(long)m*(long)m;
            if(v<=(long)n){
                ans=m;
                l=m+1;
            }else{
                h=m-1;
            }
        }     
        System.out.println(ans);
    }
}