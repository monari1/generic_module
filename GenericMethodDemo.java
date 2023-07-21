public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        String [] strings = {"London", "Paris", "Nairobi"};
        print(integers);
        print(strings);

    }

    public static <E> void print(E[] list){
        for (E e : list) {
            System.out.print(e);
            System.out.println();

        }
    }
}
