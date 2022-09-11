public class Sorting {


    static void pyramid_sorting(int[] arr){
        int size = arr.length;
        for (int i = size / 2 - 1; i >= 0; i--){
            swapInSort(arr, size, i);
        }

        for (int i = size-1; i >=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            swapInSort(arr, i, 0);
        }
    }


    static void printArray(int[] arr){
        for (int i=0; i < arr.length; i++){
            if (i == arr.length - 1){
                System.out.printf("%d\n", arr[i]);
            }
            else{
                System.out.printf("%d, ", arr[i]);
            }
        }
    }


    static void swapInSort(int[] arr, int size, int root){
        int large = root;
        int rightIndex = root * 2 + 2;
        int leftIndex = root * 2 + 1;
        if (leftIndex < size){
            if (arr[large] < arr[leftIndex]){
                large = leftIndex;
            }
        }
        if (rightIndex < size){
            if (arr[large] < arr[rightIndex]){
                large = rightIndex;
            }
        }
        if (large != root){
            int temp = arr[root];
            arr[root] = arr[large];
            arr[large] = temp;
            swapInSort(arr, size, large);
        }
    }

 
    static void printGraph(int[] arr){
        int size = arr.length;
        for (int i = 0; i < size; i = i * 2 + 1){
            if (i * 2 >= size){
                for (int j = i; j < size; j++){
                    System.out.printf("%d, ", arr[j]);
                }
                System.out.printf("\n");
            }
            else{
                for (int j = i; j <= 2 * i; j++){
                    System.out.printf("%d, ", arr[j]);
                }
                System.out.printf("\n");
            }
        }
    }


    public static void main(String[] args) {
        int[] array = {4, 10, 3, 5, 1, 3, 5, 9, 3};
        int[] array2 = {4, 3, 5, 1, 9, 3};
        int[] array3 = {4, 10, 3, 15, 16, 5, 9, 231, 5, 1, 354, 5};

        printGraph(array);
        printArray(array);
        pyramid_sorting(array);
        printArray(array);
        System.out.printf("\n");

        printArray(array2);
        pyramid_sorting(array2);
        printArray(array2);
        System.out.printf("\n");


        printArray(array3);
        pyramid_sorting(array3);
        printArray(array3);
        System.out.printf("\n");
    }
}
