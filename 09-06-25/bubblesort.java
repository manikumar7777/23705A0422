public class App {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1,  6}; 

        for (int j = 0; j < nums.length - 1; j++) {
            boolean isSwapped = false;
            for (int i = 0; i < nums.length - j - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    // Swap
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
