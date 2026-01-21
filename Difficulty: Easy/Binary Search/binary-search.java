class Solution {
    public int binarysearch(int[] arr, int k) {
        int lIndx=0;
        int hiIndx=arr.length-1;
        int result=-1;
        while(lIndx<=hiIndx){
            int mid=(lIndx+hiIndx)/2;
            if(k==arr[mid]){
                // System.out.println(mid);
                // break;
                result=mid;
                hiIndx=mid-1;
            
            }
            if(arr[mid]<k){
                lIndx=mid+1;
            }
            else{
                hiIndx=mid-1;
            }
        }
        return result;
    }
}