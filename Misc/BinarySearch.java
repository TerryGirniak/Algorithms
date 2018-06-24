import java.util.Arrays;

public class BinarySearch {

    private int binarySearch(int[] sortedArray, int key) {

        int index = Integer.MAX_VALUE;
        int low = 0;
        int high = sortedArray.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int[] array = {41, 64, 1, 643, 12, 675, 8, 23, 1, 2, 3, 6, 8, 56, 23, 462};
        Arrays.sort(array);

        for(int i = 0; i < array.length; i++){

            System.out.print(array[i]);

            if(i != array.length - 1){
                System.out.print(", ");
            }
        }

        System.out.println();

        BinarySearch bs = new BinarySearch();
        System.out.println("Searched element is at position " + (bs.binarySearch(array, 1) + 1) + ".");
    }
}
