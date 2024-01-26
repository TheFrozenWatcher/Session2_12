import java.util.Stack;

public class Ex11 {
    public static void main(String[] args) {
        int[] inputArray = {5, 3, 9, 2, 8, 4, 7, 11};

        int maxElement = findMaxElement(inputArray);
        System.out.println("Phần tử lớn nhất trong mảng là: " + maxElement);
    }

    private static int findMaxElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Mảng không hợp lệ");
        }

        Stack<Integer> stack = new Stack<>();

        for (int element : array) {
            if (stack.isEmpty() || element > stack.peek()) {
                stack.push(element);

            }

        }
        return stack.peek();

    }
}