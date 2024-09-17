public class Main {

    public static void main( String[] args ) {

        int[] array = {1, 5, 9, 8, 7, 5, 6, 4, 3, 1, 2, 8};
        int num = 7;
        selectionSort(array);


    }
        private static void selectionSort(int[] array) {
        int temp = 0;
        int min = 0;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j ++) {
                if (array[min] > array[j])
                    min = j;
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        for (int k : array)
            System.out.print(k + " ");
            System.out.println("");

        }
    }


    }


