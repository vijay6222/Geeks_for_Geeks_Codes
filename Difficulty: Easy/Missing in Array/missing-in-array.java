class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length +1;
        long sum = n*(n+1)/2;
        long arryaSum = 0;
        
        for(int ele : arr)
        {
            arryaSum +=ele;
        }
        
        return (int)(sum - arryaSum);
    }
}

