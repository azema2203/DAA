class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        buildPath(root, "", result);
        return result;
    }
    
    private void buildPath(TreeNode node, String path, List<String> result) {
        if (node == null) {
            return;
        }
        path = path.isEmpty() ? String.valueOf(node.val) : path + "->" + node.val;
        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }
        buildPath(node.left, path, result);
        buildPath(node.right, path, result);
    }
}