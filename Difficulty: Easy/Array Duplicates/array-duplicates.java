class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i] == arr[i-1]){
                res.add(arr[i]);
            }
        }
        return res;
    }
}

