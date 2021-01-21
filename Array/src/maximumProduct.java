import java.util.Arrays;

import static sun.swing.MenuItemLayoutHelper.max;

/**
 * 三个数的最大乘积
 * */
public class maximumProduct {
    public static void main(String[] args){
        int[] a = {1,2,3};
        int[] b = {1,2,3,4};
        int[] c = {-1,-2,-3};
        int[] d = {-100,-98,-1,2,3,4};
   //     System.out.println(Solution1.MaximumProduct(a));
   //     System.out.println(Solution1.MaximumProduct(b));
   //     System.out.println(Solution1.MaximumProduct(c));
        System.out.println(Solution1.MaximumProduct(d));

    }
}
class Solution1{
    public static int MaximumProduct(int[] nums){

        if (nums.length < 3)
            return 0;
        Arrays.sort(nums);
        return max(nums[0] * nums[1] * nums[nums.length-1],nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3]);


    }
}
