class Solution {
    public int maxArea(int[] heights) {
        int start = 0;
        int end = heights.length - 1;
        int rest = 0;

        while (start < end){
            int area = Math.min(heights[start],heights[end]) * (end - start);
            rest = Math.max(rest, area);
            if (heights[start] < heights[end]){
                start++;
            }else{
                end--;
            }
        }

        return rest;
        
    }
}
