//题目：给定一个数组和一个目标和，从数组中寻找两个数相加为目标和，输出两个数的下标。
//解法一：暴力解法，两层循环，一个一个加。
//解法二：HashMap
//(数，下标)放入HashMap, 看target-nums[i]的差值是否在hash中包括contains。
//注意判断，找到的元素不是当前同一位置的元素。

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            m.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; ++i) {
            int t = target - nums[i];
            if (m.containsKey(t) && m.get(t) != i) {
                res[0] = i;
                res[1] = m.get(t);
                break;
            }
        }
        return res;
    }
}
