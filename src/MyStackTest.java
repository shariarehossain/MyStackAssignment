public class MyStackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);

        System.out.println(stack.top()); // 20
        stack.pop();
        System.out.println(stack.top()); // 10

        System.out.println(stack.getSize()); // 1
        System.out.println(stack.isEmpty()); // false
    }
}
