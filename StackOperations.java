interface Stack {
    void push (int element);
    int pop ();
    boolean isEmpty ();
    int size ();
}

class FixedLengthStack implements Stack {
    private int[] stack;
    private int top;
    private int capacity;
    FixedLengthStack (int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        top = -1;
    }

    @Override
    public void push (int element) {
        if (top == capacity - 1) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = element;
    }

    @Override
    public int pop () {
        if (top == -1) {
            System.out.println("Cannot pop from empty stack");
            return -1;
        }
        return stack[top--];
    }

    @Override
    public boolean isEmpty () {
        return top == -1;
    }

    @Override
    public int size () {
        return top + 1;
    }
}

class DynamicLengthStack implements Stack {
    private int[] stack;
    private int top;
    private int capacity;

    DynamicLengthStack() {
        this.capacity = 2;
        this.stack = new int[capacity];
        this.top = -1;
    }

    @Override
    public void push (int element) {
        if (top == capacity - 1) {
            capacity = capacity * 2;
            int[] newStack = new int[capacity];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[++top] = element;
    }

    @Override
    public int pop () {
        return stack[top--];
    }

    @Override
    public boolean isEmpty () {
        return top == -1;
    }

    @Override
    public int size () {
        return top + 1;
    }
}

public class StackOperations {
    public static void PerformStackOperations(Stack s) {
        System.out.println("Stack size: " + s.size());
        s.push(10);
        System.out.println("Stack size: " + s.size());
        s.push(20);
        System.out.println("Stack size: " + s.size());
        s.push(30);
        System.out.println("Stack size: " + s.size());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Stack size: " + s.size());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Stack size: " + s.size());
        System.out.println("Is empty: " + s.isEmpty());
        System.out.println("Stack size: " + s.size());
        System.out.println("Popped element: " + s.pop());
        System.out.println("Stack size: " + s.size());
        System.out.println("Is empty: " + s.isEmpty());
    }

    public static void main(String[] args) {
        Stack fixedStack = new FixedLengthStack(5);
        System.out.println("Fixed stack operations");
        PerformStackOperations(fixedStack);
        System.out.println();
        System.out.println("Dynamic stack operations");
        Stack dynamicStack = new DynamicLengthStack();
        PerformStackOperations(dynamicStack);
    }
}


/* Output
Fixed stack operations
Stack size: 0
Stack size: 1
Stack size: 2
Stack size: 3
Popped element: 30
Stack size: 2
Popped element: 20
Stack size: 1
Is empty: false
Stack size: 1
Popped element: 10
Stack size: 0
Is empty: true

Dynamic stack operations
Stack size: 0
Stack size: 1
Stack size: 2
Stack size: 3
Popped element: 30
Stack size: 2
Popped element: 20
Stack size: 1
Is empty: false
Stack size: 1
Popped element: 10
Stack size: 0
Is empty: true
*/