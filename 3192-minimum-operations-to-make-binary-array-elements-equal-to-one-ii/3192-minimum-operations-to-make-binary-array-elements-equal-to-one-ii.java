class Solution {
    public int minOperations(int[] nums) {
        // instead of changing the entire array... i will see the next all element as fliped  and the double flipping will give the same array ..ex-> 101011 for the 1 indx 0 I will flip all the elements but for next necessary flip i will see elements as original state;
        boolean isfliped=false;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(isfliped){
                nums[i]=1-nums[i];
            }
            if(nums[i]==0){
                ans++;
                isfliped=!isfliped;
            }
        }
        return ans;
    }
}