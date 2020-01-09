import java.util.HashSet;

public class n136_single_number {

    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};

        int output = singleNumber(nums);
        System.out.println(output);
    }

    public static int singleNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }

        for (int i : set) {
            return i;
        }
        return -1;
    }
}
