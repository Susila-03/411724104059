import java.util.*;
 public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        // Step 1: find first decreasing index from right
        int i = n - 2;
        while (i >= 0 && a[i] >= a[i + 1]) i--;
        // Step 2: if found, swap with next greater element
        if (i >= 0) {
            int j = n - 1;
            while (a[j] <= a[i]) j--;
            int t = a[i]; a[i] = a[j]; a[j] = t;
        }
        // Step 3: reverse right part
        int l = i + 1, r = n - 1;
        while (l < r) {
            int t = a[l]; a[l] = a[r]; a[r] = t;
            l++; 
            r--;
        }
        for (int x : a) System.out.print(x + " ");
    }
}
