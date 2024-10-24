public class LIS_optimized {
    public static int lengthOfLIS(int[] nums) {
        int [] num = new int[nums.length] ;
        num[0] = Integer.MIN_VALUE ;
        for (int i = 0 ; i < nums.length ; i++)
            num[i+1] = nums[i] ;

        int [][] dp = new int[num.length][num.length] ;
        return helper(nums,0,1);
    }


    private static int helper(int[] nums , int i , int j ){

    }
}
