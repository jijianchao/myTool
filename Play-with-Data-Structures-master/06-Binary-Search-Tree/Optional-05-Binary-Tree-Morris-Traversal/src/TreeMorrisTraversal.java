import java.util.LinkedList;
import java.util.Queue;

public class TreeMorrisTraversal {


    public static void main(String[] args) {

    }


    private TreeNode queueMorris(TreeNode node) {

        Queue<TreeNode> queue = new LinkedList();
        queue.add(node);

        while (!queue.isEmpty()) {
            TreeNode n = queue.poll();
            TreeNode temp = n.left;
            n.left=n.right;
            n.right = temp;

            if (null != n.left) {
                queue.add(n.left);
            }
            if (null != n.right) {
                queue.add(n.right);
            }

        }
        return node;


    }


    private TreeNode recursionMorris(TreeNode node) {

        if (node == null) {
            return null;
        }
        node.left = recursionMorris(node.left);
        node.right = recursionMorris(node.right);

        TreeNode temp = node.right;
        node.right = node.left;
        node.left = temp;
        return node;
    }





}
