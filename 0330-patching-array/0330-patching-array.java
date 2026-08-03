class Solution {
    public int minPatches(int[] coins, int target) {
         long sum=0;
        int ans=0;
        int j=0;
        while(sum<target){
            if(j<coins.length && coins[j]<=sum+1){
                sum+=coins[j];
                j++;
            }
            else {
                ans++;
                sum+=sum+1;
            }
        }
        return ans;
        
    }
}