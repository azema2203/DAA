Range Sum of BST

Problem description:
We are given a binary search tree and two integers, low and high. 
We need to find the sum of all node values that are between low and high, including both limits.

Example:
Input: root = [10, 5, 15, 3, 7, null, 18], low = 7, high = 15
Output: 32
Explanation: The values that are in the given range are 7, 10 and 15. Their sum is 32.

How my algorithm works:
I used recursion to solve this problem.
First, I check if the current node is null. If it is null, I return 0 because there is nothing to add.
Then I check if the current node's value is inside the range. If it is between low and high, I add it to the sum.
After that, I check which side of the tree I need to search:
If the current value is greater than low, I search in the left subtree.
If the current value is smaller than high, I search in the right subtree.
I use these conditions because the tree is a Binary Search Tree, so I can skip some nodes that cannot be inside the range.
Finally, I return the total sum.

Time complexity:
The time complexity is O(n) in the worst case, where n is the number of nodes in the tree.
This is because in the worst case I may need to visit every node. 
However, sometimes the algorithm can be faster because it skips subtrees that cannot contain values in the given range.

Space complexity:
The space complexity is O(h), where h is the height of the tree. 
This is because I use recursion, and every recursive call takes space in the call stack.

Possible improvement:
I used the BST structure to avoid checking unnecessary nodes. 
We can also use an iterative approach with a stack instead of recursion. 
This would avoid recursive calls and use O(h) additional space in the worst case.

Conclusion:
This problem helped me understand how to use the Binary Search Tree structure to find values in a specific range. 
I learned that I can skip some parts of the tree instead of checking every node, which makes the algorithm more efficient in many cases.
