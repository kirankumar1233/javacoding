package sort;

import java.util.Arrays;


public class Sorting {

    public static void main(String args[]) {
        // unsorted integer array
        int[] unsorted = {6, 5, 3, 1, 8, 7, 2, 4};
        System.out.println("Unsorted array :" + Arrays.toString(unsorted));
        Sorting algorithm = new Sorting();
        // sorting integer array using  algorithm
        algorithm.sort(unsorted);
        // printing sorted array
        System.out.println("Sorted array :" + Arrays.toString(unsorted));
    }

	private void sort(int[] unsorted) {
		// TODO Auto-generated method stub
		
	}
}
