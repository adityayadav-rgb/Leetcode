class Solution {
    public String winningPlayer(int x, int y) {
        int acount=4;
        int bcount=4;
        String ans=" ";
        if(x<1 || y<4) return "Bob";
        while(x>=1 && y>=4){
            x--;
            y-=acount;
            ans="Alice";
            if(x>=1 && y>=4){
                x--;
                y-=bcount;
                ans="Bob";
            }

        }
    
        return ans;
    }
}