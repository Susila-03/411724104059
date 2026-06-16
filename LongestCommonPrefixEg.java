// class Solution {

//     public String longestCommonPrefix(String[] str) {

//         if (str.length == 0) return "";

//         String prefix = str[0];

//         for (int i = 1; i < str.length; i++) {
//             int j = 0;

//             while (j < prefix.length() && j < str[i].length() &&
//                    prefix.charAt(j) == str[i].charAt(j)) {
//                 j++;
//             }

//             prefix = prefix.substring(0, j);
//         }

//         return prefix;
//     }

//     public static void main(String[] args) {
//         Solution obj = new Solution();

//         String[] arr = {"flower", "flow", "flight"};

//         String ans = obj.longestCommonPrefix(arr);

//         System.out.println("Longest Common Prefix = " + ans);
//     }
// }