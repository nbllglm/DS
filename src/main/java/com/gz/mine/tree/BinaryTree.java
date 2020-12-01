package com.gz.mine.tree;

import com.gz.mine.list.Node;
import com.gz.mine.list.queue.Queue;

public class BinaryTree<K extends Comparable<K>, V> {
    private TreeNode<K, V> root = null;
    public int N = 0;
    public int du;
    public int ceng;

    public static void main(String[] args) {
        BinaryTree<String, String> binaryTree = new BinaryTree<>();
//        TreeNode<String, String> treeNode1 = new TreeNode<>("E", "a");
//        TreeNode<String, String> treeNode2 = new TreeNode<>("B", "a");
//        TreeNode<String, String> treeNode3 = new TreeNode<>("A", "a");
//        TreeNode<String, String> treeNode4 = new TreeNode<>("D", "a");
//        TreeNode<String, String> treeNode5 = new TreeNode<>("C", "a");
//        TreeNode<String, String> treeNode6 = new TreeNode<>("G", "a");
//        TreeNode<String, String> treeNode7 = new TreeNode<>("F", "a");
//        TreeNode<String, String> treeNode8 = new TreeNode<>("H", "a");

        TreeNode<String, String> treeNode1 = new TreeNode<>("E", "a");
        TreeNode<String, String> treeNode2 = new TreeNode<>("B", "a");
        TreeNode<String, String> treeNode3 = new TreeNode<>("G", "a");
        TreeNode<String, String> treeNode4 = new TreeNode<>("A", "a");
        TreeNode<String, String> treeNode5 = new TreeNode<>("D", "a");
        TreeNode<String, String> treeNode6 = new TreeNode<>("F", "a");
        TreeNode<String, String> treeNode7 = new TreeNode<>("H", "a");
        TreeNode<String, String> treeNode8 = new TreeNode<>("C", "a");

        binaryTree.put1(treeNode1);
        binaryTree.put1(treeNode2);
        binaryTree.put1(treeNode3);
        binaryTree.put1(treeNode4);
        binaryTree.put1(treeNode5);
        binaryTree.put1(treeNode6);
        binaryTree.put1(treeNode7);
        binaryTree.put1(treeNode8);

//        System.out.println(binaryTree.get1("A"));
//        System.out.println(binaryTree.qian());
        System.out.println(binaryTree.zhong());
//        System.out.println(binaryTree.hou());
//        System.out.println(binaryTree.ceng());
        binaryTree.exchange();
        System.out.println(binaryTree.zhong());
//        System.out.println(binaryTree.maxHigh());

    }

    void exchange() {
        exchange(root);
    }

    void exchange(TreeNode<K, V> node) {
        if (node.left == null && node.right == null) {
            return;
        }
        TreeNode<K, V> temp = node.left;
        node.left = node.right;
        node.right = temp;
        if (node.left != null) {
            exchange(node.left);
        }
        if (node.right != null) {
            exchange(node.right);
        }
    }


    int maxHigh() {
        return maxHigh1(root);
//        return maxHigh2(root);
    }

    int maxHigh1(TreeNode<K, V> node) {
        int left = 0;
        int right = 0;
        if (node.left != null) {
            left = maxHigh1(node.left);
        }
        if (node.right != null) {
            right = maxHigh1(node.right);
        }
        return Math.max(left, right) + 1;
    }

    int maxHigh2(TreeNode<K, V> node) {
        if (node == null) {
            return 0;
        }
        int max = 0;
        int left = 0;
        int right = 0;

        if (node.left != null) {
            left = maxHigh2(node.left);
        }
        if (node.right != null) {
            right = maxHigh2(node.right);
        }
        max = left > right ? left + 1 : right + 1;
        return max;
    }


    String ceng() {
        String str = "";
        Queue<K> queue = new Queue<>();
        Node<K> node = new Node<K>(root.key);
        queue.in(node);
        str = ceng(queue, str);
        return str;
    }

