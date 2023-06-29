import java.util.Arrays;
public class arr8 {
    public static int[] arrangeArr(int nums[], int n) {
        int output[] = new int[nums.length];
        for (int i = 0; i < n; i++) {
            output[i * 2] = nums[i];
            output[i * 2 + 1] = nums[i + n];
        }
        return output;
    }

    public static void main(String[] args) {
        int nums[] = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int output[] = arrangeArr(nums, n);
        System.out.println(Arrays.toString(output));
    }
}
