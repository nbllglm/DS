package Mine;

public class Node<T> {
    //元素
    public T item;
    //下个节点
    public Node<T> preNode;
    //下个节点
    public Node<T> nextNode;

    public Node(T item, Node<T> preNode, Node<T> nextNode) {
        this.item = item;
        this.preNode = preNode;
        this.nextNode = nextNode;
    }

    public Node(T item, Node<T> nextNode) {
        this.item = item;
        this.nextNode = nextNode;
    }
}
