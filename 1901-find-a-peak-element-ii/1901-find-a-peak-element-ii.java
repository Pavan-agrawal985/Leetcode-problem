class Solution {
    public int max(int [][] mat,int n,int m, int mid){
        int max=-1;
        int ind=-1;
        for(int i=0 ;i<n;i++){
           if(mat[i][mid]>max){
                max=mat[i][mid];
                ind=i;
           }
        }
        return ind;
    }
    public int[] findPeakGrid(int[][] mat) {
        int [] arr = new int[2];
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=mat[0].length;

        while(low<=high){
            int mid=(low+high)/2;
            int row=max(mat,n,m,mid);
            int left=mid-1>=0 ? mat[row][mid-1] :-1;
            int right=mid+1<m? mat[row][mid+1] :-1;
            

            if(mat[row][mid]>left && mat[row][mid]>right){
                arr[0]=row;
                arr[1]=mid;
                return arr;
            }
            else if(mat[row][mid]<left){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        arr[0]=-1;
        arr[1]=-1;

        return arr;
        
    }
}