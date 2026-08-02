class Solution {
    public int binarysearch(long []prefix,int left,int right,long target){
        while(left<right){
            int mid=left+(right-left)/2;
            if(prefix[mid]<=target){
                left=mid+1;
            }
            else right=mid;
        }
        return right;
    }
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n=tasks.length;
        long prefix[]=new long[n];
        prefix[0]=tasks[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+tasks[i];
        }
        long previousleft=0;
        int left=0;
        int right=n-1;
        int ans[]=new int[shifts.length];
        for(int i=0;i<shifts.length;i++){
            long target=shifts[i]+previousleft;
            int mid=binarysearch(prefix,left,n-1,target);
            if(prefix[mid]<=target){
                ans[i]=0;
                left=0;
                right=n-1;
                previousleft=0;
            }
            else {
                 ans[i]=n-mid;
                 left=mid;
                 previousleft=target;
        
            }
        }
        return ans;
    }
}