public class WildCardNeedDemo {
    public static void main(String[] args) {

    }

    public static double max(GenericStack<Number> stack){
        double max = stack.pop().doubleValue();
        while (!stack.isEmpty()){
            double value = stack.pop().doubleValue();
            if (value > max)
                max = value;
        }
        return max;

    }
}
