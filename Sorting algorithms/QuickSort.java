public class QuickSort {

    private int[] array;

    private void swap(int i, int j){

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void sort(int[] inputArray){

        if(inputArray == null || inputArray.length == 0){
            return;

        } else if(inputArray.length == 1){
            return;
        }

        this.array = inputArray;
        quickSort(0, array.length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex){

        int low = lowerIndex;
        int high = higherIndex;

        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];

        while (low <= high) {

            while (array[low] < pivot) {
                low++;
            }
            while (array[high] > pivot) {
                high--;
            }
            if (low <= high) {
                swap(low, high);

                low++;
                high--;
            }
        }

        if (lowerIndex < high) {
            quickSort(lowerIndex, high);
        }

        if (low < higherIndex){
            quickSort(low, higherIndex);
        }
    }

    public static void main(String[] args){

        int[] arr = {121, 3, 23, 432, 6, 2, 643, 12, 734, 7, 8, 4, 3, 23, 754};

        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);

        System.out.println("\"QuickSorted\" array:");

        for(int i = 0; i < arr.length; i++){

            System.out.print(arr[i]);

            if(i != arr.length - 1){
                System.out.print(", ");
            }
        }
    }
}
