package chudalewski.piotr.shellsort;

public class Main {

    public static void main(String[] args) {


        int[] sortArray = {20, 35, -15, 7, 55, 1, -22 };

        for (int gap = sortArray.length / 2; gap > 0 ; gap/=2) {
            for(int i = gap; i < sortArray.length; i++) {
                int newElement = sortArray[i];
                int j = i;
                while( j >= gap && sortArray[j - gap] > newElement) {
                    sortArray[j] = sortArray[j-gap];
                    j -= gap;

                }
                sortArray[j] = newElement;
            }
        }

        for (int i = 0; i < sortArray.length; i++) System.out.println((i+1) + ". " + sortArray[i]);

    }
}
