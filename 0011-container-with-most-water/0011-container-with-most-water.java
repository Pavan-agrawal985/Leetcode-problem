class Solution {
    public int maxArea(int[] height) {
        int area = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int nbase = right - left;
            int narea = (height[left] < height[right] ? height[left] : height[right]) * nbase;
            area = area > narea ? area : narea;
            if (height[left] < height[right])
                left++;
            else
                right--;

        }
        return area;
    }
}