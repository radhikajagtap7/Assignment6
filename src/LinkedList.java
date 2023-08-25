public class LinkedList {
    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node n1 = head;
        while(n1.getNext() != null) {
            n1 = n1.getNext();

        }
        n1.setNext(newNode);

    }

    public void addfromfirst(int data) {
        Node first = new Node(data);
        first.setNext(head);
        head = first;
    }

    public void addOnposition(int data, int position) {
        Node previous = head;
        for(int i = 1 ; i < position ; i++) {
            if(i+1 == position){
                previous.setData(data);
            }
            previous = previous.getNext();
        }
    }



    public void deleteFromPositon(int postion) {
        Node n2 = head;
        for(int i = 0 ; i < postion ; i++) {
            if(i == postion-1) {
                n2.setNext(n2.getNext().getNext());
                break;
            }
            n2 = n2.getNext();
        }
    }

    public void removeFromFirst() {
        if(head == null) {
            System.out.println("Empty Linkedlist ");
            return;
        }
        head = head.getNext();
    }

    public void deletefromlast() {
        Node n1 = head;
        while(n1.getNext().getNext() != null) {
            n1 = n1.getNext();

        }
        n1.setNext(null);

    }
    public void display() {
        Node Display = head;

        while(Display != null) {
            System.out.println(Display.getData());
            Display = Display.getNext();
        }
    }
}


