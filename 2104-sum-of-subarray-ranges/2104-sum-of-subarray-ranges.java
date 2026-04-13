class Solution {
  public long subArrayRanges(int[] nums) {
    int n = nums.length;

    int[] prevL = new int[n], nextL = new int[n];
    int[] prevG = new int[n], nextG = new int[n];

    Stack<Integer> s = new Stack<>();

    //  Previous Smaller
    for (int i = 0; i < n; i++) {
        while (!s.isEmpty() && nums[s.peek()] > nums[i]) {
            s.pop();
        }
        prevL[i] = s.isEmpty() ? i + 1 : i - s.peek();
        s.push(i);
    }

    s.clear();

    //  Next Smaller
    for (int i = n - 1; i >= 0; i--) {
        while (!s.isEmpty() && nums[s.peek()] >= nums[i]) {
            s.pop();
        }
        nextL[i] = s.isEmpty() ? n - i : s.peek() - i;
        s.push(i);
    }

    s.clear();

    //  Previous Greater
    for (int i = 0; i < n; i++) {
        while (!s.isEmpty() && nums[s.peek()] < nums[i]) {
            s.pop();
        }
        prevG[i] = s.isEmpty() ? i + 1 : i - s.peek();
        s.push(i);
    }

    s.clear();

    //  Next Greater
    for (int i = n - 1; i >= 0; i--) {
        while (!s.isEmpty() && nums[s.peek()] <= nums[i]) {
            s.pop();
        }
        nextG[i] = s.isEmpty() ? n - i : s.peek() - i;
        s.push(i);
    }

    long sum = 0;

    for (int i = 0; i < n; i++) {
        long max = (long) nums[i] * prevG[i] * nextG[i];
        long min = (long) nums[i] * prevL[i] * nextL[i];
        sum += (max - min);
    }

    return sum;
}
}