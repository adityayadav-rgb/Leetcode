class Solution {
    public int minFlips(String target) {
        // instead of changing the entire array... i will see the next all element as fliped  and the double flipping will give the same array ..ex-> 101011 for the 1 indx 0 I will flip all the elements but for next necessary flip i will see elements as original state;
        boolean isfliped=false;
        int n=target.length();
        String s="0".repeat(n);
        int i=0;
        int j=0;
        int ans=0;
        while(i<n && j<n){
             char ch=target.charAt(i);
            if(isfliped){
                ch=(ch=='0')?'1':'0';
            }
            if(ch==s.charAt(j)){
                i++;
                j++;
            }
            else {
                isfliped=!isfliped;
                ans++;
                i++;
                j++;

            }
            }


        
        return ans;
    }
}