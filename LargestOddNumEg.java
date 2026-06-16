class Solution {

    public String largestOddNum(String s) {

        int n = s.length();

        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int num = ch - '0';

            if (num % 2 == 1) {   // odd digit found
                // int j = 0;

                // // remove leading zeros
                // while (j < s.length() && s.charAt(j) == '0') {
                //     j++;
                // }

                return s.substring(0, i + 1);
            }
        }

        return "";
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        String s = "35427";
        System.out.println(obj.largestOddNum(s));
    }
}