// https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/?envType=problem-list-v2&envId=20w3ezf2

class Solution {
    public int countKDifference(int[] nums, int k) {
        int p1 = 0, p2 = 1, count = 0, numsLength = nums.length;

        while (p1 < numsLength) {
            while (p2 < numsLength) {
                if (Math.abs(nums[p1] - nums[p2]) == k) {
                    count++;
                }
                p2++;
            }
            
            p1++;
            p2 = p1 + 1;
        }

        return count;
    }
}


// My approach - Brute Force
class Solution {
    public int countKDifference(int[] nums, int k) {
        int p1 = 0, p2 = 1, count = 0, numsLength = nums.length;
        HashMap storage = new HashMap();
        ArrayList<Integer> storageInt = new ArrayList<>();
        // Edge Case
        if (numsLength == 0) {
            return 0;
        }

        while (p1 < numsLength) {
            if (p2 == numsLength) {
                count++;
                p2 = 1 + count;
                p1++;
                continue;
            }

            int ans = Math.abs(nums[p1] - nums[p2]);
            if (ans == k) {
                storageInt.add(ans);
            }
            p2++;
        }

        return storageInt.size();
    }
}

// Edge Case
    // If One item is only available return 0
    // Figure how to handle negative values also

// Use the two pointer technique to iterate through each subset of the array ( What type it is to google it)
// A condition to check if it meets.
// if it does, store in hash map
// return number of occurence or count when done
