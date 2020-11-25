//题眼：[2,2,3,3,1]除了一个数，其他数都出现两次。返回这个唯一数。
//推荐解法：位运算 异或

//官方解法 ：位运算 异或
// 1)	交换律：a ^ b ^ c <=> a ^ c ^ b
// 2)	任何数于0异或为任何数 0 ^ n => n
// 3)	相同的数异或为0: n ^ n => 0
public class solution{
    public int singleNumber(int[] nums) {
            int res = 0;
            for(int i : nums){
                res ^= i;                           //位运算0 ^ n => n；n ^ n => 0
            }
            return res;
        }
}
//空间复杂度：O(1)


//其他解法：HashSet判重；
//         HashMap存数字-出现次数；
//         HashSet中和的二倍 与 数组之和 做减法。
//问题：额外空间复杂度均为O(n)

//我的HashSet解法：
public class solution{
	public int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i<nums.length; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }
            else{
                set.add(nums[i]);
            }
        }
        int res = 0;
        for (int j : set){
            res = j;
        }
        return res;
    }
}

