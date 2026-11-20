class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q=new LinkedList<>();
        int time=0;
        for(int i=0;i<tickets.length;i++){
            q.add(new int[]{i,tickets[i]});
        }
        while(!q.isEmpty()){
            int [] pr=q.remove();

            int index=pr[0];
            int remening=pr[1];

            remening--;
            time++;

            if(index==k && remening==0){
                return time;
            }

            if(remening>0){
                q.add(new int []{index,remening});
            }

            
        }

        return time;
        
    }
}