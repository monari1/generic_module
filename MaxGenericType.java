public class MaxGenericType {
    public static void main(String[] args) {
        System.out.println( Max.max(1, 4));

    }
    public static < E extends Comparable <E>> E max(E o1, E o2){
        if (o1.compareTo(o2)>0)
            return o1;
        else
            return o2;
    }
}


