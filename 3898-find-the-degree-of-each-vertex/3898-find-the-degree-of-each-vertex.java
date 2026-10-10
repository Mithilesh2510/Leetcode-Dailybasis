class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int[] arr=new int[n];
        int ver=0;
        for(int i=0;i<n;i++){
            ver=0;
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1)
                    ver++;
            }
            arr[i]=ver;
        }
        return arr;
    }
}