/* LL is a class of 2 object - one is data and other is next block

there will be 2 pointer - 1 is head which is initaially at very first and store the address of data and 2nd is next pointer which stores the address of next listBlock

Last bloack is initaialized with null 

3 method to add a value in it  
    - adding value at very first position
    - adding value at any position in between first and last
    - adding value at very last
*/

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class linkedListImplementation {
    Node head; // by default null

    Node LastNode = head;

    void insert(int value) {
        Node n = new Node(value);
        if (head == null) {
            System.out.println("\nInserting element = " + value);
            LastNode = n;

        } else {
            while (LastNode.next != null) {
                LastNode = LastNode.next;
            }
            LastNode.next = n;
            System.out.println("\nInserting element = " + value);

        }
    }

    public static void main(String[] args) {
        linkedListImplementation l = new linkedListImplementation();
        l.insert(5);
        l.insert(4);
        l.insert(8);

    }
}
