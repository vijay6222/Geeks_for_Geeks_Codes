class Solution:    
    def minPlatform(self, arr, dep):
        count=0
        arr.sort()
        dep.sort()
        k=0
        for i in range(len(arr)):
            if arr[i]<=dep[k]:
                count+=1
            else:
                k+=1
        return count