public class Q5 {
    public int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        }
        int[] nums = new int[n + 1];
        nums[1] = 1;
        int max = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                nums[i] = nums[i / 2];
            } else {
                nums[i] = nums[i / 2] + nums[i / 2 + 1];
            }
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Q5 q5 = new Q5();
        int n = 7;
        int result = q5.getMaximumGenerated(n);
        System.out.println(result);
    }
}
