public class Queues {
    //all the var in a queue.
    int size = 5;
    int items[] = new int[size];
    int front, back;

    //constructors
    Queues() {
        front = -1;
        back = -1;
    }

    //check if it is full.
    boolean isFull() {
        if (front == 0 && back == size - 1) {
            return true;
        }
        return false;
    }

    //check if it is empty.
    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    //finally add element.
    void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (front == -1) {
                front = 0;
            }
            back++;
            items[back] = element;
            System.out.println("Added " + element);
        }
    }

    //or delete them.
    int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty, L L L L L Leave NOW");
            return (-1);
        }
        else {
            element = items[front];
            if (front >= back) {
                front = -1;
                back = -1;
            }
            else {
                front++;
            }
            System.out.println("Deleted element is " + element);
            return (element);
        }
    }

    //method to print them.
    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("It is an empty Queue");
        }
        else {
            System.out.println("\n Items are ");
            for (i = front; i <= back; i++)
                System.out.print(items[i] + "  ");
        }
    }

    //and finally print them.
    public static void main(String[] args) {
        Queues q = new Queues();

        q.enQueue(19787);
        q.enQueue(2312);
        q.enQueue(664);
        q.enQueue(0);
        q.enQueue(3667);

        q.display();

        q.deQueue();

        q.display();

    }
}