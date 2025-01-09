/*
🔹 Problem No: 1 / 200

⚖️ Problem: [Binary Search](https://leetcode.com/problems/binary-search/)

🧠 Intuition and Approach:
- Brute Force: Linear search through the array to find the target element, which takes O(n) time.
- Optimal Approach: Use Binary Search to divide the array into halves and reduce the search space efficiently. Compare the middle element with the target and adjust the search boundaries accordingly.

⌛ Time Complexity: O(log n)
📝 Space Complexity: O(1) (iterative approach) / O(log n) (recursive approach)

🌐 HashTags: #200DaysOfCode #DSA #BinarySearch #LeetCode #CodingChallenge #InterviewPreparation

✉️ Connect with me: [www.linkedin.com/in/shreyanshsokal](www.linkedin.com/in/shreyanshsokal)

💪 Let's keep this journey going! 🚀
*/

//Code

class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;

        while(low <= high)
        {
            int mid = (low+high)/2;

            System.out.println(nums[mid] + " " + mid);

            if(nums[mid] == target)return mid;
            else if(nums[mid] < target)low = mid+1;
            else high = mid-1;
        }
        return -1;
    }
}
