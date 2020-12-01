package com.gz.mine.list.stack;

import com.gz.mine.list.Node;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stack<T> {
    public static void main(String[] args) throws InterruptedException {
        Stack<String> stack_ = new Stack<>();
//        stack_gz.push(new Node<Integer>(1, null));
//        stack_gz.push(new Node<Integer>(2, null));
//        stack_gz.push(new Node<Integer>(3, null));
//        stack_gz.push(new Node<Integer>(4, null));
//        stack_gz.toString();
//        System.out.println(stack_gz.out());
//        stack_gz.toString();
//        System.out.println(stack_gz.out());
//        stack_gz.toString();
//        System.out.println(stack_gz.out());
//        stack_gz.toString();
//        System.out.println(stack_gz.out());
//        stack_gz.toString();
//        System.out.println(")(()");

        //System.out.println(stack_gz.isMatch(stack_gz.toStack("(((aa()aa)")));
        String[] asd = {"3", "17", "15", "-", "*", "18", "6", "/", "+"};//9
        //String[] asd = {"6", "3", "+"};//9
        System.out.println(stack_.niBoLan(asd));
    }

    public Node<T> down;

    public int N;

    public Stack() {
        this.down = new Node(null, null);
        N = 0;
    }

    public void push(Node<T> node) {

        if (down.nextNode == null) {
            down.nextNode = node;
        } else {
            Node<T> n = down;
            while (n.nextNode != null) {
                n = n.nextNode;
            }
            n.nextNode = node;
        }
        N++;
    }

    public Node<T> out() {
        Node<T> next = null;
        Node<T> n = down;
        while (n.nextNode != null) {
            if (n.nextNode.nextNode == null) {
                next = new Node<T>(n.nextNode.item, n.nextNode.nextNode);
                n.nextNode = null;
                N--;
                break;
            }
            n = n.nextNode;
        }
        return next;
    }

    public boolean isMatch(Stack<T> stack_) {
        int count = 0;
        while (stack_.N > 0) {
            Node<T> node = stack_.out();
            if (node != null) {
                if ("(".equals(node.item)) {
                    count -= 1;
                } else if (")".equals(node.item)) {
                    count += 1;
                }
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }

    @Override
    public String toString() {
        String str = "( ";
        Node<T> node = down.nextNode;
        while (node != null) {
            str = str + node + "  ";
            node = node.nextNode;
        }
        str += ")";
        System.out.println(str);
        return str;

    }

    Stack<Character> toStack(String s) {
        Stack<Character> stringStack_ = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stringStack_.push(new Node<Character>(chars[i], null));
        }
        return stringStack_;
    }

    int niBoLan(String[] strings) throws InterruptedException {
        int temp = 0;
        while (strings.length > 1) {
            int index = 0;
            for (int i = 0; i < strings.length; i++) {
                if (isZiFu(strings[i])) {
                    index = i;
                    break;
                }
            }
            System.out.println(Arrays.toString(strings));
            temp = operate(strings[index], Integer.valueOf(strings[index - 2]), Integer.valueOf(strings[index - 1]));
            strings = newStrings(strings, temp, index);
        }
        return temp;
    }

    String[] newStrings(String[] strings, int temp, int index) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < index - 2; i++) {
            list.add(strings[i]);
        }
        list.add(temp + "");
        for (int j = index + 1; j < strings.length; j++) {
            list.add(strings[j]);
        }
        String[] strings1 = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strings1[i] = list.get(i);
        }

        return strings1;
    }

    boolean isZiFu(String c) {
        return (c.getBytes()[0] >= 42 && c.getBytes()[0] <= 47);
    }

    int operate(String s, int a, int b) throws ArithmeticException {
        int result;
        char fu = s.charAt(0);
        switch (fu) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                throw new ArithmeticException(fu + "非法符号");
        }
        return result;
    }
}
