/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    private TreeNode root;

    private void insertHelper(TreeNode current, int value) {
        TreeNode node = new TreeNode(value);
        if (value == current.getData()) {
            return;
        } else if (value < current.getData()) {
            if (current.getLeftChild() == null) {
                //System.out.println("New Node inserted");
                current.setLeftChild(node);
                node.setParent(current);
            } else {
                insertHelper(current.getLeftChild(), value);
            }
        } else {
            if (current.getRightChild() == null) {
                //System.out.println("New Node inserted");
                current.setRightChild(node);
                node.setParent(current);
            } else {
                insertHelper(current.getRightChild(), value);
            }
        }
        return;
    }
}
