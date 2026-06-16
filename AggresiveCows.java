// class Solution {
//     boolean f(int[] nums, int mid, int k) {
//         int cnt = 1;
//         int n = nums.length;
//         int last = nums[0];
//         for(int i = 1; i < n; i++) {
//             if(nums[i] - last >= mid) {
//                 cnt++;
//                 last = nums[i];
//             }
//             if(cnt >= k) return true;
//         }
//         return false;
//     }
//     public int aggressiveCows(int[] nums, int k) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         int lo = nums[0];
//         int hi = nums[n-1] - nums[0];
//         int ans = 0;
//         while(lo <= hi) {
//             int mid = lo + (hi - lo) / 2;
//             boolean check = f(nums, mid, k);
//             if(check == true) {
//                 ans = mid;
//                 lo = mid + 1;
//             }
//             else hi = mid -1;
//         }
//         return hi;
//     }
// }


