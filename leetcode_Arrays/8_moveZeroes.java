//题目：零移动到最后；数组移位

// 解题方法：
// 1.双指针：用一个指针来分割元素，使得它前面都是符合某种条件的元素。快速排序中也用到这个思想。
//   适用范围：分割元素，使得它前面都是符合某种条件的元素；快排；不可使用额外空间。
// 2.只要非零就插入前面指针位置。再补零

// 遍历一次：
public class solution{
    public void moveZeroes(int[] nums) {
        if (nums == null) return;

        int len = nums.length;
        //两个指针right和left
        int right = 0;
        int left = 0;
        while(right < len){
            //当前元素!=0，就把其交换到左边，等于0的交换到右边
            if (nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
            right++;
         }
    }
}

//遍历两次：- 只要非零就插入前面指针位置。再补零
public class solution{
    public void moveZeroes(int[] nums) {
            if (nums == null) return;
            //第一次遍历的时候，j指针记录非0的个数，只要是非0的统统都赋给nums[j]
            int j = 0;
            for(int i=0; i < nums.length; i++){
                if(nums[i] != 0){
                    nums[j++] = nums[i]; 
                }
            }
            //非0元素统计完了，剩下的都是0了
            //所以第二次遍历把末尾的元素都赋为0即可
            for(int k=j; k < nums.length; k++){
                nums[k] = 0;
            }
    }
}