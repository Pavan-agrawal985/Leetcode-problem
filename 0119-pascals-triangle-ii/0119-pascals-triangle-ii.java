class Solution {
    public List<Integer> getRow(int rowIndex) {
         
        List<List<Integer>> list=new ArrayList<>();
        int m=1;
        while(m<=rowIndex+1 ){
            List<Integer> row=new ArrayList<>();

            row.add(1);

            if(m>1){
                List<Integer> prev=list.get(m-2);

                for(int i=1;i<m-1;i++){
                    int sum=prev.get(i-1)+prev.get(i);
                    row.add(sum);
                }
                row.add(1);
            }
            list.add(row);
            m++;
        }

        return list.get(rowIndex);
        
    }
}