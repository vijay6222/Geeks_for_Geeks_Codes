class Solution {
    int majorityElement(int arr[])
    {
       HashMap<Integer,Integer> majority = new HashMap<>();
       for(int a : arr)
       {
           majority.put(a,majority.getOrDefault(a,0)+1);
           
           if(majority.get(a)>arr.length/2)
           {
               return a;
           }
       }
       return -1;
      
    }
}