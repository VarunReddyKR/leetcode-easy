// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

class Solution {
    public int countDigitsOfANumber(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        if (nums.length == 0) {
            return -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (isEven(countDigitsOfANumber(nums[i]))) {
                count++;
            }
        }
        return count;
    }
}
