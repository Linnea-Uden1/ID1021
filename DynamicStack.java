public class DynamicStack {
    int[] stack; 
    int top; 
    int size; 

    //Constructor
    public DynamicStack(int initialSize){
        this.size = initialSize;
        stack = new int[size];
        top = 0; 
    }

    public void resize(){
        int newSize = size*2;
        int[] newStack = new int[newSize];

        for(int i = 0; i < size; i++){
            newStack[i] = stack[i];
        }
        stack = newStack;  
        size = newSize;
    }

    public void push(int val){
        if (top >= size) {
            resize();
        }
        stack[top] = val;
        top++;
    }

    public int pop(){
        if (top <= 0) {
            System.out.println("Stack underflow");
            return -1;
        }
        top--;
        return stack[top]; 
    }

    public static void main(String[] args) {
        DynamicStack s = new DynamicStack(4);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);


        System.out.println("pop : "+ s.pop());
        System.out.println("pop : "+ s.pop());
        System.out.println("pop : "+ s.pop());
        System.out.println("pop : "+ s.pop());
        System.out.println("pop : "+ s.pop());

    }


    
    
}