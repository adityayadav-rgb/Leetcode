class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int push=0;
        int inc=1;
        
        while(n>0){
            int take =Math.min(8,n);
            push+=take*inc;
            n-=8;
            inc++;

        }
        return push;
    }
}