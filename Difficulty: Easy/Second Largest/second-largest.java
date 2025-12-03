class Solution {
    public static int getSecondLargest(int[] arr) {
        if (arr.length < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest; // previous largest becomes 2nd largest
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        System.out.println(getSecondLargest(arr1)); // Output: 34

        int[] arr2 = {10, 10, 10};
        System.out.println(getSecondLargest(arr2)); // Output: -1

        int[] arr3 = {5};
        System.out.println(getSecondLargest(arr3)); // Output: -1
    }
}
