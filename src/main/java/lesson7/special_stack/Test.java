package lesson7.special_stack;

public class Test {

    public static void main(String[] args) {

        SpecialStack stack = new SpecialStack();

        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.getMin());

        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(35);
        stack.push(40);
        stack.push(45);

        System.out.println(stack.getMin());
        System.out.println(stack.pop());
        System.out.println(stack.getMin());
        System.out.println(stack.getMin());
        System.out.println(stack.getMin());
        System.out.println(stack.getMin());
        System.out.println(stack.getMin());
    }
}
