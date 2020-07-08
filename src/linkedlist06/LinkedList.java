package linkedlist06;

public class LinkedList<T extends Comparable<T>> implements List {

    private Node<T> root;
    private int sizeOfList;


    @Override
    public void insert(Object data) {
        this.sizeOfList++;
        if (root == null) {
            root = new Node<T>((T) data);
        } else {
            insertDataAtBeginning(data);
        }
    }

    // O(1)
    private void insertDataAtBeginning(Object data) {
        Node<T> newNode = new Node<T>((T) data);
        newNode.setNextNode(root);
        root = newNode;

    }

    private void insertDataAtEnd(T data, Node<T> node) {
        if (node.getNextNode() != null) {
            insertDataAtEnd(data, node.getNextNode());
        } else {
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }

    }

    @Override
    public void remove(Object data) {

        if (this.root == null) {
            return;
        }
        --this.sizeOfList;
        if (this.root.getData().compareTo((T) data) == 0) {
            this.root = root.getNextNode();
        } else {
            remove((T) data, root, root.getNextNode());
        }
    }

    private void remove(T dataRemove, Node<T> previousNode, Node actualNode) {

        while (actualNode != null) {
            if (actualNode.getData().compareTo(dataRemove) == 0) {
                previousNode.setNextNode(actualNode.getNextNode());
                actualNode = null;
                return;
            }
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public void traverseList() {

        if (this.root == null) return;
        Node<T> actualNode = this.root;
        while (actualNode != null){
            System.out.print(actualNode+ "->");
            actualNode = actualNode.getNextNode();

        }


    }

    @Override
    public int size() {
        return this.sizeOfList;
    }
}
