public class CountSort {

    private void countingSort(int[] array) {

        int maxValue = 0;

        // Finding the biggest number in the array:
        for (int anArray : array) {

            if (anArray > maxValue) {
                maxValue = anArray;
            }
        }

        // Creating an array for counting numbers:
        int numCounts[] = new int[maxValue + 1];

        // Recreating the array for counting:
        for (int num : array) {
            numCounts[num]++;
        }

        // Sorting final arrayL
        int currentSortedIndex = 0;

        for (int i = 0; i < numCounts.length; i++) {
            int count = numCounts[i];

            for (int j = 0; j < count; j++) {

                array[currentSortedIndex] = i;
                currentSortedIndex++;
            }
        }

    }

    public static void main(String[] args){

        CountSort count = new CountSort();

        int[] array = {43, 623, 132, 6, 8, 3, 2, 1, 76, 24, 648, 12, 64, 125, 7, 23, 2431};
        count.countingSort(array);

        System.out.println("\"CountSorted\" array:");

        for(int i = 0; i < array.length; i++){

            System.out.print(array[i]);

            if(i != array.length - 1){
                System.out.print(", ");
            }
        }
    }
}
