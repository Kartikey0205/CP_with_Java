
/**
 * myStack
 */
class myStack {
    int arr[];
    int top;
    int capacity;

    myStack(int size) {
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    public void push(int element) {
        if (top + 1 < capacity) {
            arr[++top] = element;

            System.out.println();
            System.out.println("Adding element " + element);
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }

        } else {
            System.out.println();

            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            int ele = arr[top--];
            System.out.println();
            System.out.println("Popping element " + ele);

            if (top == -1) {
                System.out.println("Satck is empty now after popping");
            } else {

                for (int i = 0; i <= top; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

}

public class stackImplementation {
    public static void main(String[] args) {
        myStack s1 = new myStack(5);
        s1.push(3);
        s1.push(5);
        s1.push(7);
        s1.pop();
        s1.push(2);
        s1.push(1);
        s1.push(11);
        s1.pop();
        s1.push(12);
        s1.push(17);
        s1.pop();
        s1.push(19);

    }

}
