class Solution {
    public double champagneTower(int poured, int row, int glass) {
        int size=1;
        int i=0;
        ArrayList<Double> curr=new ArrayList<>();
        curr.add((double)poured);
        boolean flag=true;
        while(flag){
            flag=false;
            ArrayList<Double> next=new ArrayList<>();
            for(int k=0;k<=size;k++){
                next.add(0.0);
            }
            for(int j=0;j<curr.size();j++){
                double excess=Math.max(curr.get(j)-1.0,0.0);
                curr.set(j,Math.min(curr.get(j),1.0));
                if(excess>0.0){
                    flag=true;
                    double left=excess/2;
                    double right=excess/2;
                    next.set(j,next.get(j)+left);
                    next.set(j+1,next.get(j+1)+right);   
                }
                if(i==row && j==glass) return curr.get(j);
                   }
                   i++;
                   size++;
                   curr=next;
        }
       
        return 0.0;
    }
}