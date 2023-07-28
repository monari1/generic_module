public class WildCardNeedDemo {
    public static void main(String[] args) {
            GenericStack<Integer> inStack = new GenericStack<>();
            inStack.push(1);
            inStack.push(2);
            inStack.push(-2);
        System.out.println("The max number is " + max(inStack));



    }

    public static double max(GenericStack<? extends Number> stack){
        double max = stack.pop().doubleValue();
        while (!stack.isEmpty()){
            double value = stack.pop().doubleValue();
            if (value > max)
                max = value;
        }
        return max;

    }
}
