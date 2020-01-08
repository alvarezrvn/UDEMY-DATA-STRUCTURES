import org.jetbrains.annotations.NotNull;

public class BubbleSort {

    /**
     * @param intArray array of integers
     * Purpose: sort an array of integers using bubble sort algorithm
     * Best: O(n)    Average: O(n^2)    Worse: O(n^2)
     */
    public static void bubbleSort(@NotNull int[] intArray){
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int elem = 0; elem < lastUnsortedIndex; elem++){
                if(intArray[elem] > intArray[elem + 1]){
                    swap(intArray, elem, elem + 1);
                }
            }
        }
    }


    /**
     * @param intArray array of integers
     * @param idx1 first idx to compare
     * @param idx2 second idx to compare
     * Purpose: swap index values of an int array
     */
    public static void swap(int[] intArray, int idx1, int idx2){
        //if same index do nothing
        if(idx1 == idx2){
            return;
        }
        //swap values of indexes
        int temp = intArray[idx1];
        intArray[idx1] = intArray[idx2];
        intArray[idx2] = temp;

    }

    /**
     * @param array of integers that are printed to console
     */
    public static void printArray(@NotNull int[] array){
        for(int value: array){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        //initialize array
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        printArray(intArray);
        //perform bubble sort
        bubbleSort(intArray);
        //display results
        printArray(intArray);
    }
}
