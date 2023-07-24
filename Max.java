public class Max {
    public static void main(String[] args) {
        System.out.println( Max.max(1, 4));

    }
    public static Comparable max(Comparable o1, Comparable o2){
        if (o1.compareTo(o2)>0)
            return o1;
        else
            return o2;
    }
}


