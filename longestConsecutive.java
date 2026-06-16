import java.util.*;
// public class SecondHighestElement {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int[] a=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//         int max = Integer.MIN_VALUE;
//         int second = Integer.MIN_VALUE;

//         for (int i = 0; i < n; i++) {
//             if (a[i] > max) {
//                 second = max;
//                 max = a[i];
//             } else if (a[i] > second && a[i] != max) {
//                 second = a[i];
//             }
//         }
//         System.out.println(second);
//     }
// }

public class longestConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        for (int x : a) set.add(x);

        int longest = 0;

        for (int x : a) {
            // check if x is the start of a sequence
            if (!set.contains(x - 1)) {
                int curr = x;
                int len = 1;

                // count consecutive numbers
                while (set.contains(curr + 1)) {
                    curr++;
                    len++;
                }

                longest = Math.max(longest, len);
            }
        }
        System.out.println(longest);
    }
}
