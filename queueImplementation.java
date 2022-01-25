/**
 * myQueue FIFO
 */
class myQueue {
    int arr[];
    int capacity;
    int front;
    int rear;
    int waitingQueue;

    myQueue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        waitingQueue = 0;
    }

    void enQueue(int element) {
        // checking whether queue is full or not
        if (waitingQueue == capacity) {
            System.out.println();
            System.out.println("Queue is full");
        } else {
            rear = (rear + 1) % capacity; // itis beacuse so that rear pointer again goes to at very first position
            arr[rear] = element;
            System.out.println();
            System.out.println("Adding element " + element);
            System.out.println("Queue is ");

            for (int i = 0; i < capacity; i++) {
                System.out.print(arr[i] + " ");

            }
            waitingQueue++;

        }
    }

    int deQueue() {
        // checking whether queue is empty or not
        if (waitingQueue == 0) {
            System.out.println();
            System.out.println("Queue is empty");
            return -1;
        } else {
            int servingElement = arr[front];
            arr[front] = 0; // setting dequee place to zero
            System.out.println();
            System.out.println(servingElement + " turns now and it is served");
            System.out.println("Queue becomes");
            for (int i = 0; i < capacity; i++) {
                System.out.print(arr[i] + " ");

            }
            front = (front + 1) % capacity;
            waitingQueue--;
            return servingElement;
        }
    }

    void frontPointerPeeek() {
        if (waitingQueue > 0) {
            System.out.println();
            System.out.println("Element to be served " + arr[front]);
        } else {
            System.out.println();
            System.out.println("Queue is empty");
        }
    }
}

public class queueImplementation {
    public static void main(String[] args) {

        myQueue que = new myQueue(5);
        que.frontPointerPeeek();

        que.enQueue(4);
        que.enQueue(9);
        que.frontPointerPeeek();

        que.deQueue();
        que.deQueue();
        que.enQueue(2);
        que.frontPointerPeeek();
        que.enQueue(9);
        que.enQueue(0);
        que.enQueue(1);
        que.enQueue(5);
        que.deQueue();
        que.deQueue();
        que.enQueue(8);
        que.enQueue(4);
        que.enQueue(98);
        que.enQueue(40);

    }
}
