public class GenericSort {
    public static void main(String[] args) {
        Integer [] integers = {new Integer(1), Integer(3)};
        Double [] doubles = {new Double(3.4), new Double(1.3)};


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
