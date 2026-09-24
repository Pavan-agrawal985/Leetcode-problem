class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        if(n==1) return true;
        int r=n;
        while(r!=1){
            int ss=0;
            int digit=r;
            while(digit>0){
                ss+=(digit % 10) * (digit % 10);
                digit/=10;
            }
            if(ss==1){
                return true;
            }
            if(map.containsKey(r)){
                return false;
            }else{
                map.put(r,ss);
            }
            r=ss;
            


        }

        return false;

        
        
        
    }
}