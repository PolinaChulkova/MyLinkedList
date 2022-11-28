public class MyLinkedList<E> {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size;

    public MyLinkedList() {
    }

    public void addLast(E data) {
        Node<E> newNode = new Node<E>(data);
        if (size == 0) {
            firstNode = newNode;
            lastNode = firstNode;
        } else {
            newNode.setPrev(lastNode);
            lastNode.setNext(newNode);
            lastNode = newNode;
        }
        size++;
    }

    public void add(int index, E data) {
         Node<E> newElement = new Node<>(data);
         Node<E> nextNode = searchNode(index);
         newElement.setPrev(nextNode.getPrev());
         newElement.setNext(nextNode);
         size++;
    }

    public void remove(int index) {
        Node<E> delete = searchNode(index);
        Node<E> prev = delete.getPrev();
        Node<E> next = delete.getNext();
        prev.setNext(next);
        next.setPrev(prev);
        size--;
    }

    public void removeLast() {
        Node<E> prev = lastNode.getPrev();
        prev.setNext(null);
        lastNode.setPrev(null);
        lastNode = prev;
        size--;
    }

    public E getElementByIndex(int index) {
        return searchNode(index).getData();
    }

    public Node<E> searchNode(int index) {
        Node<E> target = firstNode;
        for (int i = 0; i < index; i++) {
            target = firstNode.getNext();
        }
        return target;
    }

    public class Node<E> {

        private E data;
        private Node<E> prev;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node=" + data;
        }
    }

    public Node<E> getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node<E> firstNode) {
        this.firstNode = firstNode;
    }

    public Node<E> getLastNode() {
        return lastNode;
    }

    public void setLastNode(Node<E> lastNode) {
        this.lastNode = lastNode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
