class Solution {
    static long gcd(long a,long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
            
        } return a;
    }
    static long lcm(long a,long b){
        return (a/gcd(a,b))*b;
    }
    public long maxScore(int[] nums) {
        int n=nums.length;
        if (n==1)return (long)nums[0]*nums[0];
        long []prefixlcm=new long [n];
        long []prefixgcd=new long [n];
        long []suffixlcm=new long [n];
        long []suffixgcd=new long [n];
        prefixgcd[0]=nums[0];
        prefixlcm[0]=nums[0];
        suffixgcd[n-1]=nums[n-1];
        suffixlcm[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            prefixgcd[i]=gcd(prefixgcd[i-1],nums[i]);
            prefixlcm[i]=lcm(prefixlcm[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
             suffixgcd[i]=gcd(suffixgcd[i+1],nums[i]);
             suffixlcm[i]=lcm(suffixlcm[i+1],nums[i]);

        }
        long ans = prefixgcd[n-1]*prefixlcm[n-1];
     for (int i=0;i<n;i++) {
    long g,l;
    if (i==0){
        g = suffixgcd[1];   // no left half exists — what represents "everything except index 0"?
        l = suffixlcm[1];
    } else if (i == n - 1) {
        g = prefixgcd[n-2];   // no right half exists
        l = prefixlcm[n-2];   // no right half exists
    
    } else {
        g = gcd(prefixgcd[i-1], suffixgcd[i+1]);
        l = lcm(prefixlcm[i-1], suffixlcm[i+1]);
    }
    ans = Math.max(ans, g * l);
}
return ans;
        
    }
}