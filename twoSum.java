//using Array
/*class Solution { 
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int t[] = {i,j}; //for storing the req. index
                    return t;
                }
            }
        }
        return null;
    }
}
*/

//using hashMap
import java.util.HashMap; 
class Solution { 
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int req_num = target-nums[i];
            if(hm.containsKey(req_num)){
                int a[] = {hm.get(req_num),i};
                return a;
            }
              hm.put(nums[i],i);
        }
        return null;
    }
}