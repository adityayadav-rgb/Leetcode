class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0) return 0;
        int n=nums.length;
        int current_mul=1;
        int j=0;
        int count=0;
        for(int i=0;i<n;i++){
            current_mul*=nums[i];
            while(j<=i && current_mul>=k){
                current_mul/=nums[j];
                j++;
            }
            int size=i-j+1;
                count+=size;
        }
        return count;
    }
}