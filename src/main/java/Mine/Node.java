package Mine;

public class Node<T> {
    //Ԫ��
    public T item;
    //�¸��ڵ�
    public Node<T> preNode;
    //�¸��ڵ�
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
