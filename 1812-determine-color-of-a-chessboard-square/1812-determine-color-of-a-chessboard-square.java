class Solution {
    public boolean squareIsWhite(String coordinates) {
        char a=coordinates.charAt(0);
        char b=coordinates.charAt(1);
        int x=a-'a';
        int y=b-'0';
        int ans=x+y;
        ans=ans%2;
         if(ans%2==1) return false;
         return true; 
    }
}