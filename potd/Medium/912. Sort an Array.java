class Solution {
    public void merge(int[] A, int start, int mid, int end, int[] buff) {
        int left = start, right = mid + 1;
        int s = end - start + 1;
        
        for (int i = 0; i < s; i++) {
            int i0 = start + i;
            if (left > mid) {
                buff[i0] = A[right];
                right++;
            } else if (right > end) {
                buff[i0] = A[left];
                left++;
            } else if (A[left] < A[right]) {
                buff[i0] = A[left];
                left++;
            } else {
                buff[i0] = A[right];
                right++;
            }
        }
        
        for (int i = start; i < start + s; i++) {
            A[i] = buff[i];
        }
    }

    public void mergeSort(int[] A, int start, int end, int[] buff) {
        if (end <= start) {
            return;
        }
        
        int mid = start + (end - start) / 2;
        mergeSort(A, start, mid, buff);
        mergeSort(A, mid + 1, end, buff);
        merge(A, start, mid, end, buff);
    }

    public int[] sortArray(int[] nums) {
        int[] buff = new int[nums.length];
        mergeSort(nums, 0, nums.length - 1, buff);
        return nums;
    }
}
