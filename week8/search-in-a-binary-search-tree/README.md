Search in a Binary Search Tree

Problem description:
We are given a binary search tree and an integer val. 
We need to find the node that has the same value as val and return the subtree starting from this node.
If the value is not found, we return null.

Example:
Input: root = [4, 2, 7, 1, 3], val = 2
Output: [2, 1, 3]

How my algorithm works:
I used recursion to solve this problem.
First, I check if the current node is null. If it is null, I return null because the value was not found.
Then I compare the current node's value with the target value.
If both values are equal, I return the current node.
If the target value is smaller, I search in the left subtree.
If the target value is greater, I search in the right subtree.
I repeat these steps until I find the value or reach null.

Time complexity:
The time complexity is O(h), where h is the height of the tree.
Best case: O(1), when the value is at the root.
Average case: O(log n), when the tree is balanced.
Worst case: O(n), when the tree is unbalanced.
The reason is that at every step I search only in one direction, either left or right. I don't need to check all the nodes.

Space complexity:
The space complexity is O(h) because I use recursion, and every recursive call takes some space in the call stack.
The printTree() method uses O(n) additional space because it stores the nodes in a queue and a list.

Possible improvement:
I can also solve this problem using a while loop instead of recursion. It would have the same time complexity, 
but the search would use O(1) additional space because there would be no recursive calls.

Conclusion:
This problem helped me understand how a binary search tree works. 
I learned that I don't need to check every node because I can compare values and choose the correct side of the tree. 
This makes searching easier and faster.
