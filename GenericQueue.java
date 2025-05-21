import java.util.Arrays;

public class GenericQueue<T> {
    T[] que;
    static int size;
    GenericQueue() {
        que = (T[]) new Object[2];
        size = 0;
    }

    void enqueue (T element) {
        if (size == que.length) {
            int newCapacity = que.length * 2;
            que = Arrays.copyOf(que, newCapacity);
        }
        que[size++] = element;
    }

    T dequeue () {
        if (size == 0) {
            System.out.println("Queue is empty");
        }
        T element = que[0];
        System.arraycopy(que, 1, que, 0, size - 1);
        que[--size] = null;
        return element;
    }

    void display () {
        for (T element: que) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        GenericQueue<Integer> integerQueue = new GenericQueue<Integer>();

        integerQueue.enqueue(10);
        integerQueue.enqueue(20);
        integerQueue.enqueue(30);

        System.out.println("Elements in queue are:");
        integerQueue.display();
        System.out.println("Dequeued element: " + integerQueue.dequeue());

        System.out.println("Queue size: " + (++size));
    }
}

/*
OUTPUT
Elements in queue are:
10
20
30
null
Dequeued element: 10
Queue size: 3
 */
