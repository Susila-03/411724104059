// import java.util.*;
// //leader Array
// public class TestEg {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] arr = new int[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         ArrayList<Integer> leaders = new ArrayList<>();
//         int maxRight = Integer.MIN_VALUE;

//         for (int i = n - 1; i >= 0; i--) {
//             if (arr[i] >= maxRight) {
//                 leaders.add(arr[i]);
//                 maxRight = arr[i];
//             }
//         }

//         Collections.reverse(leaders);

//         for (int i = 0; i < leaders.size(); i++) {
//             System.out.print(leaders.get(i));
//             if (i != leaders.size() - 1) {
//                 System.out.print(" ");
//             }
//         }
//     }
// }

//remove all adjacent duplicates in String
// import java.util.*;

// public class TestEg {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();

//         StringBuilder sb = new StringBuilder();

//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ch) {
//                 sb.deleteCharAt(sb.length() - 1);
//             } else {
//                 sb.append(ch);
//             }
//         }

//         System.out.println(sb.toString());
//     }
// }

// //equal frequency after one removal
// import java.util.*;
// public class TestEg {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int n = s.length();
//         for (int i = 0; i < n; i++) {
//             int[] f = new int[26];
//             // count freq except one character
//             for (int j = 0; j < n; j++) {
//                 if (i != j) {
//                     f[s.charAt(j) - 'a']++;
//                 }
//             }
//             int same = 0;
//             boolean ok = true;
//             // check equal frequency
//             for (int x : f) {
//                 if (x == 0) continue;
//                 if (same == 0) same = x;
//                 else if (x != same) {
//                     ok = false;
//                     break;
//                 }
//             }
//             if (ok) {
//                 System.out.println("YES");
//                 return;
//             }
//         }
//         System.out.println("NO");
//     }
// }

//Smallest subarray covering maximum array
// import java.util.*;
// public class TestEg {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         int f=-1,l=-1;
//         for(int i=0;i<n;i++){
//             if(arr[i]==max){
//                 if(f==-1){
//                     f=i;
//                 }
//                 l=i;
//             }
//         }
//         System.out.println(l-f+1);
//     }
// }


// //smallest missing consecutive  sorted array
// import java.util.*;
// public class TestEg {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int b=arr[0];
//         int l=0,h=n-1,ans=n;
//         if(l<=h){
//             int m=l+(h-l)/2;
//             int e=b+m;
//             if(arr[m]==e){
//                 l=m+1;
//             }else{
//                 ans=m;
//                 h=m-1;
//             }
//         }
//         System.out.print(b+ans);
//     }
// }


// //Frequency rank match
// import java.util.*;
// public class TestEg {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         Map<Integer,Integer> freq=new HashMap<>();
//         for(int x: arr)
//             freq.put(x,freq.getOrDefault(x,0 )+1);
//         List <Integer> a=new ArrayList<>(freq.keySet());
//         Collections.sort(a);
//         int c=0;
//         for(int i=0;i<a.size();i++){
//             int v=a.get(i);
//             int r=i+1;
//             if(freq.get(v)==r){
//                 c++;
//             }
//         }
//         System.out.println(c);
//     }
// }


//remaining length after end cancellation
import java.util.*;
public class TestEg {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        int l=0,r=s.length()-1;
        while(l<r && s.charAt(l)==s.charAt(r)){
            l++;
            r--;
        }
        int ans=r-l+1;
        if(ans<0) ans=0;
        System.out.println(ans);
    }
}