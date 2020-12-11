package com.gz.ds.tree.avl;

import com.gz.ds.tree.TreeNode;

/**
 * 左旋红黑树
 *
 * @param <K>
 * @param <V>
 */
public class RedBlackTree<K extends Comparable<K>, V> {
    public TreeNode<K, V> root;
    public int N;

    public static void main(String[] args) {
        RedBlackTree<String, String> redBlackTree = new RedBlackTree<>();
        TreeNode<String, String> treeNode1 = new TreeNode<>("A", "");
        TreeNode<String, String> treeNode2 = new TreeNode<>("B", "");
        TreeNode<String, String> treeNode3 = new TreeNode<>("C", "");
        TreeNode<String, String> treeNode4 = new TreeNode<>("D", "");
        redBlackTree.put(treeNode1);
        redBlackTree.put(treeNode2);
        redBlackTree.put(treeNode3);
        redBlackTree.put(treeNode4);
        System.out.println(redBlackTree.zhong());
    }

    public RedBlackTree() {
        root = new TreeNode<>(null, null);
        root.isRed = false;

    }

    //当某个结点的左边为黑色节点，右边为红色节点，此时需要左旋（红色只能存在在左边）
    public boolean isNeedTurnLeft(TreeNode<K, V> node) {
        if (node.right != null) {
            if (node.left != null) {
                return (!node.left.isRed && node.right.isRed);
            } else {
                return (node.right.isRed);
            }
        }
        return false;
    }

    public TreeNode<K, V> turnLeft(TreeNode<K, V> node) {
        TreeNode<K, V> nodeA = node;
        TreeNode<K, V> nodeB = node.right;
        nodeA.right = nodeB.left;
        boolean temp = nodeA.isRed;
        nodeA.isRed = nodeB.isRed;
        nodeB.isRed = temp;
        nodeB.left = nodeA;
        return nodeB;
    }

    //当某个节点的左子节点为红色，左子节点的左子节点也为红色（两个红色不能练成斜线）
    public boolean isNeedTurnRight(TreeNode<K, V> node) {
        if (node.left == null || node.left.left == null) {
            return false;
        }
        if (node.left.isRed && node.left.left.isRed) {
            return true;
        }
        return false;
    }

    public TreeNode<K, V> turnRigt(TreeNode<K, V> node) {
        TreeNode<K, V> nodeB = node.left;
        TreeNode<K, V> nodeA = nodeB.left;
        nodeB.left = nodeA.right;
        boolean temp = nodeB.isRed;
        nodeB.isRed = nodeA.isRed;
        nodeA.isRed = temp;
        nodeA.right = nodeB;
        return nodeA;
    }

    //当某个父节点的左右子节点均为红色，需要颜色反转
    public boolean isNeedFlip(TreeNode<K, V> node) {
        if (node.right != null) {
            if (node.left != null) {
                return (node.left.isRed && node.right.isRed);
            }
        }
        return false;
    }

    public TreeNode<K, V>  flip(TreeNode<K, V> node) {
        node.left.isRed = false;
        node.right.isRed = false;
        node.isRed = true;
        return node;
    }

    //插入
    public void put(TreeNode<K, V> node) {
        if (N == 0) {
            root.key = node.key;
            root.value = node.value;
            N++;
        } else {
            root = put(root, node);
        }
        root.isRed = false;
    }

    public TreeNode<K, V> put(TreeNode<K, V> target, TreeNode<K, V> node) {
        if (target == null) {
            N++;
            return node;
        }
        int x = node.key.compareTo(target.key);
        if (x > 0) {
            target.right = put(target.right, node);
        } else if (x < 0) {
            target.left = put(target.left, node);
        } else {
            target.value = node.value;
        }
        if (isNeedTurnLeft(target)) {
            target = turnLeft(target);
        }
        if (isNeedTurnRight(target)) {
            target = turnRigt(target);
        }
        if (isNeedFlip(target)) {
            target = flip(target);
        }
        return target;
    }

    //查找
    public V get(K k) {
        V v = get(root, k);
        return v;
    }

    public V get(TreeNode<K, V> node, K k) {
        int x = k.compareTo(node.key);
        if (x == 0) {
            return node.value;
        } else {
            if (x > 0) {
                if (node.right != null) {
                    return get(node.right, k);
                }
            } else {
                if (node.left != null) {
                    return get(node.left, k);
                }
            }
        }
        return null;
    }

    //返回长度
    public int size() {
        return N;
    }

    String zhong() {
        String str = zhong(root, "");
        return str;
    }

    String zhong(TreeNode<K, V> node, String str) {
        if (node.left != null) {
            str = zhong(node.left, str);
        }
        str += node.key;
        if (node.right != null) {
            str = zhong(node.right, str);
        }
        return str;
    }
}
