class Solution {
    public int countDigitsOfANumber(int num) {
        if (num == 0) {
            return 1; 
        }
        return (int) Math.log10(num) + 1;
    }

    public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            if (countDigitsOfANumber(num) % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
