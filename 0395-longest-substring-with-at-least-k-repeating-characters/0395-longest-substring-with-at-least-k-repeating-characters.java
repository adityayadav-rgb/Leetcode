class Solution {
    public int longestSubstring(String s, int k) {
        int n=s.length();
        int ans=0;
        // i works for the number of unique character allowed
        for(int i=1;i<=26;i++){
            int []freq=new int [26];
            int left=0;
            int unique=0;
            int right=0;
            int countatleastk=0;
            while(right<n){
                int indx=s.charAt(right)-'a';
                if(freq[indx]==0) unique++;
                freq[indx]++;
                if(freq[indx]==k)countatleastk++;
                while(unique>i){
                    int leftindx=s.charAt(left)-'a';
                    if(freq[leftindx]==k) countatleastk--;
                    freq[leftindx]--;
                    if(freq[leftindx]==0)unique--;
                    left++;
                }
                if(unique==i && countatleastk==i)ans=Math.max(ans,right-left+1);
                right++;

            }
            
        }
        return ans;
        
    }
}