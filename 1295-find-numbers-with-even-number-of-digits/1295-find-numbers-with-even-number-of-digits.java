class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            int digits = (int) Math.log10(nums[i]) + 1;
            if (digits % 2 == 0)
                c++;
        }
        return c;

    }
    }
