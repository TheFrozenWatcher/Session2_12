package Exercise.Ex13;

import java.util.Stack;

public class Ex13 {
    public static boolean isDecreasingSequence(String inputStr) {
        Stack<Character> stack = new Stack<>();

        // Bước 2: Đưa các ký tự của chuỗi vào stack
        for (char c : inputStr.toCharArray()) {
            stack.push(c);
        }

        // Bước 3: Khởi tạo biến flag
        boolean isDecreasing = true;

        // Bước 4: Duyệt qua từng ký tự trong chuỗi
        for (char c : inputStr.toCharArray()) {
            // Bước 4: So sánh với ký tự đầu tiên trong stack
            if (c > stack.peek()) {
                isDecreasing = false;
                break;
            }
        }

        return isDecreasing;
    }

    public static void main(String[] args) {
        // Kiểm tra
        String inputSequence = "54321"; // Đổi chuỗi này để kiểm tra các trường hợp khác
        boolean result = isDecreasingSequence(inputSequence);

        if (result) {
            System.out.println("Chuỗi là dãy giảm dần.");
        } else {
            System.out.println("Chuỗi không phải là dãy giảm dần.");
        }
    }
}
