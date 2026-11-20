
public class Main {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            return buildTree(nums, 0, nums.length - 1);
        }

        private TreeNode buildTree(int[] nums, int left, int right) {

            if (left > right) {
                return null;
            }

            int mid = left + (right - left) / 2;

            TreeNode root = new TreeNode(nums[mid]);

            root.left = buildTree(nums, left, mid - 1);
            root.right = buildTree(nums, mid + 1, right);

            return root;
        }
    }

    public static void printTree(TreeNode root) {

        if (root == null) {
            System.out.println("[]");
            return;
        }

        java.util.Queue<TreeNode> queue =
                new java.util.LinkedList<>();

        java.util.List<String> result =
                new java.util.ArrayList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            TreeNode current = queue.poll();

            if (current == null) {
                result.add("null");
                continue;
            }

            result.add(String.valueOf(current.val));

            if (current.left != null || current.right != null) {
                queue.add(current.left);
                queue.add(current.right);
            }
        }

        while (!result.isEmpty() &&
                result.get(result.size() - 1).equals("null")) {
            result.remove(result.size() - 1);
        }

        System.out.println(result);
    }

    public static void main(String[] args) {

        int[] nums = {-10, -3, 0, 5, 9};

        Solution solution = new Solution();

        TreeNode result = solution.sortedArrayToBST(nums);

        System.out.print("Output: ");
        printTree(result);
    }
}
