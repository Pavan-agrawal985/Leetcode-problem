class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        
        while(n!=1){
            if(set.contains(n)){
                return false;}

                set.add(n);



                
            int ss=0;
            int digit=n;
            while(digit>0){
                ss+=(digit % 10) * (digit % 10);
                digit/=10;
            }
            
            
            
            n=ss;
            


        }

        return true;

        
        
        
    }
}