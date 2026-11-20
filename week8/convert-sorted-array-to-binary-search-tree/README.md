Convert Sorted Array to Binary Search Tree

Problem description:
We are given an integer array nums sorted in ascending order. 
We need to convert this array into a height-balanced Binary Search Tree.
A height-balanced tree means that the heights of the left and right subtrees of every node differ by no more than 1.

Example:
Input: nums = [-10, -3, 0, 5, 9]
Output: [0, -10, 5, null, -3, null, 9]

How my algorithm works:
I used recursion to solve this problem.
First, I find the middle element of the array and make it the root of the tree.
Then I divide the array into two parts:
The left part contains smaller values, which will become the left subtree.
The right part contains greater values, which will become the right subtree.
I repeat the same process for both parts until there are no elements left.
If the left index becomes greater than the right index, I return null because there are no elements to add.
I also created a separate buildTree() method to build the tree using recursion.

Time complexity:
The time complexity is O(n), where n is the number of elements in the array.
This is because I visit every element exactly once and create one node for each element.

Space complexity:
The additional space complexity is O(log n) because the tree is balanced, 
so the maximum number of recursive calls is proportional to the height of the tree.
The tree itself requires O(n) space to store all its nodes.

Possible improvement:
The solution is already efficient because every element must be used to create the tree. 
We cannot reduce the O(n) time complexity because we need to process all elements.

Conclusion:
This problem helped me understand how recursion can be used to create a Binary Search Tree.
I learned that choosing the middle element as the root helps keep the tree balanced. 
Then I repeat the same process for the left and right parts of the array.
