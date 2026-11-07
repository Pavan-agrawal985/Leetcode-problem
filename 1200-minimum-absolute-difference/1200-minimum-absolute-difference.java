class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> L = new ArrayList<>();
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        int min = Integer.MAX_VALUE;
        while (j < arr.length) {
            if (arr[j] - arr[i] < min) {
                min = arr[j] - arr[i];
            }
            i++;
            j++;
        }
        i = 0;
        j = 1;
        while (j < arr.length) {
            List<Integer> l = new ArrayList<>();
            if (arr[j] - arr[i] == min) {
                l.add(arr[i]);
                l.add(arr[j]);
                L.add(l);
            }
            
            i++;
            j++;

        }
        return L;

    }
}