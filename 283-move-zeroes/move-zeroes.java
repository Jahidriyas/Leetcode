class Solution {
    public void moveZeroes(int[] nums) {
        int[]num={0,1,0,3,12};
        int j=0;
        for(int i=0;i<nums.length;i++)
         if(nums[i]!=0)
         nums[j++]=nums[i];
         while(j<nums.length)
         nums[j++]=0;
         for(int n: nums) 
         System.out.print(n+"");       
    }
}