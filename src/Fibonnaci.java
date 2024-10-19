public class Fibonnaci{
//time complexity O(n)
    public int Solution (int n ){


        if (n==0) return 0 ; 
        if (n==1) return 1 ; 

        int[] nums = new int[31] ;
        nums[0] = 0; 
        nums[1] = 1 ; 

        for ( int i = 2 ; i <= n ; i++)
            nums[i] = nums[i-1] + nums[i-2] ;

        return nums[n] ;
    }

}