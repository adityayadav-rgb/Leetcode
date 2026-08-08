class Solution {
    static boolean flag=true;
    static int binarysearch(int nums[],int target){
        int left=0;
        int right=nums.length;
        while(left<right){
        int mid=left+(right-left)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            left=mid+1;
        }
        else right=mid;
        }
        return left;
    
    }
    public List<Long> minOperations(int[] nums, int[] queries) {
        Arrays.sort(nums);
        ArrayList<Long>ans=new ArrayList<>();
        int n=nums.length;
        long prefixsum[]=new long [n];
        prefixsum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixsum[i]=prefixsum[i-1]+nums[i];
        }
        for(int querie:queries){
            int indx=binarysearch(nums,querie);
            long leftcost=(long)querie*indx;
            if(indx>0){
                leftcost-=prefixsum[indx-1];
            }
            long rightSum=prefixsum[n - 1];
            if (indx>0) {
                rightSum-=prefixsum[indx-1];
            }
           long rightcost=rightSum-(long)querie*(n-indx);
           ans.add(leftcost+rightcost);
        }
    
    return ans;
        
    }
}