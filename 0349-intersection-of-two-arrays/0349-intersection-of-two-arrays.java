import java.util.ArrayList;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set = new HashSet<>();
        ArrayList <Integer> newArr = new ArrayList<>();
        for(int i =0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        int j=0;
        for(int i =0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                newArr.add(nums2[i]);
                set.remove(nums2[i]);
                j++;
            }
        }
        return newArr.stream().mapToInt(Integer::intValue).toArray();
    }
    
}