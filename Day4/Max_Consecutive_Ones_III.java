package ICP;

public class Max_Consecutive_Ones_III {
    public int longestOnes(int[] nums, int k) {
        // TC = O(n)
        // SC = O(1)
        return flip(nums,k,0);
    }
    public int flip(int[] nums,int k,int zero){
        int start=0;
        int end=0;
        int ans=0;
        int flip=0;
        while(end<nums.length){
            if(nums[end]==zero){
                flip++;
            }
            while(start<=end && flip>k){
                if(nums[start]==zero){
                    flip--;
                }
                start++;
            }
            ans=Math.max(ans,end-start+1);
            end++;
        }
        return ans;
    }
}
