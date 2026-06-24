class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod=1000000007;
        int n=nums.length;
        int ans=0;
        int j=n-1;
        long pow[]=new long [n+1];
        pow[0]=1;
        for(int k=1;k<=n;k++){
            pow[k]=(pow[k-1]*2)%mod;
        }
        for(int i=0;i<n;i++){
            while(j>=i && nums[i]+nums[j]>target){
                j--;
            }
            if(j>=i){
                ans=(int )(ans+pow[j-i])% mod;
            }

        }



        return ans;
        
    }
}