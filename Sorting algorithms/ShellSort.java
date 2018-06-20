public class ShellSort {

    private void shellSort(int arr[]) {

        int n = arr.length;

        // Setting gap in the middle, then reducing gap until it's 1:
        for (int gap = n/2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i++) {

                int temp = arr[i];
                int j;

                for (j = i; (j >= gap) && (arr[j - gap] > temp); j = j - gap) {
                    arr[j] = arr[j - gap];
                }

                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args){

        ShellSort shell = new ShellSort();

        int[] array = {43, 623, 132, 6, 8, 3, 2, 1, 76, 24, 648, 12, 64, 125, 7, 23, 2431};
        shell.shellSort(array);

        System.out.println("\"ShellSorted\" array:");

        for(int i = 0; i < array.length; i++){

            System.out.print(array[i]);

            if(i != array.length - 1){
                System.out.print(", ");
            }
        }
    }
}
