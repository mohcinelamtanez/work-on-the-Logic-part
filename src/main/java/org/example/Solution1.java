package org.example;

/**
 * @author USER
 **/
public class Solution1 {

   // pattern : Sliding window  ( subarray , substring , contiguous elements , consecutive elements )

   // Probleme : maximum sum subarray of size k ; [ 2 , 8 ,4 , 6, 8 , 10] => [ 6 , 8 , 10 ]  3

    public  static int maxSumSubArrayOfSizek( int[] nums , int k ) {

        int currentSum =  0 ;

        for( int i = 0 ; i<k ; i++) {
            currentSum += nums[i] ;
        }

        int maxSum = currentSum ;

        int left = 0 ;
        int right = k ;

        while(right < nums.length ) {

            currentSum -= nums[left]  ;
            currentSum += nums[right] ;

            if(currentSum > maxSum) {
                maxSum = currentSum ;
            }

            left++ ;
            right++ ;
        }
        return maxSum  ;
    }

}
