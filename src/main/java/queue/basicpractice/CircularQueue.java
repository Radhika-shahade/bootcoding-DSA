package queue.basicpractice;

public class CircularQueue {
    //size of circular queue
    int size = 5;
    int front, rear;
    int arr[] = new int[size];

    CircularQueue() {
        front = -1;
        rear = -1;
    }

    //check if queue is full
    boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        return false;
    }

    // check if queue is empty
    boolean isEmpty() {
        if (front == -1) {
            return true;
        }
        return false;
    }

    public void enQueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                rear = 0;
                rear = (rear + 1) % size;
                arr[rear] = element;
                System.out.println("inserted" + element);
            }
        }

    }

    public int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            element = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            }
            //* Q has only one element, so we reset the queue after deleting it. */
            else {
                front = front + 1 % size;
            }
        }
        return element;
    }

    public void display() {
        //function to display status of circular queue
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
          }
        else {
            System.out.println("Front -> " + front);
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % size)
                System.out.print(arr[i] + " ");
            System.out.println(arr[i]);
            System.out.println("Rear -> " + rear);
        }


    }

    public static void main(String[] args) {
        CircularQueue obj = new CircularQueue();
        // fails because front=-1
//        obj.deQueue();

        obj.enQueue(10);
        obj.enQueue(20);
        obj.enQueue(55);
        obj.enQueue(66);
        obj.enQueue(34);
        obj.display();

        // Fails to enqueue because front == 0 && rear == SIZE - 1
//        obj.enQueue(6);


//
//        int elem = obj.deQueue();
//        while (elem != -1) {
//            System.out.println("Deleted Element is " + elem);
//        }
//        obj.display();
//        obj.enQueue(7);
//        obj.display();
    }
}
