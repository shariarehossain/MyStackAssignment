public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println(stack.top()); // 20
        stack.pop();
        System.out.println(stack.top()); // 10

        MyStack<String> s = new MyStack<>();
        s.push("Hello");
        s.push("World");
        System.out.println(s.top()); // World
    }
}