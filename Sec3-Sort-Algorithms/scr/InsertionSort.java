import java.util.Random;

public class InsertionSort {


    public static void insertionSortingV2(int[] intArray){
        //example array = {20, 35, -15, 7, 55, 1, -22}

        //assume the sorted position is at position 0
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            int idx;
            for(idx = firstUnsortedIndex; idx > 0 && intArray[idx - 1] > newElement; idx--){
                intArray[idx] = intArray[idx - 1];
            }

            intArray[idx] = newElement;
        }
    }


    /**
     * @param intArray unsorted int array
     * Purpose: sorting an integer array using the Selection sort algorithm
     */
    public static void insertionSortingV1(int[] intArray){
        //example array = {20, 35, -15, 7, 55, 1, -22}

        //assume the sorted position is at position 0
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            for(int idx = firstUnsortedIndex; idx > 0; idx--){
                if(intArray[idx] < intArray[idx - 1]){
                    swap(intArray, idx, idx - 1);
                }
                else{
                    break;
                }
                printIntArray(intArray);

            }
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

        int[] array = new int[9000];
        Random random = new Random();

        for (int i =0; i< array.length; i++)
        {
            array[i] = random.nextInt(9000)+1;
        }

        //printIntArray(array);
        insertionSortingV2(array);
        //insertionSortingV1(intArray);
        printIntArray(array);
    }
}
