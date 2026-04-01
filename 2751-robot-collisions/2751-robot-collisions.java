import java.util.*;

class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        int n = positions.length;
        
        // Create indices array and sort by position
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) indices[i] = i;
        Arrays.sort(indices, (a, b) -> positions[a] - positions[b]);
        
        // Stack stores original indices of robots moving right
        Deque<Integer> stack = new ArrayDeque<>();
        int[] health = Arrays.copyOf(healths, n);
        boolean[] removed = new boolean[n];
        
        for (int idx : indices) {
            char dir = directions.charAt(idx);
            
            if (dir == 'R') {
                // Moving right, push to stack
                stack.push(idx);
            } else {
                // Moving left, check for collisions with right-moving robots
                while (!stack.isEmpty()) {
                    int topIdx = stack.peek();
                    
                    if (health[topIdx] > health[idx]) {
                        // Right-moving robot wins
                        health[topIdx]--;
                        removed[idx] = true;
                        break;
                    } else if (health[topIdx] < health[idx]) {
                        // Left-moving robot wins
                        health[idx]--;
                        removed[topIdx] = true;
                        stack.pop();
                        // Continue checking next right-moving robot
                    } else {
                        // Both removed (equal health)
                        removed[topIdx] = true;
                        removed[idx] = true;
                        stack.pop();
                        break;
                    }
                }
            }
        }
        
        // Collect survivors in original order
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!removed[i]) {
                result.add(health[i]);
            }
        }
        
        return result;
    }
}