//import java.util.*;

// public class ArraysEg {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         ArrayList<ArrayList<Integer>> list = new ArrayList<>();

//         // Input: 4 rows, 5 elements each
//         for (int i = 0; i < 4; i++) {
//             ArrayList<Integer> r = new ArrayList<>();
//             for (int j = 0; j < 5; j++) {
//                 r.add(sc.nextInt());
//             }
//             list.add(r);   // <-- important
//         }

//         // Reverse each row
//         for (int i = 0; i < list.size(); i++) {
//             Collections.reverse(list.get(i));
//         }

//         // Print result
//         for (int i = 0; i < list.size(); i++) {
//             for (int j = 0; j < list.get(i).size(); j++) {
//                 System.out.print(list.get(i).get(j) + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class ArraysEg {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//         for (int i = 0; i < 3; i++) {
//             ArrayList<Integer> r = new ArrayList<>();
//             for (int j = 0; j < 3; j++) {
//                 r.add(sc.nextInt());
//             }
//             list.add(r);  
//         }
//         for (int j = 0; j < list.size(); j++) {
//             Collections.reverse(list.get(j));
//         }
//         for (int i = 0; i < list.size(); i++) {
//             for (int j = 0; j < list.get(i).size(); j++) {
//                 System.out.print(list.get(i).get(j) + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.*;

// public class ArraysEg {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             ArrayList<Integer> row = new ArrayList<>();
//             for (int j = 0; j < n; j++) {
//                 row.add(sc.nextInt());
//             }
//             list.add(row);
//         }
//         // Step 1: Transpose
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 int temp = list.get(i).get(j);
//                 list.get(i).set(j, list.get(j).get(i));
//                 list.get(j).set(i, temp);
//             }
//         }
//         // Step 2: Reverse each row
//         for (int i = 0; i < n; i++) {
//             Collections.reverse(list.get(i));
//         }
//         // Print output
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(list.get(i).get(j) + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.*;
// public class ArraysEg {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         ArrayList<ArrayList<Integer>> list=new ArrayList<>();
//          for (int i = 0; i < n; i++) {
//             ArrayList<Integer> row = new ArrayList<>();
//             for (int j = 0; j < n; j++) {
//                 row.add(sc.nextInt());
//             }
//             list.add(row);
//         }
//         int top=0,bottom=2,left=0,right=2;
//         while (left<=right && top <=bottom) {
//             for(int i=left;i<=right;i++){
//                 System.out.print(list.get(top).get(i) + " ");
//             }top++;
//             for(int i=top;i<=bottom;i++){
//                 System.out.print(list.get(i).get(right) + " ");
//             }
//                 right--;
//             if(top<=bottom){
//                 for(int i=right;i>=left;i--){
//                     System.out.print(list.get(bottom).get(i) + " ");
//                 }bottom--;
//             }
//             if(left<=right){
//                 for(int i=bottom;i>=top;i--){
//                     System.out.print(list.get(i).get(left) + " ");
//                 }
//                 left++;  
//             }
//         }
//     }
// }


import java.util.*;

public class ArraysEg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        // Input ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        // Convert to array for easy sorting
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        Arrays.sort(nums);
        System.out.println("Triplets with sum 0:");
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
    }
}