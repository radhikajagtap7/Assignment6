public class List {
    private Node head;

    public void add(int data) {
        Node n = new Node(data);
        if(head == null) {
            head = n;
        }
        Node n1 = head;
        while(n1.getNext() != null) {
            n1 = n1.getNext();
        }
        n1.setNext(n);
    }

    public void addFromFirst(int data) {
        Node n = new Node(data);
        n.setNext(head);
        head = n;

    }

    public void removeFromLast() {
        Node n = head;
        while(n.getNext().getNext() != null) {
            n = n.getNext();
        }
        n.setNext(null);
    }

    public void removeFromFirst() {
        if(head == null) {
            System.out.println("Link list is Empty");
            return;
        }
        head = head.getNext();
    }

    public void display() {
        Node showing = head;
        while(showing.getNext() != null) {
            System.out.println(showing.getData());
            showing = showing.getNext();
        }
    }

}

