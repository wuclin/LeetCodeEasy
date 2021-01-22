import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 *
 *  给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回它们的数组下标。
 *  你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *  你可以按任意顺序返回答案。
 *  nums = [2,7,11,15], target = 9
 *  nums = [3,2,4], target = 6
 *  nums = [3,3], target = 6
 *
 *
 * */
public class twoSum {
    public static void main(String[] args){
        System.out.println(Solution2.twoSum(new int[]{2,7,11,15}, 9));;
        System.out.println(Solution2.twoSum(new int[]{3,2,4}, 6));;
        System.out.println(Solution2.twoSum(new int[]{3,3}, 6));;

    }

}
class Solution2{
    public static int[] twoSum(int[] nums, int target) {
        int num = nums.length;
        for(int i=0; i<num; i++)
            for (int j=i+1; j<num; j++){
                if (nums[j] == target - nums[i])
                    return new int[]{i, j};
            }
        return new int[]{0};
    }
    public static int[] twoSum2(int[] nums, int target){
        Map<Integer, Integer> hashtable = new HashMap<>();
        for (int i=0; i<nums.length;i++){
            if (hashtable.containsKey(target - nums[i]))
                return new int[]{hashtable.get(target-nums[i]),i};
            hashtable.put(nums[i],i);
        }
        return new int[]{0};

    }
}

/**
 *  第一种方法：对于每一个数，都查找一次是否相加的和为target，
 *  由于每个数都和前面的数加过了，所以第二层循环只需要从i的下一位开始
 *  第二种方法：是对于第一种方法的改进，对于每一个数以对应的{key,value},{num[i], i}的形式放入hash表
 *  即把num[i]作为key，查找的时候只需查找是否存在对应的key，即可得到下标
 *  如，假设
 * */