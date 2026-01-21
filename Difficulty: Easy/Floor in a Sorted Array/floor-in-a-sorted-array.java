class Solution {
    public int findFloor(int[] arr, int x) {
        // code here
        int n=arr.length;
        int left=0,right=n-1;
        int answer=-1;
        while(left<=right)
        {
            int mid=(left+right)/2;
            if(arr[mid]<=x)
            {
                answer=mid;
                left=mid+1;
            }
            else{
                right=mid-1;
            }
            mid=(left+right)/2;
        }
        return answer;
    }
}