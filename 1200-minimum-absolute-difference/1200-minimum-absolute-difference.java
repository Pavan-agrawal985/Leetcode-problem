class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> L = new ArrayList<>();
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        int min = Integer.MAX_VALUE;
        while (j < arr.length) {
            int diff= arr[j]-arr[i];

            if(diff<min){
                min=diff;

                L.clear();

                L.add(Arrays.asList(arr[i],arr[j]));


            }
            else if(diff==min){
                L.add(Arrays.asList(arr[i],arr[j]));
            }
            i++;
            j++;
            
        }
        
        
        return L;

    }
}