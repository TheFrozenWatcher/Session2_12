package Exercise.Ex12;

import java.util.LinkedList;
import java.util.Queue;

public class Ex12 {
    public static void main(String[] args) {
        int[] inputArray = {5, 3, 9, 2, 8, 4, 7};

        int minElement = findMinElement(inputArray);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + minElement);
    }

    private static int findMinElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Mảng không hợp lệ");
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int element : array) {
            queue.offer(element);
        }
        int minElement = Integer.MAX_VALUE;

        while (!queue.isEmpty()) {
            Integer currentElement = queue.poll();

            // Check for null to handle an empty queue
            if (currentElement != null) {
                minElement = Math.min(minElement, currentElement);
            }
        }

        return minElement;
    }


}
