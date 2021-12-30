class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0; 
        int count = 1;
        int[] copy = new int[nums.length -1];
        copy[0] = nums[0];
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1]){
                copy[count] = nums[i + 1];
                count++;
            } 
        }
        nums = copy;
        return count;
    }
}
