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
    public int top() {
        return elements[stackPointer - 1];
    }
    public boolean isEmpty() {
        return stackPointer == 0;
    }
    public int getSize() {
        return stackPointer;
    }
}
