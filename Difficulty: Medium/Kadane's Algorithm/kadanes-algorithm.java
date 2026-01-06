class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        if(arr.length < 0)
            return 0;
            
        // int result =arr[0];
        // for(int i=0;i<arr.length;i++){
        //     int sum =0;
        //     for(int j=i;j<arr.length;j++){
        //         sum+=arr[j];
        //         if(sum > result){
        //             result = sum;
        //         }
                
        //     }
        // }
        int result = Integer.MIN_VALUE;
        int max = 0;
        for(int start = 0 ; start < arr.length;start++){
            max +=arr[start];
            
            if(max > result ){
                result = max;
            }
            if(max < 0){
                max = 0;
            }
        }
        return result;
    }
}