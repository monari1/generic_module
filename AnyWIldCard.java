public class AnyWIldCard {
    public static void main(String[] args) {
        GenericStack<Integer> inStack = new GenericStack<>();
        inStack.push(1);
        inStack.push(2);
        inStack.push(-9);
        print(inStack);

    }

    public static  void print(GenericStack<?> stack){
        while (!stack.isEmpty())
            System.out.println(stack.pop() + "");
    }
}
