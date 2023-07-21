public class GenericImplementation {
    public static void main(String[] args) {
        GenericStack <String> stack1 = new GenericStack<>();
        stack1.push("London");
        stack1.push("Paris");
        stack1.push("Nairobi");

        System.out.println(stack1);

        stack1.pop();
        System.out.println(stack1);
    }
}
