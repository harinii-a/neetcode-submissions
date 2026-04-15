class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[] = new int[nums.length * 2];
        int start=0,i = 0;
        int end = nums.length -1;
        int j=  arr.length-1;
        while(start<nums.length){
            arr[i] = nums[start];
            arr[j] = nums[end];
            end--;
            j--;
            i++;
            start++;
        }

        return arr;
        
    }
}