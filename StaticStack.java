public class StaticStack {
    int[] stack;
    int top;
    int size;
     
    // Constructor
    public StaticStack(int size) {
        this.size = size;
        stack = new int[size];
        top = 0; // Initialize top to 0
    }

    public void push(int val) {
        if (top >= size) {
            System.out.println("Stack overflow");
            return;
        }
        stack[top] = val;
        top++;
    }

    public int pop() {
        if (top <= 0) {
            System.out.println("Stack underflow");
            return -1; // or throw an exception
        }
        top--;
        return stack[top];
    }

    public static void main(String[] args) {
        StaticStack s = new StaticStack(16); // Instantiate using new keyword
        s.push(32); // Test push
        s.push(33);
        s.push(34);

        System.out.println("pop : "+ s.pop());
        System.out.println("pop : "+ s.pop());
        System.out.println("pop : "+ s.pop());

        // System.out.println(s.pop()); // Test pop, should print 10
    }
}
