public class GenericSort {
    public static void main(String[] args) {
//        Integer [] integers = {new Integer(1), new Integer(3)};
//        Double [] doubles = {new Double(3.4), new Double(1.3)};
//        Character [] characers = {new Character('a'), new Character('z'), new Character('r')};
        String [] strings = {"Tom", "Andrew", "Chelsea", "Max"};
        Integer [] integers1 = {3, 5, 8, 0 , 90};



//        sort(integers);
//        sort(doubles);
//        sort(characers);
        sort(strings);
        sort(integers1);


        System.out.println("sort integer objects");
        printList(integers1);


    }
    public static <E extends Comparable<E>> void sort(E[] list){
        E currentMin;
        int currentMinIndex;
        for (int i = 0; i<list.length-1; i++){
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i+1; j<list.length;i++){
                if (currentMin.compareTo(list[j])>0)
                {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i){
                list[currentMinIndex]= list[i];
                list[i] = currentMin;
            }

        }
    }
    public  static  void printList(Object[] list){
        for (int i = 0; i< list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }


}
