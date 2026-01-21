class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        int k = d % n;
        
        int[] temp = new int[k];
        
        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }
        
        for(int i=k;i<n;i++){
            arr[i-k] = arr[i];
        }
        
        for(int i=n-k;i<n;i++){
            arr[i] = temp[i-(n-k)];
        }
    }
}

