//解题思路：两个指针。
//一个记录current数字，另一个向后扫，如果不一样的，插进cerrentIndex+1位置

public class solution{
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int current = nums[0];
        int currentIndex = 0;
        int i=1;
        for(; i<nums.length;i++){
            if(nums[i] == current){
                continue;
            }
            else{
                nums[currentIndex+1] = nums[i];
                current = nums[i];
                currentIndex+=1;
            }
        }
        return currentIndex+1 ;    
    }
}
