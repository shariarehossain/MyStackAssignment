public class MyStack {
    private int stackPointer;
    private int[] elements;

    public MyStack() {
        elements = new int[10];
        stackPointer = 0;
    }
    public void push(int n) {
        elements[stackPointer] = n;
        stackPointer++;
    }
    public void pop() {
        if(stackPointer > 0) stackPointer--;
    }
}
