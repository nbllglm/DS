package com.gz.mine.list.Linklist;

import com.gz.mine.list.Node;

public class FastFlow {
    public static void main(String[] args) {
        Node<String> n1 = new Node("a", null);
        Node<String> n2 = new Node("b", null);
        Node<String> n3 = new Node("c", null);
        Node<String> n4 = new Node("d", null);
        Node<String> n5 = new Node("e", null);
        Node<String> n6 = new Node("f", null);
        Node<String> n7 = new Node("g", null);
        n1.nextNode = n2;
        n2.nextNode = n3;
        n3.nextNode = n4;
        n4.nextNode = n5;
        n5.nextNode = n6;
        n6.nextNode = n7;
        n7.nextNode = n5;


        FastFlow fastFlow = new FastFlow();
//        if (!isHuan(n1)) {
//            fastFlow.getMid(n1).toString();
//        }
//        System.out.println(isHuan(n1));
        getEntrance(n1).toString();
    }

    <T> Node<T> getMid(Node<T> node) {
        if (node.nextNode == null) {
            return node;
        }
        Node<T> fast = node;
        Node<T> slow = node;
        while (fast.nextNode != null) {
            if (fast.nextNode.nextNode != null) {
                fast = fast.nextNode.nextNode;
            } else {
                fast = fast.nextNode;
            }
            slow = slow.nextNode;
        }
        return slow;
    }

    static <T> boolean isHuan(Node<T> node) {
        if (node.nextNode == null) {
            return false;
        }
        Node<T> fast = node;
        Node<T> slow = node;
        while (fast.nextNode != null) {
            if (fast.nextNode.nextNode != null) {
                fast = fast.nextNode.nextNode;

            } else {
                fast = fast.nextNode;
            }
            slow = slow.nextNode;
            if (fast.item.equals(slow.item)) {
                return true;
            }
        }
        return false;
    }

    static <T> Node<T> getEntrance(Node<T> node) {
        Node<T> fast = node;
        Node<T> slow = node;
        Node<T> temp = null;
        while (fast != null && fast.nextNode != null) {
            if (fast.nextNode.nextNode != null) {
                fast = fast.nextNode.nextNode;
            } else {
                fast = fast.nextNode;
            }
            slow = slow.nextNode;


            if (fast.item.equals(slow.item)) {
                while (!slow.item.equals(temp.item)) {
                    slow = slow.nextNode;
                    temp = temp.nextNode;
                }
                break;
            }

//            if (fast.item.equals(slow.item)) {
//                temp = node;
//                continue;
//            }
//            if (temp != null) {
//                temp = temp.nextNode;
//                if (slow.item.equals(temp.item)) {
//                    break;
//                }
//            }


        }
        return temp;
    }
}
