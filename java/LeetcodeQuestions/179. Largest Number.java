// https://leetcode.com/problems/largest-number/description/?envType=problem-list-v2&envId=ascyfkj5

class Solution {
    public String largestNumber(int[] nums) {
        String[] strs = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, (s1, s2) -> (s2+s1).compareTo(s1+s2));

        StringBuilder sb = new StringBuilder();

        for (String str: strs) if (!(sb.length() == 0 && str.equals("0"))) sb.append(str);
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
