/**
 * 主元素
 * */
public class majorityElement {
    public static void main(String[] args){
        int[] a = {1,2,5,9,5,9,5,5,5};
        int[] b = {3,2};
        int[] c = {2,2,1,1,1,2,2};
        int[] d = {47,47,72,47,72,47,79,47,12,92,13,47,47,83,33,15,18,47,47,47,47,64,47,65,47,47,47,47,70,47,47,55,47,15,60,47,47,47,47,47,46,30,58,59,47,47,47,47,47,90,64,37,20,47,100,84,47,47,47,47,47,89,47,36,47,60,47,18,47,34,47,47,47,47,47,22,47,54,30,11,47,47,86,47,55,40,49,34,19,67,16,47,36,47,41,19,80,47,47,27};
        System.out.println(Solution.MajorityElement(a));
        System.out.println(Solution.MajorityElement(b));
        System.out.println(Solution.MajorityElement(c));
        System.out.println(Solution.MajorityElement(d));
    }
}

class Solution{
    public static int MajorityElement(int[] nums){
        int M = nums[0];
        int count = 1;
        if (nums.length < 1)
            M = -1;
        for (int i=1; i<nums.length; i++){
            if (M == nums[i])
                count++;
            else
                count--;
            if (count<=0)
            {
                M = nums[i];
                count = 1;
            }
        }
        //System.out.println(M);
        //这里还要对M进行检验，是否超过了一半
        int cnt = 0;
        for (int i=0; i<nums.length; i++){
            if (M == nums[i])
                cnt++;
        }
        if (cnt <= nums.length/2)
            M = -1;

        return M;
    }
}