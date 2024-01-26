package Exercise.Ex9;

import java.util.Stack;

public class Ex9 {
    private static void reverseArray(int[] array) {
        Stack<Integer> stack = new Stack<>();
        for (int value : array) {
            stack.push(value);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
    }

    private static String reverseString(String input) {
        Stack<String> wordStack = new Stack<>();
        StringBuilder output = new StringBuilder();

        // Tách từ trong chuỗi
        String[] words = input.split("\\s+");

        // Đưa từ vào Stack
        for (String word : words) {
            wordStack.push(word);
        }

        // Lấy từ ra từ Stack và nối vào chuỗi mới
        while (!wordStack.isEmpty()) {
            output.append(wordStack.pop()).append(" ");
        }

        return output.toString().trim();
    }
    public static void main(String[] args) {
        // Đảo ngược phần tử trong mảng số nguyên
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        System.out.println("Mảng sau khi đảo ngược:");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        // Đảo ngược chuỗi
        String inputString = "Hello, World!";
        String reversedString = reverseString(inputString);
        System.out.println("\nChuỗi sau khi đảo ngược: " + reversedString);
    }
}
