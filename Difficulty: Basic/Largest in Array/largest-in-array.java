class Solution {
    public static int largest(int[] arr) {
        int n=arr.length;
        
        int maxi=Integer.MIN_VALUE;
        
        for (int i=0; i<n; i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
    
}