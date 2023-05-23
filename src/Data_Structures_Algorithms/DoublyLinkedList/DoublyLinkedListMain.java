package Data_Structures_Algorithms.DoublyLinkedList;

class Node {

    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class DoublyLinkedList {
    public int size = 0;
    Node head = null;
    Node tail = null;

    public void addNewNode(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            firstNode(newNode);
        } else {
            lastNode(newNode);
        }
        size++;
    }

    public void firstNode(Node node) {
        head = node;
        tail = node;
        head.prev = null;
        tail.next = null;
    }

    public void lastNode(Node node) {
        tail.next = node;
        node.prev = tail;
        tail = node;
        tail.next = null;
    }

    public void addNodeInBeginning(Node node) {
        head.prev = node;
        node.next = head;
        node.prev = null;
        head = node;
    }

    public void addNodeToSpecifiedPosition(int position, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("The specified location is not available");
        } else {
            if (position == size + 1) {
                lastNode(newNode);
            } else if (position == 1) {
                addNodeInBeginning(newNode);
            } else {
                Node current = head;
                Node temp = null;
                for (int i = 1; i < position - 1; i++) {
                    current = current.next;
                }

                temp = current.next;
                temp.prev = current;

                current.next = newNode;
                newNode.prev = current;
                newNode.next = temp;
                temp.prev = newNode;
            }
            size++;
        }
    }
    
    public Node deleteNode(Node del){

        if (head == null || del == null)
            return null;

        if (head == del)
            head = del.next;

        if (del.next != null)
            del.next.prev = del.prev;

        if (del.prev != null)
            del.prev.next = del.next;
 
        del = null;
 
        return head;
    }
    public void deleteNodeAtSpecifiedPosition(int n)
    {

        if (head == null || n <= 0)
            return;
 
        Node current = head;
        int i;
        for (i = 1; current != null && i < n; i++)
        {
            current = current.next;
        }

        if (current == null)
            return;

        deleteNode(current);
    }

    public void showData() {

        Node current = head;

        if (head == null) {

            System.out.println("List is empty");
            return;
        }

        System.out.println("Nodes of doubly linked list: ");

        while (current != null) {
            System.out.print(current.data + "\n");
            current = current.next;
        }
    }

    public void countNodes() {
        int counter = 0;

        Node current = head;

        while (current != null) {

            counter++;
            current = current.next;
        }
        System.out.println("Number of nodes: " + counter);
    }
}

public class DoublyLinkedListMain {

    public static void main(String[] args) {
        DoublyLinkedList obj = new DoublyLinkedList();
        obj.addNewNode(3);
        obj.addNewNode(5);
        obj.addNewNode(90);
        obj.addNewNode(28);
        obj.addNewNode(37);
        obj.showData();
        obj.addNodeToSpecifiedPosition(3, 200);
        obj.showData();
        obj.deleteNodeAtSpecifiedPosition(4);
        obj.showData();
        obj.countNodes();
    }
}
