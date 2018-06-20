public class MergeSort {

    private void merge(int arr[], int low, int middle, int high) {

        // Find sizes of two sub arrays to be merged
        int lengthOne = middle - low + 1;
        int lengthTwo = high - middle;

        // Creating temp arrays:
        int LeftArray[] = new int [lengthOne];
        int RightArray[] = new int [lengthTwo];

        // Copy data to temp arrays:
        System.arraycopy(arr, low, LeftArray, 0, lengthOne);
        System.arraycopy(arr, (middle + 1), RightArray, 0, lengthTwo);

        // Initial indexes of first and second sub arrays
        int i = 0, j = 0;

        // Initial index of merged sub array
        int k = low;

        while (i < lengthOne && j < lengthTwo)
        {
            if (LeftArray[i] <= RightArray[j])
            {
                arr[k] = LeftArray[i];
                i++;
            }
            else
            {
                arr[k] = RightArray[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements of left array
        while (i < lengthOne)
        {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of right array
        while (j < lengthTwo)
        {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }

    private void mergeSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int middle = (low+high)/2;

            // Splitting array into 2 sub arrays:
            mergeSort(arr, low, middle);
            mergeSort(arr , middle + 1, high);

            // Merge sorted sub arrays:
            merge(arr, low, middle, high);
        }
    }

    public static void main(String[] args){

        MergeSort shell = new MergeSort();

        int[] array = {43, 623, 132, 6, 8, 3, 2, 1, 76, 24, 648, 12, 64, 125, 7, 23, 2431};
        shell.mergeSort(array, 0, array.length - 1);

        System.out.println("\"MergeSorted\" array:");

        for(int i = 0; i < array.length; i++){

            System.out.print(array[i]);

            if(i != array.length - 1){
                System.out.print(", ");
            }
        }
    }
}
