public class SelectionSort {
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        printList(list);
        selectionSort(list);
//        printList(list);
    }

    private static void printList(double[] list) {
        for (double number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;
            System.out.println("set 'currentMin' to " + list[i] + ", currentMinIndex to " + currentMinIndex);
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                    System.out.println("set 'currentMin' to " + list[j] + ", currentMinIndex to " + currentMinIndex);
                }
            }
            if (currentMinIndex != i) {
                System.out.println("Swap " + list[currentMinIndex] + " with " + list[i]);
                list[currentMinIndex] = list[i];
                list[i] = currentMin;

            }
            System.out.print("List after the '" + (i + 1) + "' sort: ");
            printList(list);
        }
    }
}
