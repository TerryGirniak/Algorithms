public class BubbleSort {

    private static void bubbleSort(int[] array){

        int temp;

        for(int i = 0; i < array.length; i++){

            for(int j = 1; j < array.length - i; j++){

                if(array[j-1] > array[j]){

                    // swapping elements:
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){

        int[] array = {10, 4, 152, 2, 5, 25, 7, 8, 34, 122, 76, 43, 7};
        bubbleSort(array);

        System.out.println("Array after sorting: ");
        for(int i = 0; i < array.length; i++){

            System.out.print(array[i]);

            if(i != (array.length - 1)){
                System.out.print(", ");
            }
        }
    }
}
