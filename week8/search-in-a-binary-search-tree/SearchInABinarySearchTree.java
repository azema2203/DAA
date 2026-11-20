
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
        public TreeNode searchBST(TreeNode root, int val) {

            if (root == null) {
                return null;
            }

            if (root.val == val) {
                return root;
            }

            if (val < root.val) {
                return searchBST(root.left, val);
            }

            return searchBST(root.right, val);
        }
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");

        java.util.Queue<TreeNode> queue =
                new java.util.LinkedList<>();

        queue.add(root);

        java.util.List<String> result =
                new java.util.ArrayList<>();

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

        while (result.size() > 0 &&
                result.get(result.size() - 1).equals("null")) {
            result.remove(result.size() - 1);
        }

        System.out.print(String.join(", ", result));
        System.out.println("]");
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int val = 2;

        Solution solution = new Solution();
        TreeNode result = solution.searchBST(root, val);

        System.out.print("Output: ");
        printTree(result);
    }
}
