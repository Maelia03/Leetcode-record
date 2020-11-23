//Best solution 
//0 ^ n => n; n ^ n => 0
//Space complexity O(1)

    public int singleNumber(int[] nums) {
            int res = 0;
            for(int i : nums){
                
                res ^= i;
            }
            return res;
    }


//My HahSet solution
//Space complexity O(n)

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
