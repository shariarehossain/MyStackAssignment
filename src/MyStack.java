import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> elements;

    public MyStack() {
        elements = new ArrayList<>();
    }

    public void push(int n) { elements.add(n); }

    public void pop() {
        if(!elements.isEmpty()) elements.remove(elements.size() - 1);
    }

    public int top() { return elements.get(elements.size() - 1); }

    public boolean isEmpty() { return elements.isEmpty(); }

    public int getSize() { return elements.size(); }
}