    String ceng(Queue<K> queue, String str) {
        Node<K> node = queue.out();
        if (node == null) {
            return str;
        }
        TreeNode<K, V> treeNode = get1(node.item);
        if (treeNode == null) {
            return str;
        }
        str += treeNode.key;
        if (treeNode.left != null) {
            Node<K> left = new Node<K>(treeNode.left.key);
            queue.in(left);
        }
        if (treeNode.right != null) {
            Node<K> right = new Node<K>(treeNode.right.key);
            queue.in(right);
        }

        str = ceng(queue, str);

        return str;
    }


    String qian() {
        String str = qian(root, "");
        return str;
    }

    String qian(TreeNode<K, V> node, String str) {
        str = node.key + "";
        if (node.left != null) {
            str += qian(node.left, str);
        }
        if (node.right != null) {
            str += qian(node.right, str);
        }
        return str;
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

    String hou() {
        String str = hou(root, "");
        return str;
    }

    String hou(TreeNode<K, V> node, String str) {
        if (node.left != null) {
            str = hou(node.left, str);
        }

        if (node.right != null) {
            str = hou(node.right, str);
        }
        str += node.key;
        return str;
    }

    public void put(TreeNode<K, V> treeNode) {
        if (N == 0) {
            root = treeNode;
            N++;
        } else {
            TreeNode<K, V> node = root;
            K key = treeNode.key;
            while (node.left != null || node.right != null) {
                if (key.compareTo(node.key) < 0) {
                    if (node.left != null) {
                        node = node.left;
                    } else {
                        break;
                    }
                } else if (key.compareTo(node.key) > 0) {
                    if (node.right != null) {
                        node = node.right;
                    } else {
                        break;
                    }
                } else {
                    node.value = treeNode.value;
                    return;
                }
            }
            if (key.compareTo(node.key) < 0) {
                node.left = treeNode;
            } else if (key.compareTo(node.key) > 0) {
                node.right = treeNode;
            }
            N++;
        }
    }

    public TreeNode<K, V> get(K key) {
        TreeNode<K, V> node = root;
        while (node.left != null || node.right != null) {
            if (key.compareTo(node.key) < 0) {
                if (node.left != null) {
                    node = node.left;
                }
                if (key.compareTo(node.key) == 0) {
                    return node;
                }

            } else if (key.compareTo(node.key) > 0) {
                if (node.right != null) {
                    node = node.right;
                }
                if (key.compareTo(node.key) == 0) {
                    return node;
                }
            } else {
                return node;
            }
        }
        return null;
    }


    void put1(TreeNode<K, V> treeNode) {
        root = put1(root, treeNode);
    }

    TreeNode<K, V> put1(TreeNode<K, V> targetNode, TreeNode<K, V> treeNode) {
        if (targetNode == null) {
            targetNode = treeNode;
            N++;
        } else {
            K key = treeNode.key;
            if (key.compareTo(targetNode.key) == 0) {
                targetNode.value = treeNode.value;
            } else if (key.compareTo(targetNode.key) > 0) {
                targetNode.right = put1(targetNode.right, treeNode);
            } else {
                targetNode.left = put1(targetNode.left, treeNode);
            }
        }
        return targetNode;
    }


    TreeNode<K, V> get1(K key) {
        return get1(root, key);
    }

    TreeNode<K, V> get1(TreeNode<K, V> node, K key) {
        if (node != null) {
            int k = key.compareTo(node.key);
            if (k == 0) {
                return node;
            } else if (k > 0) {
                return get1(node.right, key);
            } else {
                return get1(node.left, key);
            }
        }
        return null;
    }


    public TreeNode<K, V> delete(K key) {
        TreeNode<K, V> node = get1(key);
        TreeNode<K, V> left = node.left;
        TreeNode<K, V> right = node.right;
        TreeNode<K, V> min = findMin(node);
        min.left = left;
        min.right = right;
        return node;
    }


    TreeNode<K, V> findMin(TreeNode<K, V> targetNode) {
        while (targetNode.left != null) {
            targetNode = targetNode.left;
        }
        TreeNode<K, V> node = targetNode;
        targetNode = null;
        return node;
    }


    public int Size() {
        return N;
    }

}
