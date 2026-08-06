class Solution {
    public int product(int num){
        int pro=1;
        while(num>0){
            int rem=num%10;
            pro=pro*rem;
            num/=10;
        }
        return pro;
    }
    public int smallestNumber(int n, int t) {
        while(true){
           if(product(n)%t==0) return n;
           n++;
        }
    
    }
}