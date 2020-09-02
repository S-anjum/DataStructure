public class LinkedList {
    //making a node here.
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //making global var for h and t.
    public Node head = null;
    public Node tail = null;

    //method to add a node.
    public void addingNode(int data) {
        Node newN = new Node(data);

        if(head == null) {
            head = newN;
            tail = newN;
        }
        else {
            tail.next = newN;
            tail = newN;
        }
    }

    //method do display the output.
    public void output() {
        Node current = head;
        if(head == null) {
            System.out.println("No list");
        }

        System.out.println("yep the list is empty, wanna check.");

        while(current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    //Calling the methods and Printing 'em.
    public static void main(String[] args) {
        LinkedList List = new LinkedList();

        List.addingNode(6);
        List.addingNode(7686);
        List.addingNode(678);
        List.addingNode(362481);
        List.addingNode(326);
        List.addingNode(96856);
        List.addingNode(789);
        List.addingNode(0);
        List.addingNode(186);

        List.output();
    }

}
