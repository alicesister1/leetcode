class Solution {
    int insertIndex = -1;
    public int searchInsert(int[] nums, int target) {
        int result = search(nums, target);
        return (result != -1) ? result : insertIndex;
    }
    
    int search(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;

        while(low <= high) {
            mid = (low + high) / 2;
            // System.out.println(String.format("mid: %d", mid));

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target) {
                insertIndex = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
                insertIndex = low;
            }
        }
        
        
        // insertIndex = mid;
        return -1;
    }
}