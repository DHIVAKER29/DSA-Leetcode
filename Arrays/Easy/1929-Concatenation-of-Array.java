class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[n * 2]; 
         
        for(int i=0; i<nums.length; i++){
            result[i] = nums[i];

        }
        int j =0;
        for(int i=n; i<n+n; i++){
            result[i] = nums[j];
            j++;

        }
        return result;    
    }
}