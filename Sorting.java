// import java.util.*;
//
// //bubble sort
// public class Sorting {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] a = new int[n];

//         // Read array elements
//         for(int i = 0; i < n; i++){
//             a[i] = sc.nextInt();
//         }

//         // Bubble Sort
//         for(int i = 0; i < n - 1; i++){
//             for(int j = 0; j < n - i - 1; j++){
//                 if(a[j] > a[j + 1]){
//                     // swap
//                     int temp = a[j];
//                     a[j] = a[j + 1];
//                     a[j + 1] = temp;
//                 }
//             }
//         }

//         // Print sorted array
//         for(int x : a){
//             System.out.print(x + " ");
//         }
//     }
// }

//Search X in sorted array
// import java.util.*;
// public class Sorting {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] nums=new int[n];
//         for(int i=0;i<n;i++){
//             nums[i]=sc.nextInt();
//         }
//         System.out.println("Target:");
//         int target=sc.nextInt();
//         for(int i=0;i<n;i++){
//             if(target==nums[i]){
//                 System.out.println(i);
//             }
//         }
//     }
// }

//Lower bound
// import java.util.*;
// public class Sorting {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] nums=new int[n];
//         for(int i=0;i<n;i++){
//             nums[i]=sc.nextInt();
//         }
//         System.out.println("Lower Bound:");
//         int x=sc.nextInt();
//         int l=0,h=n-1; int a=-1;
//         while(l<=h){
//             int m=l+(h-l)/2;
//             if(nums[m]>=x){
//                 a=m;
//                 h=m-1;
//             }
//             else l=m+1;
//         }
//         System.out.println(l);
//     }
// }


//UpperBound
// import java.util.*;
// public class Sorting {
//     public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int[] nums=new int[n];
        // for(int i=0;i<n;i++){
        //     nums[i]=sc.nextInt();
        // }
        // System.out.println("Upper Bound:");
        // int x=sc.nextInt();
//         int l=0,h=n-1; int a=n-1;
//         while(l<=h){
//             int m=l+(h-l)/2;
//             if(nums[m]>x){
//                 a=m;
//                 h=m-1;
//             }
//             else l=m+1;
//         }
//         System.out.println(a);
//     }
// }

//Search insert position
// import java.util.*;
// public class Sorting {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] nums=new int[n];
//         for(int i=0;i<n;i++){
//             nums[i]=sc.nextInt();
//         }
//         System.out.println("Target:");
//         int x=sc.nextInt();
//         int low = 0, high = nums.length - 1;
//         int ans = nums.length;

//         while (low <= high) {
//         int mid = low + (high - low) / 2;

//         if (nums[mid] >= x) {
//             ans = mid;
//             high = mid - 1;
//         } else {
//             low = mid + 1;
//         }
//     }
//     System.out.println(ans);
// }
// }


//Floor and ceil in sorted array
// import java.util.*;
// public class Sorting {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.println("Target:");
        // int x=sc.nextInt();
//               int low = 0, high = arr.length - 1;
//         int floor = -1, ceil = -1;

//         while (low <= high) {
//             int mid = low + (high - low) / 2;

//             if (arr[mid] == x) {
//                 floor = arr[mid];
//                 ceil = arr[mid];
//                 break;
//             }

//             if (arr[mid] < x) {
//                 floor = arr[mid];
//                 low = mid + 1;
//             } else {
//                 ceil = arr[mid];
//                 high = mid - 1;
//             }
//         }

//         System.out.println(new int[]{floor, ceil});
//     }
// }

// first and last occurrence
//import java.util.*;
// public class Sorting {
//     public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i = 0; i < n; i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.println("Target:");
        // int x = sc.nextInt();
//         int first = -1;
//         int last = -1;
//         if(n == 0){
//             System.out.println("[-1, -1]");
//             return;
//         }
//         int low = 0, high = n - 1;
//         // ---- First Occurrence ----
//         while(low <= high){
//             int mid = low + (high - low) / 2;
//             if(arr[mid] == x){
//                 first = mid;
//                 high = mid - 1;        // search left
//             }
//             else if(arr[mid] < x){
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         // Reset low and high for last occurrence
//         low = 0;
//         high = n - 1;
//         // ---- Last Occurrence ----
//         while(low <= high){
//             int mid = low + (high - low) / 2;
//             if(arr[mid] == x){
//                 last = mid;
//                 low = mid + 1;        // search right
//             }
//             else if(arr[mid] < x){
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         System.out.println("[" + first + ", " + last + "]");
//     }
// }


//Search in rotated sorted array-I
// import java.util.*;
// public class Sorting {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] nums = new int[n];
//         for(int i = 0; i < n; i++){
//             nums[i] = sc.nextInt();
//         }
//         System.out.println("Target:");
//         int x = sc.nextInt();
//         int l=0,h=nums.length-1;
//         while(l<=h){
//             int m=(l+h)/2;
//             if(nums[m]==x) System.out.println(m);
//             if(nums[l]<=nums[m]){
//                 if(nums[l]<=x && x<=nums[m]){
//                     h=m-1;
//                 }else{
//                     l=m+1;
//                 }
//             }else{
//                 if(nums[m]<= x && x<=nums[h]){
//                     l=m+1;
//                 }else{
//                     h=m-1;
//                 }
//             }
//         }
//         //return -1;
//     }
// }

//Find minimum in Rotated Sorted Array
// import java.util.*;
// public class Sorting {
//     public static int findMin(int[] arr) {
//         int low = 0, high = arr.length - 1;
//         while (low < high) {
//             int mid = (low + high) / 2;

//             if (arr[mid] > arr[high]) {
//                 low = mid + 1;   // go right
//             } else {
//                 high = mid;      // go left
//             }
//         }
//         return arr[low];   // minimum element
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] nums = new int[n];
//         for(int i = 0; i < n; i++){
//             nums[i] = sc.nextInt();
//         }
//         System.out.println(findMin(nums)); 
//     }
// }


//Rotated sorted .find peak element
import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l=0,h=n-1;
        while(l<h){
            int m=l+(h-l)/2;
            if(arr[m]>arr[m+1]){
                h=m;
            }else{
                l=m+1;
            }
        }
        System.out.println(l);
    }
}