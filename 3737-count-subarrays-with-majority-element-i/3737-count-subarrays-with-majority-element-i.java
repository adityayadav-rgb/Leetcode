class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int []prefix=new int [n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+(nums[i]==target?1:-1);
        }
        int count=0;
        for(int i=0;i<=n;i++){
            for(int q=i+1;q<=n;q++){
                if(prefix[q]>prefix[i]){
                    count++;
                }
            }
        }
return count;
        
    }
}