package Exercise.Ex5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex5 {
    public static void main(String[] args) {
        String inputString = "Able was I ere I saw Elba";

        if (isPalindrome(inputString)) {
            System.out.println("Chuỗi là Palindrome.");
        } else {
            System.out.println("Chuỗi không phải là Palindrome.");
        }
    }

    public static boolean isPalindrome(String input) {
        // Chuyển đổi chuỗi thành chữ thường và loại bỏ khoảng trắng
        String processedInput = input.toLowerCase().replaceAll("\\s", "");

        // Tạo queue và stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Đưa từng ký tự vào queue và stack
        for (char ch : processedInput.toCharArray()) {
            queue.add(ch);
            stack.push(ch);
        }

        // So sánh từng cặp ký tự trong queue và stack
        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                return false; // Không phải là Palindrome
            }
        }

        return true; // Là Palindrome
    }
}
