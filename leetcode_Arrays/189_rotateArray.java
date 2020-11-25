//题目：最后一位移至最前，显示移动k次后结果
//解题思路：除以 数组长度的 余数 -> 移后位置
//注意：k > 数组长度

public class solution{
    public void rotate(int[] nums, int k) {        
        int[] arr = new int[nums.length];
        System.arraycopy(nums,0,arr,0,nums.length);
        
        for(int i=0; i < arr.length; i++){
            int r = (i+k) % arr.length;
            nums[r] = arr[i];
        }
    }
}
//时间复杂度O(n)
//空间复杂度O(n) 因为new了一个数组


//解法二：暴力：最后一位移到第一位，剩余的全部后移一位；做k次

public class solution{
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        for (int i = 0; i < k; i++) {
            int temp = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }
}

//解法三：环状替换
//解法四：反转
