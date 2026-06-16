// public class Recursion {
//     public static void reverse(char[] arr,int i,int j){
//         if(i>=j)
//             return;
//     char t= arr[i];
//     arr[i]=arr[j];
//     arr[j]=t;
//     reverse(arr,i+1,j-1);
// }
// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     char[] ch=sc.next().toCharArray();k
//     reverse(ch, 0, ch.length-1);
//     System.out.println(ch);
// }
// }
import java.util.*;

// public class Recursion {
//     public static boolean isPalindrome(String s, int i, int j) {
//         if (i >= j)   // crossed or met => palindrome
//             return true;
//         if (s.charAt(i) != s.charAt(j))
//             return false;
//         return isPalindrome(s, i + 1, j - 1);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String str =sc.nextLine();
//         if (isPalindrome(str, 0, str.length() - 1))
//             System.out.println("Palindrome");
//         else
//             System.out.println("Not Palindrome");
//     }
// }

// public class Recursion {
//     public static int fibo(int n){
//         if(n==0) return 0;
//         if(n==1) return 1;
//         return  fibo(n-1)+fibo(n-2);
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//          for (int i = 0; i < n; i++) {
//             System.out.print(fibo(i) + " ");
//     }
//     }
// }

public class Recursion {
    public static int fact(int n){
         if(n==0 || n==1) return 1;
    return n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}