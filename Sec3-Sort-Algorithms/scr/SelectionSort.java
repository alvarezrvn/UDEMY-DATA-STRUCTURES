public class SelectionSort {

    /**
     * @param intArray array of integers to be sorted
     * Purpose: sort and array of integers using the Selection Sort algorithm
     * Time Complexity: Best - O(n^2)   Average - O(n^2)    Worse - O(n^2)
     */
    public static void selectionSorting(int[] intArray){
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex-- ){
            int largestValueIndex = 0;
            for(int idx = 1; idx <= lastUnsortedIndex; idx++){
                if(intArray[idx] > intArray[largestValueIndex]){
                    largestValueIndex = idx;
                }
            }
            swap(intArray, largestValueIndex, lastUnsortedIndex);
        }
    }


    /**
     * @param array of integers
     * @param pos1 index with value 1
     * @param pos2 index with value 2
     */
    public static void swap (int[] array, int pos1, int pos2) {
        //if index positions are the same swap not needed
        if(pos1 == pos2){
            return;
        }
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }


    /**
     * @param array of integers
     * Purpose: Print elements within an array to console
     */
    public static void printIntArray(int[] array){
        for(int value: array){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] intArray = {20, 35, -15, 7, -22, 1, 55};
        printIntArray(intArray);
        selectionSorting(intArray);
        printIntArray(intArray);
    }
}
