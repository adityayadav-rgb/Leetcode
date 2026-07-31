class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char a=coordinate1.charAt(0);
        char b=coordinate1.charAt(1);
        int x=a-'a';
        int y=b-'0';
        int ans=x+y;
        ans=ans%2;
        a=coordinate2.charAt(0);
        b=coordinate2.charAt(1);
         x=a-'a';
         y=b-'0';
         int ans2=x+y;
         ans2=ans2%2;
         if(ans==ans2) return true;
         return false;

    }
}