class Solution {
    public int[][] transpose(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int transpose[][]=new int[m][n];
        if(n==m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j)continue;
                else if(i>j){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
    }
    else{
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                transpose[i][j]=matrix[j][i];
               
            }
        }
    }
    if(n!=m)return transpose;
        return matrix;
    }
}