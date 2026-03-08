import java.util.ArrayList;

public class MyStack<T> {
    private ArrayList<T> elements;

    public MyStack() {
        elements = new ArrayList<>();
    }

    public void push(T obj) {
        elements.add(obj);
    }

    public void pop() {
        if (!elements.isEmpty())
            elements.remove(elements.size() - 1);
    }

    public T top() {
        if (!elements.isEmpty())
            return elements.get(elements.size() - 1);
        return null; // or throw exception
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int getSize() {
        return elements.size();
    }
}