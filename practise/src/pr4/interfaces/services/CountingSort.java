package pr4.interfaces.services;

public class CountingSort {

    public static void sort(int[] arr) {

        int[] count = new int[11]; 
        for (int num : arr){
            count[num]++;
        }

        System.out.println("Sorted array: ");

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                System.out.print(i + " ");
                count[i]--;
            }

        }
    }
}