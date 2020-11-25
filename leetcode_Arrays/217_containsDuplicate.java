//题目：数组是否存在重复元素，返回boolean。
//解题思路：
// 1.	HashSet + set.contains()
// 2.	HashMap + put出现次数(判重计数) 如30,49,136,137
// 3.	原数组排序，然后判断是否有前后两个数字相同

// Solution HashSet

public class solution {
    public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> set = new HashSet<Integer>();
            for(int i : nums){                               //hashSet 用foreach ！
                if(set.contains(i)){
                    return true;
                }
                    set.add(i);
            }
            return false;
        }
}