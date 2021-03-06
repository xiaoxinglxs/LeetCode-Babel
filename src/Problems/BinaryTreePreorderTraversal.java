package Problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * 给定一个二叉树，返回它的 前序 遍历。
 *
 */

public class BinaryTreePreorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    private List<Integer> result;
    public List<Integer> preorderTraversal(TreeNode root) {
        result = new LinkedList<>();
        pre(root);
        return result;
    }

    private void pre(TreeNode root){
        if(root == null){
            return;
        }
        result.add(root.val);
        pre(root.left);
        pre(root.right);
    }

    //非递归写法
    public List<Integer> preorderTraversal2(TreeNode root){
        LinkedList<Integer> result = new LinkedList<>();
        if(root == null){
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curNode = stack.pop();
            //出栈后加入结果顺序：root、left、right
            result.add(curNode.val);
            if(curNode.right != null){
                stack.push(curNode.right);
            }
            if(curNode.left != null){
                stack.push(curNode.left);
            }
        }
        return result;
    }
}
