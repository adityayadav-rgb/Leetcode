class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int n=arr.length;
        if(n<=2) return true;
        HashSet<Integer> set=new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        // all elements are same ;
        if(min-max==0) return true;
         if(set.size()!=arr.length)return false;
        //  diff must be integer;
        if((max-min)%(n-1)!=0) return false;
        int diff=(max-min)/(n-1);
        int current=min;
        for(int i=0;i<n;i++){
            if(!set.contains(current)){
                return false;
            }
            current+=diff;

        }

        return true;
    }
}