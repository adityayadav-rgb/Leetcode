class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long x=0;
        long x1=0;
        while(n>0){
            int r=n%10;
            if(r!=0){
            x=x*10+r;}
            n/=10;
        }
        while(x>0){
            long r1=x%10;
            if(r1!=0){
            x1=x1*10+r1;}
            sum+=r1;
            x/=10;
        }
        return x1*sum;
    }
}