import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};
        System.out.println(intersect(nums1,nums2));
        //Expect result [2,2]
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count =0;
        if(nums1.length >= nums2.length){
            int[] res = new int[nums1.length];
            for(int i : nums1){
            set.add(i);
            }
            for(int j : nums2){
                if(set.contains(j)){
                    res[count] = j;
                    count++;
                }
            }
            return res;
        }     
        else{
            int[] res = new int[nums2.length];
            for(int i : nums2){
            set.add(i);
            }
            for(int j : nums1){
                if(set.contains(j)){
                    res[count] = j;
                    count++;
                }
            }
            System.out.println(Arrays.copyOfRange(res,0,count));
            return Arrays.copyOfRange(res,0,count);
        }
    }
}